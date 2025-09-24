package STACKS;
import java.util.* ;
public class HistogramArea {

    public static void maxRectArea (int height [], int nsl[] , int nsr []){
        int maxArea = 0 ;
        Stack <Integer> s = new Stack<>();

        //next smaller left 
        for(int i = 0 ; i < height.length ; i++){
            int curr = height[i];
            while(!s.isEmpty() && curr < height[s.peek()]){   //till stack is not empty and curr is smaller than top of stack 
                 s.pop();         //popping out larger 
            }

            if(s.isEmpty()){
                nsl[i] = -1 ;
            }else{
                nsl[i] = s.peek();
            }

            s.push(i); //adding the index of element

        }

        //next smaller right

        s = new Stack<>();    //emptying the already existing stack

        for(int i = height.length-1 ; i >= 0 ; i--){
            int curr = height[i];

            while(!s.isEmpty() && curr < height[s.peek()]){
                s.pop(); //popping out the larger 
            }

            if(s.isEmpty()){
                nsr[i] = height.length;
            }else{
                nsr[i] = s.peek();
            }

            s.push(i);  //adding the index of curr element
        }

        //currArea
        for(int i = 0 ; i < height.length ; i++){

            //width
            int width = nsr[i] - nsl[i] - 1 ;
            int currArea = width * height[i] ;

            maxArea = Math.max(maxArea, currArea);
        }
        
        System.out.println("the maximum area in histogram is : " + maxArea);
    }
    public static void main(String[] args) {
        
        int height [] = {2 , 1 , 5 , 6 , 2 , 3};
        int nsl [] = new int[height.length];
        int nsr [] = new int[height.length];

        maxRectArea(height , nsl ,nsr);  //calling the function
    }
}
