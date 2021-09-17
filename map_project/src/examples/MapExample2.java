package examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample2 {
    public static void main(String args[]){
        List<Employee> employeeList=new ArrayList<Employee>();
        Map<Integer,Employee> map=new HashMap<Integer,Employee>();
        Employee emp;

        emp=new Employee("Employee 1","Location1");
        map.put(1001,emp);

        emp=new Employee("Employee 2","Location2");
        employeeList.add(emp);
        map.put(1002,emp);

        emp=new Employee("Employee 3","Location3");
        employeeList.add(emp);
        map.put(1003,emp);

        emp=new Employee("Employee 4","Location4");
        employeeList.add(emp);
        map.put(1004,emp);

        for(Map.Entry<Integer,Employee> entry:map.entrySet()){
            System.out.println("Employee Id : "+entry.getKey());
            System.out.println("Employee Name : "+entry.getValue().empName);
            System.out.println("Employee Location : "+entry.getValue().empLocation);
            System.out.println( );
        }



    }
}
