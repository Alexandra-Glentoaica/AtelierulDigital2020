package laborator4.decorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        super("Soy milk",2,beverage);
    }


    @Override
    public String getSize(){
        return this.beverage.getSize();
    }
}
