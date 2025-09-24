public class DecToBinary {
    /* 
    //function 1
    public static void decToBin1 (int decNum){
        int myNum = decNum;
        int binNum =0;
        while(decNum>0){
            binNum = (10*binNum)+(decNum%2);  
            decNum= decNum/2;
        }
        System.out.println("the binary number of "+myNum  +" is "+ binNum);
        return;
    }
    */
    //function 2
    public static void decToBin2(int decNum){
        int myNum =decNum;
        int binNum=0;
        int power =0;
        while(decNum>0){
            binNum=binNum + (decNum%2 * (int)(Math.pow(10, power)));
            power++;
            decNum=decNum/2;
        }
        System.out.println("the binary number of "+myNum + " is "+ binNum);

    }
    public static void main(String[] args) {
       /* decToBin1 (12);//calling a function 1  //ye logic galat ho gya 
       */
        decToBin2 (12 );//calling a function 2
    }
}
