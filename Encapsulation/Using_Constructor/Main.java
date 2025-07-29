import java.util.Scanner;

class Addition {
    private int a,b;

    Addition(int a,int b){
        this.a=a;
        this.b=b;
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
        Addition obj = new Addition(a,b);
        obj.add();   
    }
}