//Upcasting is the process of treating a child class object as an object of its parent class. 
//It is done implicitly or explicitly, and only the methods and variables of the parent class can be accessed 
//(unless overridden methods are called, which support runtime polymorphism(method overriding)).

class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class");
    }

    void childOnlyMethod() {
        System.out.println("Method specific to Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();  // Upcasting
        // Parent obj = (Parent)new Child();  // Upcasting explicitly(same as above)
        obj.display();  // Child class (runtime polymorphism)
        //obj.childOnlyMethod(); //Not allowed, Parent reference can't access Child-specific methods
    }
}
