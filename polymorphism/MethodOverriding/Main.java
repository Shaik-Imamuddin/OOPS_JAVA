class Parent{
    void display(){
        System.out.println("Parent class");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("Child class");
    }
}
public class Main
{
	public static void main(String[] args) {
        Child obj = new Child();
        obj.display();//it will override parent class method
	}
}