package Laborator2.fighter;

public class BoxingMatch {
    private fighter f1;
    private fighter f2;

    public BoxingMatch(fighter f1,fighter f2){
        this.f1=f1;
        this.f2=f2;
    }

    public String fight(){
        String winner="";
        while(f1.getHealth()>0 && f2.getHealth()>0){
            f2.decreaseHealth(f1.getDamgePerAttack());
            if(f2.getHealth()>0) //Daca f2 inca e in viata, atunci el il ataca pe f1;
                f1.decreaseHealth(f2.getDamgePerAttack());
            else //else daca f2 e mort si nu mai poate ataca inseamna ca f1 e castigatorul;
                winner=f1.getName();
        }
        return winner;
    }
}
