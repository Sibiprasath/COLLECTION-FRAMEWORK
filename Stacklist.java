
import java.util.Stack;

public class Stacklist{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack);
        // System.out.println(stack.peek());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.get(3));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        stack.add(3,45);
        System.out.println(stack);

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        stack.removeFirst();
        System.out.println(stack);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        // isEmpty
        // contain
        //clone

        System.out.print(stack.push(100));
         // add is return as boolean
        System.out.println(stack.push(1000));
        System.out.println(stack);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //pop

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());

    }
}