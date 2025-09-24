package GREEDY_ALGORITHMS.GREEDYALGORITHMS;
import java.util.* ;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int values [] = {60 , 100 , 120};          //value
        int weight [] = {10 , 20 , 30};           //weight
        int W = 50;            // capacity of sack 

        double ratio [][] = new double [values.length][2];

        for(int i = 0 ; i < ratio.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = values[i]/(double)weight[i];
        }

        //sorting --> ascending order 
        Arrays.sort(ratio , Comparator.comparingDouble (o -> o[1]));
        
        //calulating total value
        double totVal = 0 ;
        int capacity = W ;
        
        //but we want it in decending order 
        for (int i = values.length- 1 ;i>=0; i--){

            int idx = (int)ratio[i][0] ;        //index 

            if(capacity >= weight[idx] ){     //include full item
                totVal += values[idx];
                capacity -= weight[idx];
            }else{                         //include fractional item
                totVal +=(capacity*ratio[i][1]);
                capacity = 0 ;
                break;
            }
            
        }
        System.out.println("total value is : "+totVal);     //printing total capacity
    }
} 
