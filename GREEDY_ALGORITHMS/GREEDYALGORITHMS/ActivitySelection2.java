package GREEDY_ALGORITHMS.GREEDYALGORITHMS;
import java.util.* ;

public class ActivitySelection2 {
    public static void main(String[] args) {
        int start [] = {0 , 1 , 3 , 5 , 5 , 8};
        int end [] = {6 , 2 , 4 , 7 , 9 , 9};

        //sorting -- on the basis of end time 
        int activities [][] = new int [start.length][3];         //in this array we have stored index , start and end time

        for(int i = 0 ; i < activities.length ; i++){
            activities[i][0] = i ;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function --> shortform
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));   

        //endTime basis sorted
        int maxAct = 0 ;
        ArrayList <Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1 ;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i = 1 ; i < activities.length ; i++){
            //select activity
            if(activities[i][1] >= lastEnd){
               maxAct++;
               ans.add(activities[i][0]);
               lastEnd = activities[i][2];
            }
        }

        System.out.println("maximum activity : "+ maxAct);

        for(int i = 0 ; i < ans.size() ; i++){
            System.out.print("A"+ans.get(i)+" ");
        } 
        System.out.println();
        
    }
}
