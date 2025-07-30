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
        obj.display();  // Child class override the parent class method
        //downcasting -> type casting the parent object into child and storing it in another child object
        Child c = (Child) obj;
        c.childOnlyMethod();  // Now we can access Child-specific methods
    }
}
