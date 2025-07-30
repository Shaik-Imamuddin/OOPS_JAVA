import java.util.Scanner;
class Student{
    int n;
    double m;

    Student(int a,double b){
        n=a;
        m=b;
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
