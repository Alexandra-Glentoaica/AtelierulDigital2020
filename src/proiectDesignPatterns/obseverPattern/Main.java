package proiectDesignPatterns.obseverPattern;

public class Main {
    public static void main(String[] args) {

        MedaliiJORomania mjr=new MedaliiJORomania(); //Subject

        Clasament c=new Clasament (mjr); // Un observer - este adaugat in lista Subjectului direct prin intermediul constructorului;
        NumarTotalMedalii nrT=new NumarTotalMedalii(mjr);

        mjr.setMedalsNumber(72,38,35);
        mjr.setMedalsNumber(23,50,2);
        mjr.removeObserver(c);
        mjr.setMedalsNumber(1,2,3);
    }
}