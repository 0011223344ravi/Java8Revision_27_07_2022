package LambdaExample;


import javax.management.RuntimeErrorException;

interface axby{
    void add(int a, int b);
}

interface abc {
    void sum (int x);
}

interface abc1{
    void sum (int x , int y);
}
interface subtract{

    int subtraction(int x , int y);
}

public class LambdaExample {
    public static void main (String args []){

        axby xyz = (a,b)->System.out.println("Sum "+(a+b));
        xyz.add(4,3);

   abc c =x->System.out.println(x);
   c.sum(7);

        abc1 c1 = (x,y)->System.out.println("Sum "+(x+y));
        c1.sum(2,3);

        subtract s =(x,y)-> {
        if (y > x) {
            throw new RuntimeErrorException( null, "2nd arguement is bigger than the first one ");
        } else {
            return (x-y);

        }
        };
      // s.subtraction(4,5);
       int abc = s.subtraction(5,4);
       System.out.println(abc);

    }
}
