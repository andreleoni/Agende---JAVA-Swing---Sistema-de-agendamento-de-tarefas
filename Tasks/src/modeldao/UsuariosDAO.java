package modeldao;

import control.ConexaoDB;
import java.sql.*;
import javax.swing.JOptionPane;
import model.UsuariosModel;

public class UsuariosDAO {

    ConexaoDB conexaodb = new ConexaoDB();
    UsuariosModel usuariosmodel = new UsuariosModel();

    public void salvar(UsuariosModel mod) {
        conexaodb.conexao();
        try {
            PreparedStatement pst = conexaodb.con.prepareStatement("INSERT INTO usuarios(nome,email,senha,usuario) values (?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEmail());
            pst.setString(3, mod.getSenha());
            pst.setString(4, mod.getUsuario());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Dados: \n" + ex);
        }

        conexaodb.desconexao();
    }

    public UsuariosModel pesquisarUsuarios(UsuariosModel mod) {
        conexaodb.conexao();
        conexaodb.executasql("select * from usuarios where lower(nome) like '%" + mod.getPesquisa().toLowerCase() + "%' order by nome");

        try {
            conexaodb.rs.first();
            mod.setNome(conexaodb.rs.getString("nome"));
            mod.setEmail(conexaodb.rs.getString("email"));
            mod.setSenha(conexaodb.rs.getString("senha"));
            mod.setIdusuarios(conexaodb.rs.getInt("id_usuarios"));
            mod.setUsuario(conexaodb.rs.getString("usuario"));

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao pesquisar Usuários: \n"+ex);
        }

        conexaodb.desconexao();
        return mod;
    }

    public void editarUsuario(UsuariosModel mod) {
        conexaodb.conexao();
        try {
            String sql = "update usuarios set nome=?,senha=?,email=?,usuario=? where id_usuarios=?";
            PreparedStatement pst = conexaodb.con.prepareStatement(sql);
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getEmail());
            pst.setString(4, mod.getUsuario());
            pst.setInt(5, mod.getIdusuarios());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração de Dados: \n" + ex);
        }
        conexaodb.desconexao();
    }

    public void excluirUsuario(UsuariosModel mod) {
        conexaodb.conexao();

        try {
            String sql = "delete from usuarios where id_usuarios=?";
            PreparedStatement pst = conexaodb.con.prepareStatement(sql);
            pst.setInt(1, mod.getIdusuarios());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário Excluido com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a exclusão: \n" + ex);
        }

        conexaodb.desconexao();
        this.resetarUsuario(mod);
    }

    public void resetarUsuario(UsuariosModel mod) {
        mod.setNome("");
        mod.setEmail("");
        mod.setSenha("");
        mod.setIdusuarios(0);
        mod.setUsuario("");
    }

    public void resetarSenha(int idusuario, String novasenha) {
        conexaodb.conexao();

        //Mensagem debug
        //JOptionPane.showMessageDialog(null, idusuario + "|" + novasenha);
        try {
            String sql = "update usuarios set senha=? where id_usuarios=?";
            PreparedStatement pst = conexaodb.con.prepareStatement(sql);
            pst.setString(1, novasenha);
            pst.setInt(2, idusuario);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Senha Alterada com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração de Dados: \n" + ex);
        }
        conexaodb.desconexao();
    }
}
