package Classe;
public class Atributos {
    // ATRIBUTOS
    String termoNome;
    String significado;

    // CONSTRUTOR
    public Atributos(String termoNome, String significado) {
        this.termoNome = termoNome;
        this.significado = significado;
    }
    public Atributos() {
    }
    
    // GET E SET
    public String getTermoNome() {
        return termoNome;
    }
    public void setTermoNome(String termoNome) {
        this.termoNome = termoNome;
    }
    public String getSignificado() {
        return significado;
    }
    public void setSignificado(String significado) {
        this.significado = significado;
    }
}
