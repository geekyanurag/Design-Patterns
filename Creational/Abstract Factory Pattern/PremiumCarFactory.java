public class PremiumCarFactory implements AbstractCarFactory{

    @Override
    public Car getInstance(String price){
        if(price.equals("1800000"))
            return new PremiumCar();
        else if(price.equals("2500000"))
            return new LuxuryCar();
        return null;
    }
}
