package ARRAYLIST;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

    public static void print(ArrayList <Integer> list){       //printing 

        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(6);

        print(list);

        Collections.sort(list);              //sorting
        print(list);

        Collections.sort(list , Collections.reverseOrder());     //descending order
        print(list);
    }
}
