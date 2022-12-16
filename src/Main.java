import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car, CarDate> carMap = new HashMap<>();
        carMap.put(new Car(1, "555 WWW"), new CarDate(2005, "RANGE ROVER", 250000, "BLACK"));
        carMap.put(new Car(2, "345 WWW"), new CarDate(2015, "MERSEDES BENZ S CLASS", 20000, "BLUE"));
        carMap.put(new Car(3, "777 NNN"), new CarDate(2012, "TOYOTA CAMRY", 350000, "BLACK"));
        carMap.put(new Car(4, "555 AAA"), new CarDate(2011, "HYUNDAI PORTER", 150000, "WHITE"));
        carMap.put(new Car(5, "222 AAI"), new CarDate(2000, "DAEWOO DAMAZ", 80000, "WHITE"));
        System.out.println(carMap.entrySet());
    }
}



