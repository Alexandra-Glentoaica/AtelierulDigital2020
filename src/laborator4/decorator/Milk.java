package laborator4.decorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage){
        super("Milk",1,beverage);
    }

    @Override
    public String getSize(){
        return this.beverage.getSize();
    }

}
