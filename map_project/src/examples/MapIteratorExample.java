package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorExample {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1001,"One");
        map.put(1002,"Two");
        map.put(1003,"Three");
        map.put(1004,"Four");
        map.put(1005,"Five");
        map.put(1006,"Six");
        Iterator itr=map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> entry=(Map.Entry<Integer, String>) itr.next();
            System.out.println("Key :"+entry.getKey());
            System.out.println("Values :"+entry.getValue());
        }
    }
}
