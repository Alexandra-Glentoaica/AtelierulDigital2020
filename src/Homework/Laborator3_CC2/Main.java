package Homework.Laborator3_CC2;

import java.util.Arrays;

public class Main {

    public static void displaySorted(SortingStrategy strategy,Integer[] arr)
    {
        strategy.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args)
    {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copyArr1= Arrays.copyOf(arr,arr.length);
        Integer[] copyArr2=Arrays.copyOf(arr,arr.length);

        displaySorted(new MergeSort(),copyArr1);
        System.out.println();
        displaySorted(new BubbleSort(),copyArr2);
    }

}