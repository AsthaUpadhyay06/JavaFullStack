import java.util.HashSet;
import java.util.Iterator;

public class hasset {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
       //insert 
       set.add(3);
       set.add(3);
       set.add(4);
       
    //    System.out.println(set);
    //    if(set.contains(4)){
    //     System.out.println("present");}
    //     else{
    //         System.out.println("not present");
    //     }
       
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
