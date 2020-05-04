package laborator4.Factory;

public class Main {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory= new NewYorkStore();

        Pizza p1 = pizzaFactory.orderPizza("Cheese");
            System.out.println();
        Pizza p2 = pizzaFactory.orderPizza("Spicy");
            System.out.println();


        System.out.println(p1);
        System.out.println(p2);


        /*Tema - ChicagoPizzaStore implementare*/
    }
}
