package model;

public class UsuariosModel {

    private int idusuarios = 0;
    private String nome;
    private String email;
    private String senha;
    private String usuario;

    //Parametros de Pesquisa
    String pesquisa;

    //Getters and Setters
    public String getNome() {
        return nome.trim();
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email.trim();
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha.trim();
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario.trim();
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa.trim();
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the idusuarios
     */
    public int getIdusuarios() {
        return idusuarios;
    }

    /**
     * @param idusuarios the idusuarios to set
     */
    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

}
