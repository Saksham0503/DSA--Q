package ARRAYLIST;
import java.util.ArrayList;
public class ArrListB {
    public static void main(String[] args) {
        
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <String> list2  = new ArrayList<>();
        ArrayList <Boolean> list3 = new ArrayList<>();

        //add element 
        list1.add(2);
        list1.add(4);
        list1.add(0);
        list1.add(5);
        list1.add(2,3);

        System.out.println(list1.size());   //5  --> size of arraylist
        System.out.println(list1);   //2,4,3,0,5

        //get element
        int element = list1.get(0);
        System.out.println(element);     //2

        //remove
        list1.remove(4);
        System.out.println(list1);     //2,4,3,0

        //set
        list1.set(1,7);
        System.out.println(list1);   //2,7,3,0

        //contains
        System.out.println(list1.contains(31));
        System.out.println(list1.contains(2));

        for(int i = 0 ; i < list1.size() ; i++){
            System.out.print(list1.get(i)+" ");  
        }
        System.out.println();
        
    }
}
