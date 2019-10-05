package builder;

public class PersonDemo {

    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();

        Person person = pb
                .lives()
                    .name("Ankit")
                    .inCity("Pune")
                    .atPincode("427001")
                .works()
                    .worksAt("Ideas")
                    .worksAs("Developer")
                    .paid(5000)
                .build();

        System.out.println(person);

    }
}
