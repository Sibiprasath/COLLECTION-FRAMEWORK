
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Hashset{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
        TreeSet<Integer> set2=new TreeSet<>();

        int num;
        while(true){
            num=sc.nextInt();
            if(num==-1){break;}
            set.add(num);
            set1.add(num);
            set2.add(num);
        }
        System.out.println("Hashset");
        System.out.println(set);
        System.out.println("LinkedHashSet");
        System.out.println(set1);
        System.out.println("Tree Set");
        System.out.println(set2);

    }
}