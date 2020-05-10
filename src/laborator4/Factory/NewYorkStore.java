package laborator4.Factory;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public class NewYorkStore extends PizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=new DefaultPizza();

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
