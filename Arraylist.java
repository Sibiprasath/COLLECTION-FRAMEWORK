import java.util.*;
class Arraylist{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();

        System.out.println(list);
        System.out.println("---------------------");

        //Method add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        
        System.out.println("-------------------------");

        int num;
        while(true){
            num=sc.nextInt();
            if(num==-1){break;}
            list.add(num);
        }
        System.out.println(list);

        System.out.println("-------------------------");

        //At index
        list.add(4,100);
        System.out.println(list);
        
        System.out.println("-------------------------");
        //At first
        list.addFirst(450);
        System.out.println(list);

        System.out.println("-------------------------");
        //At last
        list.addLast(100);
        System.out.println(list);

        System.out.println("-------------------------");

        // addAll

        int val;
        while(true){
            val=sc.nextInt();
            if(val==-1){break;}
            list.add(val);
        }
        System.out.println(list1);

        System.out.println("-------------------------");

        list.addAll(list1);
        System.out.println(list);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
/* 
        //get method
        System.out.println(list.get(5));
        // size method
        System.out.println(list.size());
        //clear method
        list1.clear();
        System.out.print(list1);
        // isEmpty method
        System.out.println(list1.isEmpty());
        //hashcode
        System.out.print(list.hashCode());
*/

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // remove index

        list.remove(3);
        System.out.println(list);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList arr=new ArrayList();

        int number;
        String str;
        char var;
        float f;
        while(true){
            number=sc.nextInt();
            str=sc.nextLine();
            var=sc.next().charAt(0);
            f=sc.nextFloat();
            arr.add(number);
            arr.add(str);
            arr.add(var);
            arr.add(f);
            System.out.println(arr);
            
        }
        
    }
}