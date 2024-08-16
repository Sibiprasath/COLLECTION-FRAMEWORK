import java.util.Scanner;
import java.util.TreeMap;


public class Hashmap{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //HashMap<String,Integer> map=new HashMap<>();
        // LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("idli",10);
        map.put("dosa",20);
        map.put("poori",45);
        System.out.print(map);
        
    }
}