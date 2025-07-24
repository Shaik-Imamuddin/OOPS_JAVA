//if you want to access instance property in a static property
//the only way we can Access is by Creating a Object

import java.util.Scanner;

class Student{
    void display(int n,double m){
        System.out.println("Roll NO "+n+" Scored "+m+" Marks");
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();
        int n = sc.nextInt();
        double m = sc.nextDouble();
        obj.display(n,m);
    }
}
