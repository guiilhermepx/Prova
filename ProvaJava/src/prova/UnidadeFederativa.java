package prova;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sâo Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    public String nome;
    public String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }   
}
