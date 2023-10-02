public class Person {

    private String name;
    private int age;
    private String address;
    private int phoneNumber;

    public Person(PersonBuilder personBuilder){
        this.name = personBuilder.getName();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
        this.phoneNumber = personBuilder.getPhoneNumber();
    }

    public String toString(){
        return "Name: " + name +
                " age: " + age +
                " address: " + address +
                " phoneNumber: " + phoneNumber;
    }
}
