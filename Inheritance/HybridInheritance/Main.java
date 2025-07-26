class Grandparent{
    void grdprop(){
        System.out.println("Grand Parent Properties");
    }
}

class Parent extends Grandparent{
    void parprop(){
        System.out.println("Parent Properties");
    }
}

class Child1 extends Parent{
    void chld1prop(){
        System.out.println("Child1 Properties");
    }
}

class Child2 extends Parent{
    void chld2prop(){
        System.out.println("Child2 Properties");
    }
}
public class Main {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.chld1prop();
        obj.parprop();
        obj.grdprop();
        Child2 obj1 = new Child2();
        obj1.chld2prop();
        obj1.parprop();
        obj1.grdprop();
    }    
}
