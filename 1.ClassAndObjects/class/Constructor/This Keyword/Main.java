import java.util.Scanner;
class Student{
    int n;
    double m;

    Student(int n,double m){
        this.n=n;
        this.m=m;
    }

    void display(){
        System.out.println("Roll NO "+n+" Scored "+m+" Marks");
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m = sc.nextDouble();
        Student obj = new Student(n,m);
        obj.display();
    }
}
