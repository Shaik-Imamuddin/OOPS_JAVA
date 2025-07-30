//super() - method is used to call the parent call constructor
//we can access the data members in child class which is intilized in the parent class

import java.util.Scanner;

class Addition{
    int a,b;

    Addition(int a,int b){
        this.a=a;
        this.b=b;
    }
    void add(){
        System.out.println(a+b);
    }
}

class Subtraction extends Addition{
    Subtraction(int a,int b){
        super(a,b);
    }
    void sub(){
        System.out.println(a-b);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        Subtraction obj = new Subtraction(a,b);
        obj.add();
        obj.sub();
    }
}
