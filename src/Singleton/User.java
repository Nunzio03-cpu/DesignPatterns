package Singleton;

public class User {
    private String nome;
    private int eta;

    // Costruttore di default (senza parametri)
    public User() {
        this.nome = "Nome di default";
        this.eta = 18; // Età di default
    }

    // Getter per il nome
    public String getNome() {
        return nome;
    }

    // Setter per il nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter per l'età
    public int getEta() {
        return eta;
    }

    // Setter per l'età
    public void setEta(int eta) {
        this.eta = eta;
    }

    // Funzione che stampa a video il nome e l'età
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }
}