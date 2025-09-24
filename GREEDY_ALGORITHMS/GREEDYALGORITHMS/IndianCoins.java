package GREEDY_ALGORITHMS.GREEDYALGORITHMS;
import java.util.* ;
public class IndianCoins {
    public static void main(String[] args) {
        Integer coins [] = {1 , 2, 5 ,10 , 20 , 50 , 100 , 500 , 2000};
        int val = 591 ;

        //sorting --> descending order
        Arrays.sort(coins , Comparator.reverseOrder());

        //total no. of coins
        ArrayList <Integer> ans = new ArrayList<>() ;
        int count = 0 ;     //count of coins
        int amount  = val ;

        for(int i = 0; i < coins.length ; i++){
            if(amount >= coins[i]){
                while(amount >= coins[i]){
                    count++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }

        System.out.println("Total no. of coins : "+ count);
        
        for(int i = 0 ; i < ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
