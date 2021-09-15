package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1001,"One");
        map.put(1002,"Two");
        map.put(1003,"Three");
        map.put(1004,"Four");
        map.put(1005,"Five");
        map.put(1006,"Six");
        System.out.println("Enter Id : ");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            if(id==entry.getKey()){
                System.out.println("Key : "+entry.getKey());
                System.out.println("Value : "+entry.getValue());
            }
        }
    }
}
