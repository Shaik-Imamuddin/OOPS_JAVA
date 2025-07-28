//Constructor overloading means having multiple constructors in a class 
//with different parameter lists (number, type, or order of parameters). 
//It allows creating objects in different ways.

import java.util.Scanner;
class Addition {
    Addition() {
        System.out.println("Default constructor called");
    }
    Addition(int a, int b) {
        System.out.println(a+b);
    }
    
    Addition(int a, double b) {
        System.out.println(a+b);
    }

    Addition(double a, double b) {
        System.out.println(a+b);
    }

    Addition(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();    
        int b = sc.nextInt();    
        int c = sc.nextInt();    
        double d = sc.nextDouble(); 
        double e = sc.nextDouble(); 
        
        Addition obj1 = new Addition();        //it will be automatically called at the time of object creation  
        Addition obj2 = new Addition(a, b);    //Constructor with 2 integer parameters called
        Addition obj3 = new Addition(c, d);    //Constructor with 1 integer and 1 double parameters called
        Addition obj4 = new Addition(d, e);    //Constructor with 2 double parameters called
        // Addition obj5 = new Addition(a,b,e);   //no Constructor with 2 integer and 1 double parameter it will returns error
        Addition obj6 = new Addition(a,b,c);   //Constructor with 3 integer parameters called
    }
}