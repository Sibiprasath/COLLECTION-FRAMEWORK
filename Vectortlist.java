import java.util.Vector;

class Vectorlist {

    public static void main(String[] args) {
    
    Vector<Integer> vc=new Vector<>();
    
    System.out.println(vc);
    
    vc.add(10);
    
    vc.add(20);
    
    vc.add(30);
    
    vc.add(40);
    
    System.out.println(vc);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    vc.addElement(100);
    System.out.println(vc);
    
    System.out.println(vc.clone());

    System.out.println(vc.contains(10));

    vc.indexOf(1000,3);
    System.out.println(vc);
    
    }
    
}