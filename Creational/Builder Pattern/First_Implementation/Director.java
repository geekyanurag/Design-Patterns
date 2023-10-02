public class Director {

    PersonBuilder personBuilder;

    Director(PersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }

    public Person createPerson(){
        return personBuilder.setName("anurag").setAddress("bangalore").setAge(23).build();
    }
}
