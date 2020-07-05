package proiectDesignPatterns.adapterPattern;

public class RegularHumanAdapter implements SuperHeroByNight { //Faptul ca unele dintre obiectele noastre sunt de tip Super Erou ar trebui sa ramana un secret...
                                                              //Astfel, cand interactioneaza cu alte obiecte sau cu sistemul, ele trebuie sa se comporte ca niste oameni obisnuiti;
    RegularHumanByDay human;
    RegularHumanAdapter (RegularHumanByDay human){
        this.human=human;
    }

    @Override
    public void flying() {
        human.regularWalking();
    }

    @Override
    public void savingWorld() {
        human.regularJob();
    }

}
