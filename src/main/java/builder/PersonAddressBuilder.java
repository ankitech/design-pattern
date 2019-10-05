package builder;

public class PersonAddressBuilder extends PersonBuilder{

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder name(String name){
        person.name = name;
        return this;
    }

    public PersonAddressBuilder inCity(String city){
        person.city = city;
        return this;
    }

    public PersonAddressBuilder atPincode(String pincode){
        person.pincode = pincode;
        return this;
    }
}
