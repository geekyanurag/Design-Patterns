public class Main {

    public static void main(String args[]){
        AbstractCarProducer abstractCarProducer = new AbstractCarProducer();
        AbstractCarFactory abstractCarFactory = abstractCarProducer.getFactoryInstance("luxury");
        try {
            Car car = abstractCarFactory.getInstance("2500000");
            System.out.println(car.getSpeed());
        } catch (NullPointerException e){
            System.out.println("please enter a valid price range based on car type\n" + e);
        }
    }
}
