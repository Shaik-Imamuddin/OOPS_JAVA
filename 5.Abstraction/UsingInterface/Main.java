import java.util.Scanner;

interface Addition{
    abstract void add();
}
class Subtraction implements Addition{
    int a,b;

    Subtraction(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        System.out.println(a+b);
    }
    void sub(){
        System.out.println(a-b);
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
