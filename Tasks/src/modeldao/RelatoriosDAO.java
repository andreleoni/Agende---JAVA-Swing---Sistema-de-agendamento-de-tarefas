package modeldao;

import javax.swing.JOptionPane;
import model.RelatoriosModel;

public class RelatoriosDAO {

    RelatoriosModel relatoriosmodel = new RelatoriosModel();

    public double porcentagem(int qttempoefetivo, int qttempoprevisto) {
        double resultado;

        if (qttempoprevisto < qttempoefetivo) {
            int aux;
            aux = qttempoprevisto;
            qttempoprevisto = qttempoefetivo;
            qttempoefetivo = aux;
        }
        resultado = ((qttempoefetivo - qttempoprevisto) / qttempoefetivo) * 100;
        return resultado;

    }

    public String formatarData(String data) {
        String string = data;
        if (data == null) {
            return "";
        } else {
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder.insert(string.length() - 4, '/');
            stringBuilder.insert(string.length() - 6, '/');
            return stringBuilder.toString();
        }
    }

    public String formatarHora(String hora) {
        String string = hora;
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.insert(string.length() - 2, ':');
        return stringBuilder.toString();
    }

    public String campoPesquisarTarefas(RelatoriosModel mod) {

        String sqlIntroducao = "Select * from tarefas ";

        //Status da Tarefa
        String sqlStatus = "";
        if (mod.getRadiobuttonStatus() == 0) {
            //em aberto
            sqlStatus = "concluido=" + mod.getRadiobuttonStatus();
        } else if (mod.getRadiobuttonStatus() == 1) {
            //em andamento
            sqlStatus = "concluido=" + mod.getRadiobuttonStatus();
        } else if (mod.getRadiobuttonStatus() == 2) {
            //concluida
            sqlStatus = "concluido=" + mod.getRadiobuttonStatus();
        } else if (mod.getRadiobuttonStatus() == 3) {
            //pausa
            sqlStatus = "concluido=" + mod.getRadiobuttonStatus();
        } else if (mod.getRadiobuttonStatus() == 4) {
            //todas
            sqlStatus = "tarefa like '%%'";
        }

        //Ordem
        String sqlOrdem = "";
        if (mod.getOrderby() == 1) {
            //crescente
            sqlOrdem = " order by dataprevistaencerramento asc";
        } else if (mod.getOrderby() == 2) {
            //decrescente
            sqlOrdem = " order by dataprevistaencerramento desc";
        }

        //Pesquisa por responsável
        String sqlResponsavel = "";
        if (mod.getComboBoxresponsavel() != 0) {
            //String sql6 = "Select * from tarefas where id_usuario_responsavel=" + mod.getComboBoxresponsavel();
            sqlResponsavel = "id_usuario_responsavel=" + mod.getComboBoxresponsavel() + "";
        } else if (mod.getComboBoxresponsavel() == 0) {
            sqlResponsavel = "tarefa like '%%'";
        }

        //Campo Pesquisar tarefa ou descrição
        String sqlCampoPesquisar = "";
        if (mod.getTfPesquisar() != null) {
            if ((mod.getCheckboxDescricao() == 1) && (mod.getCheckboxTarefa() == 1)) {
                sqlCampoPesquisar = "((lower(descricao) like '%" + mod.getTfPesquisar() + "%') or (lower(tarefa) like '%" + mod.getTfPesquisar() + "%'))";
            } else if ((mod.getCheckboxDescricao() == 1) && (mod.getCheckboxTarefa() == 0)) {
                sqlCampoPesquisar = "lower(descricao) like '%" + mod.getTfPesquisar() + "%'";
            } else if ((mod.getCheckboxDescricao() == 0) && (mod.getCheckboxTarefa() == 1)) {
                sqlCampoPesquisar = "lower(tarefa) like '%" + mod.getTfPesquisar() + "%'";
            } else {
                sqlCampoPesquisar = "tarefa like '%%'";
            }
        }

        //Data Inicial e Data Final
        String sqlDatas = "";
        if ((mod.getDateDatainicial() == "") && (mod.getDateDatafinal() == "")) {
            sqlDatas = "tarefa like '%%'";
        } else if ((mod.getDateDatainicial() != "") && (mod.getDateDatafinal() == "")) {
            sqlDatas = "dataprevistaencerramento >= '" + mod.getDateDatainicial() + "'";
        } else if ((mod.getDateDatainicial() == "") && (mod.getDateDatafinal() != "")) {
            sqlDatas = "dataprevistaencerramento <= '" + mod.getDateDatafinal() + "'";
        } else {
            sqlDatas = "dataprevistaencerramento between '" + mod.getDateDatainicial() + "' and '" + mod.getDateDatafinal() + "'";
        }
        
        //Case insensitive - lower(nome) like '%" + mod.getPesquisa().toLowerCase()
        String query = sqlIntroducao + " where (" + sqlCampoPesquisar.toLowerCase() + ") AND (" + sqlStatus + ") AND (" + sqlDatas + ") AND (" + sqlResponsavel + ") " + sqlOrdem;

        //Debug variavel query
        //JOptionPane.showMessageDialog(null, query);
        //System.out.println(query);
        return query;
    }

