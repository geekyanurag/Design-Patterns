public class Main {

    public static void main(String args[]){

        // First Implementation using director class
        Director director = new Director(new PersonBuilder());
        Person person = director.createPerson();
        System.out.println(person.toString());

        // You can directly call the personBuilder and set the required fields
        // Comment the any piece of code the above one or the below one to run the program.
        Person person = new PersonBuilder().setName("anurag").setAge(23).build();
        System.out.println(person.toString());
    }
}
