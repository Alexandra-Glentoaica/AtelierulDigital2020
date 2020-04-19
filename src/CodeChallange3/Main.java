package CodeChallange3;

import java.util.Arrays;

public class Main {
    static int contor_perechi = 0;
    static int[] intArray; //Vectorul de genul [5,9,-5,7,-5];
    static int [] boolArray; //Vectorul boolean corespondent celui de int-uri care initial are forma [false,false,false,false,false];

    public static void main(String[] args) {

        intArray=new int[]{5,9,-5,7,-5,5};
        boolArray=new int[intArray.length]; //In functie de numarul de int-uri pe care il introducem in tabloul principal vom crea si dimensiunea pentru tabloul bool;

        Arrays.fill(boolArray, 0);
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
               if(intArray[i]+intArray[j]==0 && boolArray[i]==0 && boolArray[j]==0 ) {
                   contor_perechi++;
                   boolArray[i]=1;
                   boolArray[j]=1;
               }
            }
        }

        System.out.println(contor_perechi);
    }
}