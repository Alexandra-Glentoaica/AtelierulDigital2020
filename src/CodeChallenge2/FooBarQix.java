package CodeChallenge2;

public class FooBarQix {

    public String compute (int i){
        String s=divizibil(i)+contains(i);
        if(s.isEmpty())
            return s=String.valueOf(i);
        return s;
    }

    public String divizibil (int i){
        String s="";
        if(i%3==0)
            s=s+"Foo";
        if(i%5==0)
            s=s+"Bar";
        if(i%7==0)
            s=s+"Qix";
        return s;
    }

    public String contains (int i){
        String s="";
        int aux;

        while(i<=1){
            aux=i%10;

            if(aux%3==0)
                s=s+"Foo";
            if(aux%5==0)
                s=s+"Bar";
            if(aux%7==0);
                s=s+"Qix";

            i=i/10;
        }
        return s;
    }
}
