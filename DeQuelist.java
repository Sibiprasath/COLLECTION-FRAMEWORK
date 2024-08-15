
import java.util.ArrayDeque;


public class DeQuelist{
    public static void main(String[] args) {
        ArrayDeque Q=new ArrayDeque();
        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);
        Q.add(50);
        System.out.println(Q);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        Q.addFirst(5);
        Q.addLast(55);
        System.out.println(Q);
-
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        //remove
        //poll
        //pop

        /* Q.remove();
        System.out.println(Q);

        Q.pop();
        System.out.println(Q);

        Q.poll();
        System.out.println(Q);*/

        Q.remove(30);
        System.out.println(Q);

        Q.add("Nandha");
        Q.add('S');
        Q.add(3.1234f);
        System.out.println(Q);

    }
}