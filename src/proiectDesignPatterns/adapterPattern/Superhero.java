package proiectDesignPatterns.adapterPattern;

public class Superhero implements SuperHeroByNight {

    @Override
    public void flying() {
        System.out.println("That's right, I can fly!");
        System.out.println("But I still have to walk in the midday in order to protect my identity.");
    }

    @Override
    public void savingWorld() {
        System.out.println("My job is not a regular one at all. I have to keep the world safe everyday!");
    }
}
