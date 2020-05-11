package laborator4.decorator;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(String description, int cost, Beverage beverage){
        super(cost,description);
        this.beverage=beverage;
    }

    @Override
    public int getCost(){
        if(getSize().equals("Tall"))
            return beverage.getCost()+1;
        else if(getSize().equals("Grande"))
            return beverage.getCost()+2;
        else if(getSize().equals("Venti"))
            return beverage.getCost()+3;
        else return super.getCost()+beverage.getCost();
    }

    public String getDescription() {
        return super.getDescription() + "," + beverage.getDescription();
    }
}
