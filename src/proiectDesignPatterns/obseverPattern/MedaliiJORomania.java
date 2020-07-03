package proiectDesignPatterns.obseverPattern;

import java.util.ArrayList;
import java.util.List;

/*Vom ca atribute 3 variabile de tip corespunzatoare numarului de medalii pe care Romania le-a obtinut de-a lungul timpului la Jocurile Olimpice*/

public class MedaliiJORomania implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int medaliiGimnastica;
    private int medaliiCanotaj;
    private int medaliiAtletism;

    @Override
    public void registerObserver(Observer O) {
        observers.add(O);
    }

    @Override
    public void removeObserver(Observer O){
        if(observers.contains(O)){
            observers.remove(O);
        }
    }

    @Override
    public void notifyObservers(){
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(medaliiGimnastica,medaliiCanotaj,medaliiAtletism);
        }
    }

    public void setMedalsNumber(int medaliiGimnastica,int medaliiCanotaj,int medaliiAtletism){
        this.medaliiGimnastica=medaliiGimnastica;
        this.medaliiCanotaj=medaliiCanotaj;
        this.medaliiAtletism=medaliiAtletism;
        notifyObservers(); /*Toate obiectele Observers trebuie notificate de fiecare data cand numarul de medalii este setat pentru a-si efectua operatiile cu noile valori*/
    }

}
