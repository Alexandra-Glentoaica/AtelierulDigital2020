package laborator4.Factory;

public class Main {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory1= new NewYorkStore();
        PizzaFactory pizzaFactory2=new ChicagoPizzaStore();

       // Pizza p1 = pizzaFactory1.orderPizza("Cheese");
            //System.out.println();
        // Pizza p2 = pizzaFactory1.orderPizza("Spicy");
            //System.out.println();
        Pizza p3 = pizzaFactory2.orderPizza("SeaFruit");
            System.out.println();
        Pizza p4= pizzaFactory2.orderPizza("Veggie");
            System.out.println();
        Pizza p5=pizzaFactory2.orderPizza("");

        //System.out.println(p1);
        //System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}
