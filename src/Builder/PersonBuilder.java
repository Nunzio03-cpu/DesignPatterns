package Builder;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder SetAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder SetAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build(){
        return new Person(this);
    }
}