    public String comboboxTempoDBparaUser(String tempDB) {

        String tempoAtividade;
        switch (tempDB) {
            case "15":
                tempoAtividade = "00:15";
                break;
            case "30":
                tempoAtividade = "00:30";
                break;
            case "45":
                tempoAtividade = "00:45";
                break;
            case "60":
                tempoAtividade = "01:00";
                break;
            case "90":
                tempoAtividade = "01:30";
                break;
            case "120":
                tempoAtividade = "02:00";
                break;
            case "150":
                tempoAtividade = "02:30";
                break;
            case "180":
                tempoAtividade = "03:00";
                break;
            case "210":
                tempoAtividade = "03:30";
                break;
            case "240":
                tempoAtividade = "04:00";
                break;
            case "270":
                tempoAtividade = "04:30";
                break;
            case "300":
                tempoAtividade = "05:00";
                break;
            case "330":
                tempoAtividade = "05:30";
                break;
            case "360":
                tempoAtividade = "06:00";
                break;
            case "420":
                tempoAtividade = "07:00";
                break;
            case "08:00":
                tempoAtividade = "08:00";
                break;
            default:
                tempoAtividade = "O dia todo";
        }
        return tempoAtividade;
    }

    public int comboboxTempoUserparaDB(String tempDB) {
        int tempoAtividade;
        switch (tempDB) {
            case "00:15":
                tempoAtividade = 15;
                break;
            case "00:30":
                tempoAtividade = 30;
                break;
            case "00:45":
                tempoAtividade = 45;
                break;
            case "01:00":
                tempoAtividade = 60;
                break;
            case "01:30":
                tempoAtividade = 90;
                break;
            case "02:00":
                tempoAtividade = 120;
                break;
            case "02:30":
                tempoAtividade = 150;
                break;
            case "03:00":
                tempoAtividade = 180;
                break;
            case "03:30":
                tempoAtividade = 210;
                break;
            case "04:00":
                tempoAtividade = 240;
                break;
            case "04:30":
                tempoAtividade = 270;
                break;
            case "05:00":
                tempoAtividade = 300;
                break;
            case "05:30":
                tempoAtividade = 330;
                break;
            case "06:00":
                tempoAtividade = 360;
                break;
            case "07:00":
                tempoAtividade = 420;
                break;
            case "08:00":
                tempoAtividade = 480;
                break;
            default:
                tempoAtividade = 1440;
        }
        return tempoAtividade;
    }

    public String statusConcluidoCaracter(int status) {
        String statusString = "";
        if (status == 0) {
            statusString = "Aberto";
        } else if (status == 1) {
            statusString = "Em Andamento";
        } else if (status == 2) {
            statusString = "Concluido";
        } else if (status == 3) {
            statusString = "Pausa";
        }
        return statusString;
    }

}
