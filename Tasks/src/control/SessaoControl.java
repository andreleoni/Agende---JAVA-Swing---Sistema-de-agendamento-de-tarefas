package control;

public class SessaoControl {

    public static int idUsuarioLogado;
    public static String nomeUsuarioLogado;

    public int getIdUsuarioLogado() {
        return idUsuarioLogado;
    }

    public String getNomeUsuarioLogado() {
        return nomeUsuarioLogado;
    }

    public void setIdUsuarioLogado(int idUsuarioLogado, String nomeUsuarioLogado) {
        this.idUsuarioLogado = idUsuarioLogado;
        this.nomeUsuarioLogado = nomeUsuarioLogado;
    }

}
