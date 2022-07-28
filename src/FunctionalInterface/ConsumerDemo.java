package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main (String args []){
        Consumer c = x->System.out.println(x);
        c.accept(110);

        List<Integer> al = Arrays.asList(1,2,5,88,7,10);
        al.stream().forEach(t->  System.out.println("printing :- " +t));
    }


}
