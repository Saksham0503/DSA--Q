package GREEDY_ALGORITHMS.GREEDYALGORITHMS;

import java.util.ArrayList;

public class ActivitySelection1 {
     public static void main(String[] args) {
        int start [] = {1 , 3, 0 ,5 , 8 , 5};
        int end [] = {2 , 4 , 6 , 7 , 9 , 9};

        //end time basis sorted
        int maxAct = 0 ;
        ArrayList <Integer> ans = new ArrayList<>();     //isme hm kitni activities complete kr paa rhe hain use store krenge

        //1st activity 
        maxAct = 1 ;       
        ans.add(0);   
        int lastEnd = end[0];    //1st activity ka end time 

        for(int i = 1 ; i < end.length ; i++){
            //select activity
            if(start[i]>= lastEnd){
              maxAct++;
              ans.add(i);
              lastEnd = end[i];
            }
        }

        System.out.println("Maximum Activity :"+ maxAct);         //printing the total no. of activities being performed

        //we will now print our ans (i.e which activity was performed)
        for(int i =0 ; i < ans.size() ; i++){
            System.out.print("A"+ans.get(i)+" ");      //A0 - 0 , A1 - 1 , A2 - 2 , A3 - 3 , A4 - 4 , A5 - 5
        }
        System.out.println();
     }
}
