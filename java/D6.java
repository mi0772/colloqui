import java.util.List;

public class D6 {
    private String nome;
    private String cognome;
    private List<D6> figli; 
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public List<D6> getFigli() {
        return figli;
    }
    public void setFigli(List<D6> figli) {
        this.figli = figli;
    }

    //TODO 1: Rendiamo questa classe immutabile.

    

}
