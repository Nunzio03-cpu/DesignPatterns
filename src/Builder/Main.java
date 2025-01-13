package Builder;

public class Main {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder("Mario", "Rossi").SetAge(30).SetAddress("Via Marconi").build();
        Person person2 = new PersonBuilder("Carlo", "Verdi").SetAge(25).build();

        person1.stampaDettagliPerson();
        System.out.println();
        person2.stampaDettagliPerson();
    }
}
