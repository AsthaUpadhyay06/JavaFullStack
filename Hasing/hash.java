

import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        HashMap <String,Integer>map=new HashMap<>();
    map.put("india",34);
    map.put("china",44);
    System.out.print(map);
    if(map.containsKey("chine")){
        System.out.println("present");
    }
    else{
        System.out.println("not");
    }
    System.out.println(map.get("china"));

    for(Map.Entry<String,Integer>e:map.entrySet()){
        System.out.println(e.getKey());
         System.out.println(e.getValue());
    }
    }
    Set<String> keys=map.KeySet();
    for(String key:keys){
        System.out.println(key+ " "+map.get(key));
    }

    

    
 
}
