public class AbstractCarProducer {

    public AbstractCarFactory getFactoryInstance(String name){
        if(name.equals("economic") || name.equals("upperrangecar"))
            return new EconomicCarFactory();
        else if(name.equals("premium") || name.equals("luxury"))
            return new PremiumCarFactory();
        return null;
    }
}
