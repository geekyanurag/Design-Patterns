public class ShapeFactory {
    public Shape getInstance(String name){
        if(name.equals("Circle"))
            return new Circle();
        else if(name.equals("Rectangle"))
            return new Rectangle();
        else
            return null;
    }
}
