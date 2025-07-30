//if you want to access instance property in a static property
//the only way we can Access is by Creating a Object

import java.util.Scanner;

class Student{
    int id;
    double marks;
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();
        obj.id = sc.nextInt();
        obj.marks = sc.nextDouble();
        System.out.println("Roll NO "+obj.id+" Scored "+obj.marks+" Marks");
    }
}
