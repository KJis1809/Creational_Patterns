public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age != 0)
            this.age = age;

        return this;
    }

    public PersonBuilder setAddress(String address) {
        if (address != null)
            this.address = address;

        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Person need to have 'name' and 'surname' at the start!");
        } else if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        } else {
            return new Person(name, surname, age, address);
        }
    }
}
