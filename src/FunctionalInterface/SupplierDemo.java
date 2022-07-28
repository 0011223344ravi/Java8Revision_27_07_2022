package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main (String args []){
        Supplier s = ()->"Ravi";
        System.out.println(s.get());

        List<Integer> al = Arrays.asList(1,45,78,95,12);
        List<Integer> al1 = Arrays.asList( );
        Integer integer = al1.stream().findAny().orElseGet(() -> 10);
        System.out.println(integer);
    }
}
