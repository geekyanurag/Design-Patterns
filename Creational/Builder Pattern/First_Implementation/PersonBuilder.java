public class PersonBuilder {
    private String name;
    private int age;
    private String address;
    private int phoneNumber;

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }

    public String getName(){
        return name;
    }

    public PersonBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public int getAge(){
        return age;
    }

    public PersonBuilder setAddress(String address){
        this.address = address;
        return this;
    }

    public String getAddress(){
        return address;
    }

    public PersonBuilder setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public Person build(){
        return new Person(this);
    }
}
