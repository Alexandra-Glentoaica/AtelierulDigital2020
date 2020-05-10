package laborator4.Factory;

public abstract class PizzaFactory {

   protected abstract Pizza createPizza(String type);

   public Pizza orderPizza(String type){
       Pizza pizza;
       pizza = createPizza(type);

       pizza.prepare();
       pizza.bake();
       pizza.cut();
       pizza.box();

       return pizza;
   }
}
