package GREEDY_ALGORITHMS.GREEDYALGORITHMS;
import java.util.* ;

public class LongestChainPair {
    public static void main(String[] args) {
        int pairs [][] = {{5 , 24} , {5 , 28} , {39 , 60} ,{5 , 28} , {27 , 40} , {50 , 90}} ;

        //sorting --> ascending order 
        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));

        //1st pair
        int chainLen = 1 ;
        int last2End = pairs[0][1];          //end time of prev activity

        for(int i = 0 ; i < pairs.length ; i++){
            //select pairs
            if(pairs[i][0] >= last2End){
               chainLen ++ ;
               last2End = pairs[i][1];
            }
        }

        System.out.println("length of the chain is : "+ chainLen);
    }
}
