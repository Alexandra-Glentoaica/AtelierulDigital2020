package proiectDesignPatterns.obseverPattern;

public class NumarTotalMedalii implements Observer, DisplayNo {
    private int medaliiGimnastica;
    private int medaliiCanotaj;
    private int medaliiAtletism;

    private Subject medalii;

    public NumarTotalMedalii (Subject medalii){
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

    public void display(){
        int nrTotalMedalii=this.medaliiGimnastica+this.medaliiCanotaj+this.medaliiAtletism;
        System.out.println("La aceste 3 categorii, Romania a adunat un total de: " + nrTotalMedalii + " medalii." + "\n");
    }
}
