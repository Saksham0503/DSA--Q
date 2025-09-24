import java.util.Scanner;
public class Variables_1_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //question 1
        System.out.println("PRINTING AVERAGE OF NUMBERS --->>");
        System.out.println("ENTER FIRST NUMBER :");
        float n1 =sc.nextFloat();
        System.out.println("ENTER SECOND NUMBER :");
        float n2 = sc.nextFloat();
        System.out.println("ENTER THIRD NUMBER :");
        float n3 = sc.nextFloat();
        System.out.println("ENTER FOURTH NUMBER :");
        float n4 =sc.nextFloat();
        float average= (n1 + n2 +n3 + n4)/4;
        System.out.println("AVERAGE = "+average);
        //question 2
        System.out.println("AREA OF THE SQUARE IS --->>");
        System.out.println("ENTER SIDE ");
        float side = sc.nextFloat();
        float area = side*side;
        System.out.println("AREA = "+area);
        //question 3
        System.out.println("TOTAL bill OF ITEMS --->>");
        System.out.println("ENTER PEN PRICE :");
        float pen = sc.nextFloat();
        System.out.println("ENTER PENCIL PRICE :");
        float pencil = sc.nextFloat();
        System.out.println("ENTER ERASER PRICE :");
        float eraser =sc.nextFloat();
        float total = pen + pencil+eraser;
        System.out.println(" cost of items -->" + total);
        //QUESTION 3 WITH advanced problem
        float pengst = 0.18f * pen;
        float pencilgst = 0.18f * pencil;
        float erasergst = 0.18f* eraser;
        float gst = pengst+pencilgst+erasergst;
        System.out.println("gst on items -->"+ gst);
        float bill = total + gst;
        System.out.println("bill to payed -->" + bill);
        //question 4
        System.out.println("CHECKING THE RESULTANT DATA TYPE --> ");
        byte b =4;
        char c ='a';
        short s = 512;
        int i =1000;
        float f = 3.14f;
        double d = 99.9954;
        double  result = (f*b)+(i%c)-(d*s); //f,b-->float ; i,c-->int ;d,s-->double.THEN, float + int +double = double
        System.out.println("DATA TYPE IS DOUBLE =="+result);
        //Question 5
        System.out.println("TO CHECK WHETHER IT IS CORRECT OR INCORRECT --> ");
        int $ =35;
        System.out.println($);
    }
} 