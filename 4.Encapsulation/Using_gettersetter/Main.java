import java.util.Scanner;

class Addition {
    private int a,b;

    int getA(){
        return a;
    }

    public int getB() {
        return b;
    }
    
    public void setAB(int a,int b) {
        this.a = a;
        this.b = b;
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
        Addition obj = new Addition();
        obj.setAB(a, b);
        obj.add();   
    }
}