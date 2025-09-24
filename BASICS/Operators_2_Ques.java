public class Operators_2_Ques {
    public static void main(String[] args) {
        //question 1
        int x = 2 , y = 5;
        int exp1 = (x * y /x);
        int exp2 =(x * (y/x));
        System.out.println(exp1 + " , ");
        System.out.println(exp2);

        //question 2
        int x1 = 200, y1 = 50 ,z1 =100;
        if(x1 > y1 && y1> z1){
            System.out.println("hello");
        }
        if(z1 > y1 && z1 < x1){
            System.out.println("Java");
        }
        if((y1+200) < x1 && (y1 +150)< z1){
            System.out.println("Hello Java");
        }

        //Question 3 
        int x2 ,y2,z2 ;
        x2 = y2 = z2 = 2;
        x2 += y2;  //now x2 is 4
        y2 -= z2;  // now y2 is 0
        z2 /= (x2 +y2);  //now z2 is 0.5 ,but java will read it as 0
        System.out.println(x2 + " " +y2 +" " + z2);

        //question 4
        int x3 = 9, y3 = 12;
        int a =2 ,b = 4, c = 6;
        int exp = 4/3 * (x3 + 34) + 9 * (a + b * c) + (3 + y3 * (2 + a)) / (a + b * y3);
        System.out.println(exp);
          
        //question 5
        int p =10 , q = 5;
        int exp3 = ( q * (p /q + p/ q));
        int exp4 = (q * p/q + q * p / q);
        System.out.println(exp3);
        System.out.println(exp4);
    }
 
}