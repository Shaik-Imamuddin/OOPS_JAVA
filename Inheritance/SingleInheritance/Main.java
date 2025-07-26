class Parent {
    void parprop(){
        System.out.println("Parent Properties");
    }
}

class Child extends Parent {
    void chldprop(){
        System.out.println("Child Properties");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.chldprop();
        obj.parprop();
    }    
}