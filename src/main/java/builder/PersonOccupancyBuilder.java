package builder;

public class PersonOccupancyBuilder extends PersonBuilder{

    public PersonOccupancyBuilder(Person person){
        this.person = person;
    }

    public PersonOccupancyBuilder worksAt(String company){
        person.company = company;
        return this;
    }

    public PersonOccupancyBuilder worksAs(String position){
        person.position = position;
        return this;
    }

    public PersonOccupancyBuilder paid(int salary){
        person.salary = salary;
        return this;
    }
}
