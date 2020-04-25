package Homework.CodeChallenge2_Laborator2;

public class Studio {
    private String nume;
    private Film[] lista_filme=new Film[20];
    private int contor=0; //Putem folosi un contor pentru a putea afla in orice moment cate filme avem in array;

    public Studio(String nume, Film f[]) {
        this.nume = nume;
        this.lista_filme=f;
        this.contor=f.length;
    }

    public String getNume() {
        return nume;
    }

    public int getContor() {
        return contor;
    }


    /*public String actorNames(Studio array[], Actor a){
        String s=" ";
        for(int i=0;i<array.length;i++){
            if(array[i].)
        }
        return s;
    }*/

}
