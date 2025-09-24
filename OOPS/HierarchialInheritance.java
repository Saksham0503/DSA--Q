package OOPS;
public class HierarchialInheritance {
    public static void main(String[] args) {
        Bird Sparrow = new Bird();
        Sparrow.breathes();
        Sparrow.eats();
    }
}

//base class
class Animal{

    void eats(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("breathes");
    }
}

//derived class 1
class Fish extends Animal{

    void swim(){
        System.out.println("swims");
    }
}

//derived class 2
class Bird extends Animal{

    void fly(){
        System.out.println("fly");
    }
}

//derived class 3
class Mammal extends Animal{

    void walks(){
        System.out.println("walks");
    }
}
