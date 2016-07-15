package model;

public class TarefasModel {

    private int idtarefas;
    private String tarefa;
    private String descricao;
    private String datacriacao;
    private String dataencerramento;
    private String dataprevistaencerramento;
    private int qttempoconclusao;
    private int concluido; // concluido = 2, em andamento = 1, aberta = 0, pausa = 3
    private String id_usuario_responsavel;
    private String nomeusuariocriador;
    private int qttempoprevistoconclusao;

    private int jbuttonstatus;

    //Parametros de pesquisa
    private String pesquisar;

    //Getters and Setters
    

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getConcluido() {
        return concluido;
    }

    public void setConcluido(int concluido) {
        this.concluido = concluido;
    }

    public String getNomeusuariocriador() {
        return nomeusuariocriador;
    }

    public void setNomeusuariocriador(String nomeusuariocriador) {
        this.nomeusuariocriador = nomeusuariocriador;
    }

    /**
     * @return the pesquisar
     */
    public String getPesquisar() {
        return pesquisar;
    }

    /**
     * @param pesquisar the pesquisar to set
     */
    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }

    /**
     * @return the jbuttonstatus
     */
    public int getJbuttonstatus() {
        return jbuttonstatus;
    }

    /**
     * @param jbuttonstatus the jbuttonstatus to set
     */
    public void setJbuttonstatus(int jbuttonstatus) {
        this.jbuttonstatus = jbuttonstatus;
    }

    /**
     * @return the id_usuario_responsavel
     */
    public String getId_usuario_responsavel() {
        return id_usuario_responsavel;
    }

    /**
     * @param id_usuario_responsavel the id_usuario_responsavel to set
     */
    public void setId_usuario_responsavel(String id_usuario_responsavel) {
        this.id_usuario_responsavel = id_usuario_responsavel;
    }

    public void id_usuario_responsavel(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the dataencerramento
     */
    public String getDataencerramento() {
        return dataencerramento;
    }

    /**
     * @param dataencerramento the dataencerramento to set
     */
    public void setDataencerramento(String dataencerramento) {
        this.dataencerramento = dataencerramento;
    }

    /**
     * @return the datacriacao
     */
    public String getDatacriacao() {
        return datacriacao;
    }

    /**
     * @param datacriacao the datacriacao to set
     */
    public void setDatacriacao(String datacriacao) {
        this.datacriacao = datacriacao;
    }

    /**
     * @return the dataprevistaencerramento
     */
    public String getDataprevistaencerramento() {
        return dataprevistaencerramento;
    }

    /**
     * @param dataprevistaencerramento the dataprevistaencerramento to set
     */
    public void setDataprevistaencerramento(String dataprevistaencerramento) {
        this.dataprevistaencerramento = dataprevistaencerramento;
    }

    /**
     * @return the qttempoconclusao
     */
    public int getQttempoconclusao() {
        return qttempoconclusao;
    }

    /**
     * @param qttempoconclusao the qttempoconclusao to set
     */
    public void setQttempoconclusao(int qttempoconclusao) {
        this.qttempoconclusao = qttempoconclusao;
    }

    /**
     * @return the idtarefas
     */
    public int getIdtarefas() {
        return idtarefas;
    }

    /**
     * @param idtarefas the idtarefas to set
     */
    public void setIdtarefas(int idtarefas) {
        this.idtarefas = idtarefas;
    }

    /**
     * @return the qttempoprevistoconclusao
     */
    public int getQttempoprevistoconclusao() {
        return qttempoprevistoconclusao;
    }

    /**
     * @param qttempoprevistoconclusao the qttempoprevistoconclusao to set
     */
    public void setQttempoprevistoconclusao(int qttempoprevistoconclusao) {
        this.qttempoprevistoconclusao = qttempoprevistoconclusao;
    }
}
