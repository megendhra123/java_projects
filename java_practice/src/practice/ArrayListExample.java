package practice;

import java.util.ArrayList;

public class ArrayListExample {

    void showArrayList(ArrayList<String> list){
        for(String sList:list){
                System.out.println(sList);
        }
    }
    public static  void main(String args[]){
         ArrayListExample arrayListExample=new ArrayListExample();
        ArrayList<String> list=new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        System.out.println("List Values : ");
        arrayListExample.showArrayList(list);
        list.remove("Four");
        System.out.println("\nList Values After remove 'Four' : ");
        arrayListExample.showArrayList(list);
        list.set(3,"Four");
        System.out.println("\nList Values After change index value 3 to 'Four' : ");
        arrayListExample.showArrayList(list);
        System.out.println("\nList Size : "+list.size());
        list.clear();
        System.out.println("\nList Size After Clear : "+list.size());
    }
}
