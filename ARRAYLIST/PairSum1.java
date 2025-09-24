package ARRAYLIST;

import java.util.ArrayList;

public class PairSum1 {

    // brute approach
    public static boolean isSum(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                int sum = list.get(i) + list.get(j);

                if (sum == target) {
                    return true;
                }

            }
        }

        return false;
    }

    // 2 pointer approach
    public static boolean ispairSum (ArrayList <Integer> list , int target){

        int lp = 0 ; 
        int rp = list.size() - 1 ;

        while(lp < rp){
            int sum = list.get(lp) + list.get(rp) ;
            
            if(sum == target){
                return true;
            }

            if(sum < target){
                lp++ ;
            }else{
                rp-- ;
            }

        } 
        return false ; 
    
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);  //sorted arrayList

        int target = 5;
        System.out.println(isSum(list, target));                 // calling the function 1
        System.out.println(ispairSum(list, target));            //calling the function 2
    }
}
