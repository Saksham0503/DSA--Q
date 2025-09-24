package STACKS;
import java.util.*;
public class StackNextGreaterElement {

    public static void nxtGreater (int arr [], int nxtGrt[]){

        Stack <Integer> s = new Stack<>();
        
        for(int i = arr.length-1 ; i >=0 ; i--){     //we are finding the greater number to the right
            
            int curr = arr[i];
            while(!s.isEmpty() && curr > arr[s.peek()]){
                s.pop();   //pop all the smaller values in the right 
            }
            if (s.isEmpty()){
                nxtGrt [i] = -1;
            }else{
                nxtGrt [i]= arr[s.peek()];
            }

            s.push(i);  //add curr index each time in stack
        }
    }
    public static void main(String[] args) {
        
        int arr []= { 6 , 8 ,0 , 1 , 3};
        int nxtGrt [] = new int[arr.length];

        nxtGreater(arr, nxtGrt);  //calling the function

        //printing
        for(int i = 0 ;  i< nxtGrt.length ; i++){
            System.out.print(nxtGrt[i] + " ");
        }
        System.out.println();
    }
}
