package GREEDY_ALGORITHMS.GREEDYALGORITHMS;
import java.util.*;
public class ChocolaProblem {
    public static void main(String[] args) {
       int n = 4 , m = 6 ;
       Integer costVer [] = {2, 1 , 3, 1 , 4};    //m-1
       Integer costHor [] = {4 , 1, 2};      //n-1

       //sorting in decending order
       Arrays.sort(costVer , Collections.reverseOrder());
       Arrays.sort(costHor , Collections.reverseOrder());
       
       int h =0 , v =0 ;    //pointers
       int hp =1 , vp = 1 ;     //pieces
       int cost = 0 ; 

       while(v < costVer.length && h < costHor.length){
            if(costVer[v] >= costHor[h]){
                //vertical cut
                cost += costVer[v]*hp ; 
                v++;
                vp++;
            }else{
                //horizontal cut
                cost += costHor[h]*vp;
                h++;
                hp++;
            }
       }

       //agar kuch bch gya toh 
       while(v < costVer.length){
          cost += costVer[v]*hp ;
          v++;
          vp++;
       }
       while(h < costHor.length){
          cost += costHor[h]*vp ;
          h++;
          hp++;
       }

       System.out.println("total cost is : "+ cost);
    }
}
