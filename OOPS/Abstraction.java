package OOPS;
public class Abstraction {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eats();
        h.walks();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eats();
        c.walks();

      //  Animal1 a = new Animal1() ;        --->> abstract class cannot have an object 
            
        

    }
}
    //abstract class
    abstract class Animal1{
        String color ;  

        Animal1(){          //constructors
           color = "grey"; 
        }

        void eats(){     //non abstract function
            System.out.println("animal eats ");

        }

        abstract void walks();      //abstract function
           
    }

    //sub class
    class Horse extends Animal1{
        
        void changeColor(){
            color = "black";
        }

        void walks(){              //abstract function ki implementation
            System.out.println("walks on 4 legs");
        }
    }

    //sub class
    class Chicken extends Animal1 {

        void changeColor(){
            color = "white";
        }

        void walks(){                //abstract function ki implementation
            System.out.println("walks on 2 legs");
        }
    }




