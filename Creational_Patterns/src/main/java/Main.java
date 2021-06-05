public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Angel")
                .setSurname("Griffin")
                .setAge(20)
                .setAddress("Sydney")
                .build();

        System.out.println(mom);

        Person son = mom.newChildBuilder()
                .setName("Kostya")
                .build();

        System.out.println(son);

        try {
            //There is no mandatory fields
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Invalid age
            new PersonBuilder()
                    .setName("TestName")
                    .setSurname("TestSurname")
                    .setAge(-20)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
