package ARRAYLIST;

import java.util.ArrayList ;
public class ArrListBasics {

    //swap by method 2
    public static void swap(ArrayList <Integer> list , int idx1 , int idx2){

        int temp = list.get(idx1) ;
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void print(ArrayList <Integer> list ){
       
        for(int i = 0 ; i < list.size() ; i++){
           System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
   public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>();
    
    list.add(0);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(6);
    list.add(9);
    
    System.out.println(list);       // print

    //reverse
    for(int i = list.size()-1 ; i >= 0 ; i--){

        System.out.print(list.get(i)+" ");
    }
    System.out.println();

    // maximum in arraylist 

    int max = Integer.MIN_VALUE ;      // -INFINITY

    for(int i = 0 ; i < list.size() ; i++){
        
        if(list.get(i) > max){
            max = Math.max(max, list.get(i));
        }
    }
    System.out.println(max);

    // swap
    int idx1 = 1 , idx2 = 2 ;
    
    int temp = list.get(idx1);
    list.set((idx1) , list.get(idx2)); 
    list.set((idx2) , temp);

    System.out.println(list);

    // calling swap 2
    swap(list, 0, 3);
    print(list);   //caling print function
     
   }
}
