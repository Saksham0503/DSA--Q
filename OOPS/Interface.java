package OOPS;
public class Interface {
   public static void main(String[] args) {
     
    Queen q = new Queen();
    q.moves();

    Rook r = new Rook();
    r.moves();

    King k = new King();
    k.moves();

    //-----------------

    Bear bhalu = new Bear();
    bhalu.food();
    bhalu.hunts();

   } 
}

//interface 
interface ChessPlayer {
    void moves();           //function is abstract , public and without implementation
}

class Queen implements ChessPlayer{
    
    public void moves() {                           //function of interface is implemented by class
        System.out.println("up, down , right , left , diagonal(all 4 directions)"); 

    }
}

class Rook implements ChessPlayer{             
                                                //function of interface is implemented by class
    public void moves(){
        System.out.println("up , down , right , left");
    }
}

class King implements ChessPlayer{

    public void moves(){
        System.out.println("up, down , right, left - (by 1 step)");
    }
}


//implementing the concept of multiple inheritance
interface Herbivore{            //parent class A
    void food();
}

interface Carnivore{            //parent class B
    void hunts();
}

class Bear implements Herbivore , Carnivore {     //child class
    public void food(){
        System.out.println("eats plants and grass");
    }

    public void hunts(){
        System.out.println("kills and eat flesh");
    }
}

