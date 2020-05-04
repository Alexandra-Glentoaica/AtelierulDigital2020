package Homework.CodeChallenge2_Laborator2;

import java.util.Objects;

public class Actor {
    private String nume;
    private int varsta;
    private Premiu[] lista_premii=new Premiu[20];

    public Actor(String nume, int varsta, Premiu p[]) {
        this.nume = nume;
        this.varsta=varsta;
        this.lista_premii=p;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public Premiu[] getLista_premii() {
        return lista_premii;
    }
}
