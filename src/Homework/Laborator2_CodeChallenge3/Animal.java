package Homework.Laborator2_CodeChallenge3;

public abstract class Animal {
    protected int numberOfLegs;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    abstract void eat();
    public void walk(){
        if (this.numberOfLegs==4)
            System.out.println("Pisica umbla pe toate cele 4 picioarele");
        else if (this.numberOfLegs==8)
            System.out.println("Paianjenul se deplaseaza folosindu-si toate cele 8 picioare");
    }
}