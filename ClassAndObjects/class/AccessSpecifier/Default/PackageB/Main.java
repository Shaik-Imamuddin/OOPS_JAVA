package PackageB;

import PackageA.Student;

import java.util.Scanner;

class Sample extends Student {
    void viewStudent(int a,double b) {
        //Cannot access default method from different package even thoufh we have inherited the class
        Sample obj = new Sample();
        // obj.display(101, 92.5);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sample obj = new Sample();

        int a =sc.nextInt();
        int b =sc.nextInt();
        obj.viewStudent(a,b);
    }
}
