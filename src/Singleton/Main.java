import Singleton.User;

public static void main(String[] args) {
    // Creazione di un oggetto User con valori di default
    User user1 = new User();

    // Stampare le informazioni di user1 (valori di default)
    System.out.println("Informazioni di User1 (default):");
    user1.stampaInformazioni();

    // Creazione di un altro oggetto User
    User user2 = new User();

    // Modificare le informazioni di user2
    user2.setNome("Luca");
    user2.setEta(25);

    // Stampare le informazioni di user2 dopo la modifica
    System.out.println("\nInformazioni di User2 (modificato):");
    user2.stampaInformazioni();
}