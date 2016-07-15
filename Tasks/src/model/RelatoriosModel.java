package model;

import java.sql.Date;

public class RelatoriosModel {

    /*jTextFieldCampoPesquisar 
    jCheckBoxNomeTarefaPesquisar
    jCheckBoxDescricaoTarefaPesquisar 
    jDateChooserDataInicialPesquisar
    jDateChooserDataFinalPesquisar
    jComboBoxResposavelPesquisar
    jRadioButtonConcluidasPesquisar
    jRadioButtonEmAndamentoPesquisar
    jRadioButtonTodas*/
    
    private String tfPesquisar;
    private int checkboxTarefa; //0 - nao selecionado, 1 = selecionado
    private int checkboxDescricao; //0 - nao selecionado, 1 = selecionado
    private String dateDatainicial;
    private String dateDatafinal;
    private int comboBoxresponsavel; //0 = todos
    private int radiobuttonStatus; //1 = Concluido, 0 = Em Andamento, 2 = Todas
    private int orderby; //1 = crescente, 2 = decrescente

    //where descricao='%tfpesquisar%' or  tarefa='%tfpesquisar%
    
    
    public String getTfPesquisar() {
        return tfPesquisar;
    }

    public void setTfPesquisar(String tfPesquisar) {
        this.tfPesquisar = tfPesquisar;
    }

    public int getCheckboxTarefa() {
        return checkboxTarefa;
    }

    public void setCheckboxTarefa(int checkboxTarefa) {
        this.checkboxTarefa = checkboxTarefa;
    }

    public int getCheckboxDescricao() {
        return checkboxDescricao;
    }

    public void setCheckboxDescricao(int checkboxDescricao) {
        this.checkboxDescricao = checkboxDescricao;
    }

    public int getComboBoxresponsavel() {
        return comboBoxresponsavel;
    }

    public void setComboBoxresponsavel(int comboBoxresponsável) {
        this.comboBoxresponsavel = comboBoxresponsável;
    }

    public int getRadiobuttonStatus() {
        return radiobuttonStatus;
    }

    public void setRadiobuttonStatus(int radiobuttonStatus) {
        this.radiobuttonStatus = radiobuttonStatus;
    }

    public String getDateDatainicial() {
        return dateDatainicial;
    }

    public void setDateDatainicial(String dateDatainicial) {
        this.dateDatainicial = dateDatainicial;
    }

    public String getDateDatafinal() {
        return dateDatafinal;
    }

    public void setDateDatafinal(String dateDatafinal) {
        this.dateDatafinal = dateDatafinal;
    }

    /**
     * @return the orderby
     */
    public int getOrderby() {
        return orderby;
    }

    /**
     * @param orderby the orderby to set
     */
    public void setOrderby(int orderby) {
        this.orderby = orderby;
    }
    
}
