public class Main {

    public static void main(String args[]){
        BasePizza pizza = new ExtraCheese(new Margerita());
        System.out.println("Cost of margerita pizza with extracheese as toppings : " + pizza.cost());

        // Creating another pizza with both extra cheese and mushroom toppings
        BasePizza pizza1 = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println("Cost of margerita pizza with extracheese and mushroom as toppings :" + pizza1.cost());

        // Creating another pizza with mushroom and farmhouse
        BasePizza pizza2 = new Mushroom(new FarmHouse());
        System.out.println("Cost of farmhouse pizza with mushroom as toppings : " + pizza2.cost());
    }
}
