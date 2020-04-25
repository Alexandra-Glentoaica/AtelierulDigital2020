package Homework.CodeChallenge2_Laborator2;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] lista_actori=new Actor[20];

    public Film(String nume, int anAparitie, Actor a[]) {
        this.nume = nume;
        this.anAparitie=anAparitie;
        this.lista_actori=a;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public String getNume() {
        return nume;
    }
}
