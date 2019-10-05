package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonBuilderTest {

    @Test
    void build() {
        PersonBuilder pb = new PersonBuilder();
        assertEquals(Person.class,pb.build().getClass());
    }

    @Test
    void getRealObject() {
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

        String expected = "Person{name='Ankit', city='Pune', pincode='427001', company='Ideas', position='Developer', salary=5000}";
        assertEquals(expected,person.toString());
    }
}