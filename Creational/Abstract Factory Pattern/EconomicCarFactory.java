public class EconomicCarFactory implements AbstractCarFactory{

    @Override
    public Car getInstance(String price){
        if(price.equals("200000"))
            return new EconomicCar();
        else if(price.equals("600000"))
            return new UpperRangeCar();
        return null;
    }
}
