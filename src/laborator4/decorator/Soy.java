package laborator4.decorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        super("Soy milk",2,beverage);
    }

    @Override
    public int getCost(){
        if(beverage.getSize().equals("Tall"))
            return beverage.getCost()+1;
        else if(beverage.getSize().equals("Grande"))
            return beverage.getCost()+2;
        else if(beverage.getSize().equals("Venti"))
            return beverage.getCost()+4;
        else return super.getCost()+beverage.getCost();
    }
}
