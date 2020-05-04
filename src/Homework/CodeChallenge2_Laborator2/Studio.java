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

    public Film[] getLista_filme() {
        return lista_filme;
    }

    public int count(){
        int count = 0;
        for(Film film:lista_filme){
            if(film!=null)
                count++;
        }
        return count;
    }

    public boolean hasActor(String actorName){
        for(Film film:lista_filme){
            if(film!=null && film.getActorByName(actorName)!=null){
                return true;
            }
        }
        return false;
    }

    public String[] getFilmNameWithActorAboveAge(int age){
        String[] toReturn=new String[10];
        int i=0;
        for(Film film:lista_filme){
            if(film!=null && film.hasActorsAboveAge(age))
                toReturn[i++]=film.getNume();
        }
        return toReturn;
    }

}
