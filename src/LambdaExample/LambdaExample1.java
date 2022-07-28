package LambdaExample;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExample1 implements Comparator
{

    public static void main (String args []){


        ArrayList<Integer> al = new ArrayList<>();
        al.add(45);
        al.add(35);
        al.add(30);
        al.add(40);

        //System.out.println(al);
        Collections.sort(al);
       // System.out.println(al);

        Collections.sort(al,new LambdaExample1());
       // System.out.println(al);

        Collections.sort(al,(a,b)->a.compareTo(b));
        System.out.println(al);
    }

    @Override
    public int compare(Object o1, Object o2) {
        Integer x= (Integer) o1;
        Integer y = (Integer) o2;
        if(x>y)
            return -1;
        else if(y>x)
            return 1;
        else
            return 0;
    }


}
