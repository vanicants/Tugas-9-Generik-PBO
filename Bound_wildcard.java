import java.util.Arrays;
import java.util.List;

public class Bound_wildcard {
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            s+=n.doubleValue();
        }
        return s;
    }
    
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(3, 2, 5);
        System.out.println("sum = " + sumOfList(li));
        List<Double> ld = Arrays.asList(1.1, 2.4, 5.5);
        System.out.println("sum = " + sumOfList(ld));
    }
}
