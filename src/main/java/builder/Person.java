package builder;

public class Person extends PersonDemo {
    public String name,city,pincode;
    public String company,position;
    public int salary;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
