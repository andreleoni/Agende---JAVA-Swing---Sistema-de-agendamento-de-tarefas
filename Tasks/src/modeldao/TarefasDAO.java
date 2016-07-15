package modeldao;

import control.*;
import model.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class TarefasDAO {

    ConexaoDB conexaodb = new ConexaoDB();
    TarefasModel tarefasmodel = new TarefasModel();
    SessaoControl sessaocontrol = new SessaoControl();
    RelatoriosDAO relatoriosdao = new RelatoriosDAO();

    int codigoResponsavel;

    public int buscaResponsavelTarefa(String nome) {
        conexaodb.conexao();
        conexaodb.executasql("SELECT * FROM usuarios where nome='" + nome + "'");
        try {
            conexaodb.rs.first();
            codigoResponsavel = conexaodb.rs.getInt("id_usuarios");

        } catch (SQLException ex) {

        }
        conexaodb.desconexao();
        return codigoResponsavel;
    }

    public String buscaResponsavelTarefaPeloID(int id) {
        String nomeresponsavel = null;
        conexaodb.conexao();
        conexaodb.executasql("SELECT * FROM usuarios where id_usuarios='" + id + "'");
        try {
            conexaodb.rs.first();
            nomeresponsavel = conexaodb.rs.getString("nome");

        } catch (SQLException ex) {

        }
        conexaodb.desconexao();
        return nomeresponsavel;
    }

    public void iniciarAtividadeTarefa(TarefasModel mod) {
        conexaodb.conexao();
        try {
            String sql = "update tarefas set concluido=1 where id_tarefas=?";
            PreparedStatement pst = conexaodb.con.prepareStatement(sql);
            pst.setInt(1, mod.getIdtarefas());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Atividade em andamento!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração de Dados: \n" + ex);
        }
        conexaodb.desconexao();

    }

    public void novaTarefa(TarefasModel mod) {

        buscaResponsavelTarefa(tarefasmodel.getId_usuario_responsavel());
        conexaodb.conexao();
        try {
            PreparedStatement pst = conexaodb.con.prepareStatement("INSERT INTO tarefas(tarefa,descricao,datacriacao,dataprevistaencerramento,dataencerramento,qttempoprevistoconclusao,concluido,id_usuario_responsavel,nomeusuariocriador) values (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getTarefa().trim());
            pst.setString(2, mod.getDescricao().trim());
            pst.setString(3, mod.getDatacriacao());
            pst.setString(4, mod.getDataencerramento());
            pst.setString(5, mod.getDataprevistaencerramento());
            pst.setInt(6, mod.getQttempoprevistoconclusao());
            pst.setInt(7, mod.getConcluido());
            pst.setInt(8, buscaResponsavelTarefa(mod.getId_usuario_responsavel()));
            pst.setString(9, sessaocontrol.getNomeUsuarioLogado().trim());

            //Debug linha SQL
            //JOptionPane.showMessageDialog(null, pst);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Dados: \n" + ex);
        }
        conexaodb.desconexao();
        //tarefasview.preencherTabelaTarefas("select * from tarefas order by datacriacao");
    }

    public TarefasModel pesquisarTarefas(TarefasModel mod) {
        conexaodb.conexao();
        conexaodb.executasql("select * from tarefas where lower(nome) like '%" + mod.getPesquisar().toLowerCase() + "%' order by datacriacao desc");

        try {
            conexaodb.rs.first();
            mod.setTarefa(conexaodb.rs.getString("tarefa"));
            mod.setDescricao(conexaodb.rs.getString("descricao"));
            mod.setDatacriacao(conexaodb.rs.getString("datacriacao"));
            mod.setDataencerramento(conexaodb.rs.getString("dataprevistaencerramento"));
            mod.setDataprevistaencerramento(conexaodb.rs.getString("dataencerramento"));
            mod.setQttempoconclusao(conexaodb.rs.getInt("qttempoprevistoconclusao"));
            mod.setConcluido(conexaodb.rs.getInt("concluido"));
            mod.setId_usuario_responsavel(conexaodb.rs.getString("id_usuario_responsavel"));
            mod.setNomeusuariocriador(conexaodb.rs.getString("nomeusuariocriador"));

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao pesquisar Usuários: \n"+ex);
        }

        conexaodb.desconexao();
        return mod;
    }

    public void editarTarefa(TarefasModel mod) {
        conexaodb.conexao();
        try {
            String sql = "update tarefas set tarefa=?,descricao=?,dataprevistaencerramento=?,qttempoprevistoconclusao=?,id_usuario_responsavel=? where id_tarefas=?";
            PreparedStatement pst = conexaodb.con.prepareStatement(sql);
            pst.setString(1, mod.getTarefa());
            pst.setString(2, mod.getDescricao());
            pst.setString(3, mod.getDataprevistaencerramento());
            pst.setInt(4, mod.getQttempoprevistoconclusao());
            pst.setInt(5, buscaResponsavelTarefa(mod.getId_usuario_responsavel()));
            pst.setInt(6, mod.getIdtarefas());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração de Dados: \n" + ex);
        }
        conexaodb.desconexao();
    }

    public void excluirTarefas(TarefasModel mod) {
        conexaodb.conexao();

        try {
            String sql = "delete from tarefas where id_tarefas=?";
            PreparedStatement pst = conexaodb.con.prepareStatement(sql);
            pst.setInt(1, mod.getIdtarefas());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Tarefa Excluida com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a exclusão da Tarefa: \n" + ex);
        }

        conexaodb.desconexao();
    }

    public void encerrarTarefa(TarefasModel mod) {
        conexaodb.conexao();
        try {
            String sql = "update tarefas set qttempoconclusao=?,descricao=?,dataencerramento=?,concluido=? where id_tarefas=?";
            PreparedStatement pst = conexaodb.con.prepareStatement(sql);

            pst.setInt(1, mod.getQttempoconclusao());
            pst.setString(2, mod.getDescricao());
            pst.setString(3, mod.getDataencerramento());
            pst.setInt(4, mod.getConcluido());
            pst.setInt(5, mod.getIdtarefas());
            pst.execute();

            conexaodb.executasql("select * from tarefas where id_tarefas=" + mod.getIdtarefas());
            conexaodb.rs.first();

            double resultado = relatoriosdao.porcentagem(conexaodb.rs.getInt("qttempoconclusao"), conexaodb.rs.getInt("qttempoprevistoconclusao"));

            JOptionPane.showMessageDialog(null, "Atividade finalizada com sucesso \n com " + resultado + "% de desvio do tempo previsto");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível finalizar a atividade! \n" + ex);
        }

        conexaodb.desconexao();
    }

    public void pausarRetomarAtividade(PausasTarefasModel mod) {
        conexaodb.conexao();
        try {
            String sqlUpdate = "update tarefas set concluido=? where id_tarefas=?";
            PreparedStatement pstUpdate = conexaodb.con.prepareStatement(sqlUpdate);
            pstUpdate.setInt(1, mod.getStatus_pausa());
            pstUpdate.setInt(2, mod.getIdtarefapausa());
            pstUpdate.execute();

            String sqlInsert = "insert into pausas_tarefas(data_pausa,hora_pausa,id_tarefa_pausa,status_pausa) values (?,?,?,?)";
            PreparedStatement pstInserir = conexaodb.con.prepareStatement(sqlInsert);
            pstInserir.setString(1, mod.getData_pausa());
            pstInserir.setString(2, mod.getHora_pausa());
            pstInserir.setInt(3, mod.getIdtarefapausa());
            pstInserir.setInt(4, mod.getStatus_pausa());

            pstInserir.execute();

            conexaodb.rs.first();

            JOptionPane.showMessageDialog(null, "Status da atividade alterado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível finalizar a atividade! \n" + ex);
        }
        conexaodb.desconexao();
    }

}
