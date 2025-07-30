package PackageB;
import PackageA.Student;

import java.util.Scanner;

class Sample extends Student {
    public void viewStudent(int a,double b) {
        display(a,b);  //here we can Access coz we inherited the parent class Student into sample class
    }
}

class Sample1 {
    public void viewStudent() {
        Student s = new Student();
        //display() is a protected method we can't access that without inheriting the parent class
        //if the method is outsude of the package
        // s.display(102, 88.0);  //if you uncommented this it will gives a compile time error here
        //and also in main method coz we are calling this viewStudent() method in main method
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sample obj = new Sample();
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.viewStudent(a,b);  

        Sample1 obj1 = new Sample1();
        //This will give a compile-time error 
        // if you un commented the display method in Sample1 class
        obj1.viewStudent();
    }
}