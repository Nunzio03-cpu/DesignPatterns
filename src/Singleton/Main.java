package Singleton;

public class Main {
    public static void main(String[] args) {
        User user1 = User.getInstance();
        System.out.println("Informazioni di default:");
        user1.stampaInformazioni();

        user1.setNome("Mario");
        user1.setEta(30);

        User user2 = User.getInstance();
        System.out.println("Informazioni modificate:");
        user2.stampaInformazioni();
    }
}