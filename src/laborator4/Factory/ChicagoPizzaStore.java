package laborator4.Factory;

public class ChicagoPizzaStore extends PizzaFactory{

    @Override
    public Pizza createPizza(String type) { /*Fiecare "obiect" ce extinde PizzaFactory trebuie sa implementeze in propriul sau fel metoda "createPizza"*/
        Pizza pizza=new DefaultPizza();

        if(type.equals("SeaFruit")){
            pizza=new ChicagoSeaFruitPizza();
        }
       else if(type.equals("Veggie")){
            pizza=new ChicagoVeggiePizza();
        }
       else if(type.equals("Pepperoni")){
           pizza=new ChicagoPepperoniPizza();
        }

        return pizza;
    }
}
