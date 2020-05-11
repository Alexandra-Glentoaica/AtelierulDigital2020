package laborator4.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super("White whip", 1, beverage);
    }

   /* @Override
    public int getCost(){
        if(beverage.getSize().equals("Tall"))
            return beverage.getCost()+1;
        else if(beverage.getSize().equals("Grande"))
            return beverage.getCost()+1;
        else if(beverage.getSize().equals("Venti"))
            return beverage.getCost()+2;

        else return super.getCost()+beverage.getCost();
    } */

}
