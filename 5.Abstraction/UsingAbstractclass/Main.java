import java.util.Scanner;

abstract class Addition{
    int a,b;
    
    Addition(int a,int b){
        this.a=a;
        this.b=b;
    }
    abstract void add();
}
class Subtraction extends Addition{
    
    Subtraction(int a,int b){
        super(a,b);
    }
    void sub(){
        System.out.println(a-b);
    }
    void add(){
        System.out.println(a+b);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Subtraction obj = new Subtraction(a,b);
        obj.add();
        obj.sub();     
    }
}
