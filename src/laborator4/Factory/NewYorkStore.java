package laborator4.Factory;

public class NewYorkStore extends PizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;

        if(type.equals("Spicy")){
            pizza = new NYSpicyPizza();
        }
        else if(type.equals("Cheese")){
            pizza = new NYCheesePizza();
        }
        else if(type.equals("Ananas")){
            pizza= new NYAnanasPizza();
        }

        return pizza;
    }
}
