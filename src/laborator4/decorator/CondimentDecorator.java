package laborator4.decorator;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(String description, int cost, Beverage beverage){
        super(cost,description);
        this.beverage=beverage;
    }

    @Override
    public int getCost(){
        return super.getCost()+beverage.getCost(); //Cazul "default" in care bauturii de baza nu ii este setata nicio dimensiune;
    }

    public String getDescription() {
        return super.getDescription() + "," + beverage.getDescription();
    }
}
