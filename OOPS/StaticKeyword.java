package OOPS;
public class StaticKeyword {
    public static void main(String[] args) {

        SchoolStudent s1 = new SchoolStudent();
        s1.schoolName = "RPM Academy";
        System.out.println(s1.schoolName);

        SchoolStudent s2 = new SchoolStudent();
        System.out.println(s2.schoolName);

        SchoolStudent s3 = new SchoolStudent();
        System.out.println(s3.schoolName);

        //changing school name 
        s3.schoolName = "Springer Lorreto";

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
    }
}

class SchoolStudent {
    String name ;
    int roll_no ;
    
    static String schoolName ;

    void setName(String name){
        this.name = name ;
    }

    String getName(){
        return this.name ;
    }

    static int returnPercentage( int maths , int phy , int chem){
        return (maths + phy + chem )/ 3 ;
    }
}
