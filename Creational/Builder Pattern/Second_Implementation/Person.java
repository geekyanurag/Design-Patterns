public class Person {

    private String name;
    private int age;
    private String address;
    private int phoneNumber;

    public Person(String name, int age, String address, int phoneNumber){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public String toString(){
        return "Name: " + name +
                " age: " + age +
                " address: " + address +
                " phoneNumber: " + phoneNumber;
    }

    // Creating static class so that it can be accessed from Person class
    public static class PersonBuilder{
        private String name;
        private int age;
        private String address;
        private int phoneNumber;

        private PersonBuilder(){};

        public static PersonBuilder aPerson(){ return new PersonBuilder();}

        public PersonBuilder withName(String name){
            this.name = name;
            return this;
        }

        public PersonBuilder withAge(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder withAddress(String address){
            this.address = address;
            return this;
        }

        public PersonBuilder withPhoneNumber(int phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build(){
            return new Person(name, age, address, phoneNumber);
        }
    }

    public static void main(String args[]){
        Person person = Person.PersonBuilder.aPerson().withName("anurag").withAge(23).withAddress("bangalore").withPhoneNumber(12345).build();
        System.out.println(person.toString());
    }
}
