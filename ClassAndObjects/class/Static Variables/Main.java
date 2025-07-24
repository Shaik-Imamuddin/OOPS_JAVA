//if you want to access static property in a static property
//we can Directly Access by using className without Creating any Object

import java.util.Scanner;

class Student{
    static int id;
    static double marks;
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student.id = sc.nextInt();
        Student.marks = sc.nextDouble();
        System.out.println("Roll NO "+Student.id+" Scored "+Student.marks+" Marks");
    }
}
