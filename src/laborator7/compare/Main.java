package laborator7.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car(1000, 2020));
        cars.add(new Car(1000, 2019));
        cars.add(new Car(2000, 2020));
        cars.add(new Car(200, 2020));

        System.out.println(cars);
        Car [] cars2 = new Car [cars.size()];
        cars2= cars.toArray(cars2);

        Arrays.sort(cars2);
        System.out.println(Arrays.asList(cars2));
    }
}
