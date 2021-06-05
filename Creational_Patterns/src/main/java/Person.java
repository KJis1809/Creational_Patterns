public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;

    private boolean isHasAge;
    private boolean isHasAddress;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, int age, String address, boolean isHasAge, boolean isHasAddress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.isHasAge = isHasAge;
        this.isHasAddress = isHasAddress;
    }

    public boolean hasAge() {
        return getAge() != 0;
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    public void happyBirthday() {
        if (!hasAge()) {
            isHasAge = true;
        }

        age++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(getSurname())
                .setAge(getAge())
                .setAddress(getAddress());
    }

    @Override
    public String toString() {
        return "Person { name: " + name +
                ", surname: " + surname +
                ", age: " + age +
                ", address: " + address +
                " }; " +
                " isHasAge: " + isHasAge +
                " / isHasAddress: " + isHasAddress;
    }
}
