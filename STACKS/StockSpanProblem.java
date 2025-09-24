package STACKS;
import java.util.* ;
public class StockSpanProblem {
    
    public static void stockSpan (int stocks [] , int span []){

        Stack <Integer> s = new Stack <>();
        span[0] = 1 ;        //span at very first day 
        s.push(0);     //index of first day stock

        for(int i = 1 ; i < stocks.length ; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){   //till the stack is not empty and currPrice > previousHigh
                   
                s.pop();  //we have to pop all the small values
            }

            if(s.isEmpty()){
                span[i] = i+1;     
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh ;
            }

            s.push(i);   //adding curr indx to the stock
        }
    }
    public static void main(String[] args) {
      
        int stocks [] = { 100 , 80 , 60 , 70 , 60 , 85 , 100};
        int span [] = new int[stocks.length];

        stockSpan(stocks, span);
        //printing
        for (int i = 0 ; i < span.length ; i++){
            System.out.print(span[i] + " ");
        }
        System.out.println();
    }
}
