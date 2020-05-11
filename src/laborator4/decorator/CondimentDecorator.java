package laborator4.decorator;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(String description, int cost, Beverage beverage){
        super(cost,description);
        this.beverage=beverage;
    }

    public int getCost(){
        return super.getCost() + beverage.getCost();
    }

    public String getDescription() {
        return super.getDescription() + "," + beverage.getDescription();
    }
}
