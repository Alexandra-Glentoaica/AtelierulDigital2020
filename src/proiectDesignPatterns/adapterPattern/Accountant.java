package proiectDesignPatterns.adapterPattern;

public class Accountant implements RegularHumanByDay{
    @Override
    public void regularJob() {
        System.out.println("What do you mean regular job?");
        System.out.println("I have the best job in the world, I get to play with numbers everyday!");
    }

    @Override
    public void regularWalking() {
        System.out.println("Unfortunately, I have to ride the bus to my workplace or even walk by foot when I'm late and I don't catch the bus.");
        System.out.println("Can you imagine if I could fly? I would never be late again! .....to bad regular humans can't fly!");
    }
}
