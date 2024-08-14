import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList(); 
        LinkedList list1=new LinkedList();   

        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(100);

        System.out.println(list);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        list.clear();
        //list.remove();
        list.poll(); //move 
        System.out.println(list);
        System.out.println("THE END");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Sorting

        int num;
        while (true) { 
            num=sc.nextInt();
            if(num==-1){break;}
            list1.add(num);
            
        }
        System.out.println(list1);
        int temp;
        for(int i=0;i<list1.size()-1;i++){
            for(   int j=0;j<list1.size()-i-1;j++){
                
            }
        }
    }
}

