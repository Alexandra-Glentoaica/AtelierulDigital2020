package laborator7.leaders;

import java.util.*;

public class Leader {
    public static List<Integer> getLeaders(List<Integer> intList){
        List<Integer> leaders= new ArrayList<Integer>();

        Collections.reverse(intList);
        int maxim = intList.get(0);
        leaders.add(maxim);

        Iterator<Integer> it = intList.iterator();
        int current;
        while(it.hasNext()){
            current = it.next();
                    if(current>maxim){
                        leaders.add(current);
                        maxim=current;
                    }
        }

        return leaders;
    }
}
