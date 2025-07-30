import java.util.Scanner;
class Student {
    int id;
    double marks;

    void display(){
        System.out.println("Roll NO "+id+" Scored "+marks+" Marks");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();  // First object
        s1.id=1;
        s1.marks=100;
        Student s2 = new Student();  // Second object
        s2.id=2;
        s2.marks=95;
        s1.display();
        s2.display();
    }
}