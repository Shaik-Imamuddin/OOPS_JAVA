//if you want to access static property in a static property
//we can Directly Access by using className without Creating any Object

import java.util.Scanner;

class Student{
    static void display(int n,double m){
        System.out.println("Roll NO "+n+" Scored "+m+" Marks");
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m = sc.nextDouble();
        Student.display(n,m);
    }
}
