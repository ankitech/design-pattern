package builder;

public class PersonBuilder {

    protected Person person = new Person();

    public Person build(){
        return person;
    }

    public PersonAddressBuilder lives(){
        return new PersonAddressBuilder(person);
    }

    public PersonOccupancyBuilder works(){
        return new PersonOccupancyBuilder(person);
    }
}
