package OOPS;
public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.sum(2, 4);
        System.out.println(calc.sum(2, 4));

        calc.sum(0.23f, 2.25f);
        System.out.println(calc.sum(0.23f, 2.25f));

        calc.sum(2, 4,6);
        System.out.println(calc.sum(2, 4,6));
 
        //---------------------------------------

        Deer d = new Deer();
        d.eats();
    }
}

class Calculator {

    // function overloading
    int sum(int a , int b){               //function 1
        return a + b ;
    }

    float sum(float a , float b){         //function 2
        return a + b ;
    }

    int sum(int a , int b, int c){        //function 3
        return a + b + c ;
    }
}

//method overriding
class Animal{            //parent class

    void eats(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{              //child class

    void eats(){
        System.out.println("eats grass");
    }
}



