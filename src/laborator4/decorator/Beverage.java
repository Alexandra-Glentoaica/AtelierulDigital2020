package laborator4.decorator;

public abstract class Beverage {
    protected String description;
    protected int cost;
    protected String size;

    public Beverage(int cost,String description) {
        this.cost = cost;
        this.description=description;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

}
