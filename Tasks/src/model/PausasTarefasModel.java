package model;


public class PausasTarefasModel {
    
    private int idpausas;
    private String data_pausa;
    private String hora_pausa;
    private int idtarefapausa;
    private int status_pausa; //1 = pausou, 2 = retomou atividades

    /**
     * @return the idpausas
     */
    public int getIdpausas() {
        return idpausas;
    }

    /**
     * @param idpausas the idpausas to set
     */
    public void setIdpausas(int idpausas) {
        this.idpausas = idpausas;
    }

    /**
     * @return the data_pausa
     */
    public String getData_pausa() {
        return data_pausa;
    }

    /**
     * @param data_pausa the data_pausa to set
     */
    public void setData_pausa(String data_pausa) {
        this.data_pausa = data_pausa;
    }

    /**
     * @return the hora_pausa
     */
    public String getHora_pausa() {
        return hora_pausa;
    }

    /**
     * @param hora_pausa the hora_pausa to set
     */
    public void setHora_pausa(String hora_pausa) {
        this.hora_pausa = hora_pausa;
    }

    /**
     * @return the idtarefapausa
     */
    public int getIdtarefapausa() {
        return idtarefapausa;
    }

    /**
     * @param idtarefapausa the idtarefapausa to set
     */
    public void setIdtarefapausa(int idtarefapausa) {
        this.idtarefapausa = idtarefapausa;
    }

    /**
     * @return the status_pausa
     */
    public int getStatus_pausa() {
        return status_pausa;
    }

    /**
     * @param status_pausa the status_pausa to set
     */
    public void setStatus_pausa(int status_pausa) {
        this.status_pausa = status_pausa;
    }
    
    
}
