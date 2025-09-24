public class BinaryToDecimal {
    //function 1
    public static void binToDec (int binNum){
        int myNum = binNum;  //myNum mein binNum ki value store krwa rhe hai
        int power =0 ;
        int decNum =0;

        while(binNum>0){
           int lastdigit = binNum % 10;
           decNum =decNum + (lastdigit * (int)Math.pow(2, power));  //in built function use kiya hai and type casting ki hai
           
           power ++;
           binNum = binNum /10;
        }
        System.out.println("the decimal number of "+myNum+" is "+decNum);
        return;
    }
    public static void main(String[] args) {
        //learning conversion from binary to decimal
        binToDec(101); //calling a function
    }
}