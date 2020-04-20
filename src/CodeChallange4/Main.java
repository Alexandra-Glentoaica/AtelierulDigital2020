package CodeChallange4;

import java.util.Arrays;

public class Main {
    static int contor_perechi=0;
    static int[] int_array;
    static boolean[] boolean_array;

    public static void main(String[] args) {
        int_array=new int[]{-1,-2,-1,2};
        boolean_array=new boolean[int_array.length];

        Arrays.fill(boolean_array, false);

        for (int i = 0; i < int_array.length; i++)
        {
            for (int j = i + 1; j < int_array.length; j++)
            {
                for (int k = j + 1; k < int_array.length; k++)
                {
                    if ((int_array[i] + int_array[j] + int_array[k] == 0) && (boolean_array[i] == false) && (boolean_array[j] == false) && (boolean_array[k] == false))
                    {
                        boolean_array[i] = true;
                        boolean_array[j] = true;
                        boolean_array[k] = true;
                        contor_perechi++;
                    }
                }
            }
        }
        System.out.print(contor_perechi);
    }

        
}

