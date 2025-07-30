import java.util.Scanner;

class Addition{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = sc.nextDouble(); 
        double e = sc.nextDouble(); 
        Addition obj = new Addition();
        obj.add(a,b);//method with 2 integer parameters called
        obj.add(c,d);//method with 1 integer 1 double parameters called
        obj.add(d,e);//method with 2 Double parameters called
        //obj.add(a,b,e);//no method with 2 integer and 1 double parameter it will returns error
        obj.add(a,b,c);//Method with 3 integer parameters called
	}
}
