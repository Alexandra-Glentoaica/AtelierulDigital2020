package proiectDesignPatterns.adapterPattern;

public class Main {
    public static void main(String[] args) {

        Accountant acc1=new Accountant();
        System.out.print("Accountat -> ");
        acc1.regularJob();
        acc1.regularWalking();
        System.out.println("\n");

        Superhero hero1=new Superhero();
        System.out.print("SuperHero -> ");
        hero1.savingWorld();
        hero1.flying();
        System.out.println("\n");

        SuperHeroByNight hero2=new RegularHumanAdapter(acc1);
        System.out.println("SuperHero behaving like a regular Human ->");
        hero2.flying();
        hero2.savingWorld();
    }
}
