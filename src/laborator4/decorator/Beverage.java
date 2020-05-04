package laborator4.decorator;

public abstract class Beverage {
    private String description;
    private int cost;

    public Beverage(int cost,String description) {
        this.cost = cost;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

}
