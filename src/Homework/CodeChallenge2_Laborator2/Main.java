package Homework.CodeChallenge2_Laborator2;

public class Main {

     static String studioNames (Studio[] array){
        String s=" ";
        for(int i=0;i<array.length;i++){
            if(array[i].getContor()>2)
                s+=array[i].getNume() + " ";
        }
        return s;
    }

    public static void main(String[] args) {
        Premiu Oscar2020 = new Premiu("Oscar", 2020);
        Premiu Oscar2019 = new Premiu("Oscar",  2019);
        Premiu zmeuraDeAur2018= new Premiu("Zmeura de aur", 2018);
        Premiu ZmeuraDeAur2020= new Premiu("Zmeura de aur", 2020);
        Premiu SAGAward2017= new Premiu("SAG Award", 2017);
        Premiu SAGAward2019= new Premiu("SAG Award", 2019);
        Premiu BAFTAAward2018= new Premiu ("BAFTA Award", 2018);
        Premiu BAFTAAward2015 = new Premiu ("BAFTA Award", 2015);
        Premiu AACTAInternationalAward= new Premiu ("AACTA International Award", 2018);
        Premiu BAFTA_TVAward2019= new Premiu("BAFTA TV Award",2019);
        Premiu BritanniaAward2013= new Premiu("Britannia Award", 2013);
        Premiu VarietyAward2014= new Premiu("Variety Award",2014);

        Premiu[] lista_premii1= new Premiu[]{Oscar2019,SAGAward2019};
        Premiu[] lista_premii2= new Premiu[]{BAFTAAward2015,BAFTAAward2018,ZmeuraDeAur2020};
        Premiu[] lista_premii3= new Premiu[]{SAGAward2017,zmeuraDeAur2018,Oscar2020};
        Premiu[] lista_premii4= new Premiu[]{BAFTA_TVAward2019,BritanniaAward2013,VarietyAward2014};


        Actor actor1= new Actor("Leonardo DiCaprio", 45, lista_premii1); //2 premii;
        Actor actor2= new Actor("Keanu Reeves", 55, lista_premii3);//3 premii;
        Actor actor3= new Actor("Keira Knightley", 35, lista_premii2); //3 premii;
        Actor actor4= new Actor("Natalie Portman", 39, new Premiu[]{}); //actor fara premii;
        Actor actor5= new Actor("Timothée Chalamet", 24, new Premiu[]{AACTAInternationalAward}); //1 premiu
        Actor actor6= new Actor("Benedict Cumberbatch", 44, lista_premii4); // 3 premii;

        Film film1= new Film("Call me by your name",2017, new Actor[]{actor5});
        Film film2= new Film("The Imitation Game", 2014,new Actor[]{actor6,actor4});
        Film film3= new Film("The Wolf of Wall Street", 2013, new Actor[]{actor1, actor2, actor3});
        Film film4= new Film("John Wick",2014,new Actor[]{actor2});

        Studio studio1 = new Studio("MGM", new Film[]{film1,film3,film2});
        Studio studio2 = new Studio("Disney", new Film[]{film2,film4});
        Studio studio3= new Studio("Warner Bros", new Film[]{film1});

        Studio[] studioDatabase = new Studio[]{studio1, studio2, studio3};

        System.out.println(studioNames(studioDatabase));
    }
}
