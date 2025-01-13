package Singleton;

public class User {
    private String nome;
    private Integer eta;
    private static User instance;

    private User() {
        this.nome = "Default Name";
        this.eta = 0;
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    // Metodo per stampare le informazioni
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }
}