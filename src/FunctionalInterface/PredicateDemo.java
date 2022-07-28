package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

      public static void main (String args []){
          Predicate<Integer> p =x-> (x % 2) == 0;
          System.out.println(p.test(5));
          List<Integer> al = Arrays.asList(1,5,7,10,54);
          al.stream().filter(x->x%2==0).forEach(System.out::println);

      }

}
