package proiectDesignPatterns.obseverPattern;

//Scopul acestui Observer este sa afiseze in ordine crescatoare top 3 al sporturilor la care Romania a obtinut cele mai multe medalii;
//El primeste informatii despre numarul de medalii de la Subject si de fiecare data cand numarul se schimba, obiectul trebuie sa schimbe ordinea lor in top;

public class Clasament implements Observer, DisplayNo {
    private int medaliiGimnastica;
    private int medaliiCanotaj;
    private int medaliiAtletism;

    private Subject medalii;

    public Clasament (Subject medalii){
        this.medalii=medalii;
        medalii.registerObserver(this);
    }

    @Override
    public void update(int medaliiGimnastica, int medaliiCanotaj, int medaliiAtletism) {
        this.medaliiGimnastica=medaliiGimnastica;
        this.medaliiCanotaj=medaliiCanotaj;
        this.medaliiAtletism=medaliiAtletism;
        display(); //De fiecare data cand numarul medalilor este modificat Observerul nostru trebuie sa afiseze noile valori;
    }

    /*Stiu ca nu e deloc okay cum am facut comparatile si ca incalc niste principii ale OOP, dar nu stiam cum altfel sa fac afisarea pentru numele medaliilor in functie de numarul lor */
    public void display(){
        if(this.medaliiGimnastica>this.medaliiCanotaj && this.medaliiCanotaj>this.medaliiAtletism){
            System.out.println("Medalii Gimnastica: " + this.medaliiGimnastica + "\n" + "Medalii Canotaj: " + this.medaliiCanotaj + "\n" + "Medalii Atletism: " + this.medaliiAtletism + "\n" );
        }

        else if(this.medaliiGimnastica>this.medaliiAtletism && this.medaliiAtletism>this.medaliiCanotaj){
            System.out.println("Medalii Gimnastica: " + this.medaliiGimnastica + "\n"  + "Medalii Atletism: " + this.medaliiAtletism + "\n" +  "Medalii Canotaj: " + this.medaliiCanotaj + "\n");
        }

        else if(this.medaliiAtletism>this.medaliiGimnastica && this.medaliiGimnastica>this.medaliiCanotaj){
            System.out.println( "Medalii Atletism: " + this.medaliiAtletism + "\n" + "Medalii Gimnastica: " + this.medaliiGimnastica + "\n" +  "Medalii Canotaj: " + this.medaliiCanotaj + "\n");
        }

        else if(this.medaliiAtletism>this.medaliiGimnastica && this.medaliiGimnastica>this.medaliiCanotaj){
            System.out.println( "Medalii Atletism: " + this.medaliiAtletism + "\n" + "Medalii Gimnastica: " + this.medaliiGimnastica + "\n" +  "Medalii Canotaj: " + this.medaliiCanotaj + "\n");
        }

        else if(this.medaliiCanotaj>this.medaliiGimnastica && this.medaliiGimnastica>this.medaliiAtletism){
            System.out.println("Medalii Canotaj: " + this.medaliiCanotaj + "\n"  + "Medalii Gimnastica: " + this.medaliiGimnastica + "\n" + "Medalii Atletism: " + this.medaliiAtletism + "\n" );
        }

        else if(this.medaliiCanotaj>this.medaliiAtletism && this.medaliiAtletism>this.medaliiGimnastica){
            System.out.println("Medalii Canotaj: " + this.medaliiCanotaj + "\n"  + "Medalii Atletism: " + this.medaliiAtletism + "\n" + "Medalii Gimnastica: " + this.medaliiGimnastica + "\n" );
        }
    }


}
