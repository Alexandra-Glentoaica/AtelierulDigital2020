package laborator7.leaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,5,7,10,13,9,11,12);
        list=Leader.getLeaders(list);
        System.out.println(list);
    }

}
