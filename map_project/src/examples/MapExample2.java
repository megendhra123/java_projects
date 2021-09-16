package examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String args[]){
        Employee emp=new Employee("magi","Gudiyattam");
        Map<Integer,Employee> map=new HashMap<Integer,Employee>();
        map.put(1001,emp);
        for(Map.Entry<Integer,Employee> entries:map.entrySet()){
            System.out.println("Emp Id : "+entries.getKey());
            System.out.println("Emp Name : "+entries.getValue().empName);
            System.out.println("Emp Location"+entries.getValue().empLocation);
        }

    }
}
