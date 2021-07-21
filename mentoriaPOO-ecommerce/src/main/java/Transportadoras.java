public class Transportadoras {
    private final  String identificacao;
    private final  String nomeTransportadora;
    private final  int tipoCarga;
    private final  String telefoneTransportadora;
    private final  String email;

    public Transportadoras(final String identificacao, final String nomeTransportadora, final int tipoCarga, final String telefoneTransportadora, final String email) {
        this.identificacao = identificacao;
        this.nomeTransportadora = nomeTransportadora;
        this.tipoCarga = tipoCarga;
        this.telefoneTransportadora = telefoneTransportadora;
        this.email = email;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public String getNomeTransportadora() {
        return nomeTransportadora;
    }

    public int getTipoCarga() {
        return tipoCarga;
    }

    public String getTelefoneTransportadora() {
        return telefoneTransportadora;
    }

    public String getEmail() {
        return email;
    }
}
