package prova;

public enum Genero {
    MASCULINO('M', "Masculino"),
    FEMININO('F',  "Feminino");
    
    public char caractere;
    public String texto;

    private Genero(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
}
