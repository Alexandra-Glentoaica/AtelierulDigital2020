package laborator4.decorator;

public class Main {
    public static void main(String[] args) {

        /*Beverage dr = new DarkRoast(); //dr=DarkRoast
        //dr.setSize("Venti");
        Beverage drw = new Whip(dr);

        Beverage hb = new HouseBlend();
        //hb.setSize("Grande");
        hb=new Mocha(hb);
        hb=new Mocha(hb);
        hb=new Whip(hb);

        Beverage doubleMocha = new HouseBlend();
        //doubleMocha.setSize("Tall");
        doubleMocha=new Mocha(doubleMocha);
        doubleMocha=new Mocha(doubleMocha);
        doubleMocha=new Soy(doubleMocha);
        doubleMocha=new Whip(doubleMocha);*/

        Beverage simpleEspresso= new Espresso();
        simpleEspresso.setSize("Grande");
        simpleEspresso=new Milk(simpleEspresso);
        simpleEspresso=new Whip(simpleEspresso);

        Beverage darkRoast = new DarkRoast();
        darkRoast.setSize("Venti");
        darkRoast=new Soy(darkRoast);

        Beverage decaf = new Decaf();
        decaf.setSize("Grande");
        decaf= new Mocha(decaf);
        decaf = new Whip(decaf);

       /* Beverage houseblend= new HouseBlend();
        houseblend.setSize("Tall");
        houseblend=new Whip(houseblend); */


       /* System.out.println(drw.getDescription() + "," + drw.getCost());
        System.out.println(dr.getDescription() + "," + dr.getCost());
        System.out.println(hb.getDescription() + ", " + hb.getCost());
        System.out.println(doubleMocha.getDescription() + ", cost: " + doubleMocha.getCost() + " $");*/
        System.out.println(simpleEspresso.getDescription() + ", cost: " + simpleEspresso.getCost() + " $");
        System.out.println(darkRoast.getDescription() + ", cost: " + darkRoast.getCost() + " $");
        System.out.println(decaf.getDescription() + ", cost: " + decaf.getCost() + " $");
        //System.out.println(houseblend.getDescription() + ", cost: " + houseblend.getCost() + " $");
    }
}
