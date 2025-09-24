public class Type_Con_Cast_Promo {
    public static void main(String[] args) {
        //1.type conversion
        int a = 345;
        float b =a ;
        System.out.println(b);
       /* 
        float c =65.0f;
        int d = c;
        System.out.println(d);  //error will be displayed ,cannot convert float to int 
*/
       char ch ='a';
       char ch2 = 'b';
       int num = ch;     //java mein hr char ka ka ek numer fixed hota hai .i.e, 'c' ka 99
       int num2=ch2;
       System.out.println(num +"\n" +num2);
       //2. type casting
       System.out.println("DISPLAY TYPE CASTING");
       char t ='A';
       int s =(int)(t);
       System.out.println(s);

       float demo = 99.999f;
       byte demo1 =(byte)demo;
       System.out.println(demo1);

       //3. type promotion
       char x ='s';
       char y ='t';
       System.out.println((int)x);
       System.out.println((int)y);
       System.out.println(x+y);

       int n1 = 8;
       float n2 = 45.0f;
       char n3 = 'd';
       long n4 = 455;
       System.out.println(n1+n2*n3/n4);
/* 
       byte br = 5;
       br = br* 2;
       System.out.println(br)
       */
      byte br =5;
      br = (byte)(br * 2);
      System.out.println(br);
    }
}
