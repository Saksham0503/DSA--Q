package ARRAYLIST;

import java.util.ArrayList;

public class PairSum2 {

    public static boolean ispairSum (ArrayList <Integer> list , int target){

        int N = list.size();
        int bp = -1 ;
        for(int i = 0 ; i < list.size() ; i++){
        
            if(list.get(i)>list.get(i+1)){
                bp = i;    //breaking point
                break ;       
            }

        }

        int lp = bp + 1;
        int rp = bp;
        while(lp < rp){
            
            int sum = list.get(lp) + list.get(rp);
            if(sum == target){
                return true;
            }

            if(sum < target){
                lp= (lp + 1)% N;
            }else{
                rp = (N + rp-1)%N;
            }

        }

        return false;
    }
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>() ;
        
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16 ;
        System.out.println(ispairSum(list, target));          //calling the function
    }
}
