package control;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

public class ConexaoDB {

    public Statement stm;
    public ResultSet rs;
    public Connection con;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/agende";
    private String usuario = "postgres";
    private String senha = "postgres";

    public void conexao() {

        try {
            System.setProperty("jdbc", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null,"Conexao Efetuada com Sucesso!");
        } catch (SQLException ex) {
            //Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com banco de Dados: \n" + ex.getMessage());
        }
    }

    public void executasql(String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            //JOptionPane.showMessageDialog(null,"Consulta Efetuada com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar a consulta: \n" + ex.getMessage());
        }
    }

    public void desconexao() {
        try {
            con.close();
            //JOptionPane.showMessageDialog(null,"Banco desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao com banco de Dados: \n" + ex.getMessage());
        }
    }

    public void executaSql(String Sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
