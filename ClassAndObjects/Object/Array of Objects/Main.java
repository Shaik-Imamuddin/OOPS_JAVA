import java.util.Scanner;
class Student {
    int id;
    double marks;

    void display(){
        System.out.println("Roll NO "+id+" Scored "+marks+" Marks");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student s[] = new Student[n];

        for(int i=0;i<n;i++){
            int id = sc.nextInt();
            double marks = sc.nextDouble();
            s[i]=new Student();
            s[i].id = id;
            s[i].marks = marks;
        }

        //we can use either for or foreach loop

        // for(int i = 0; i < n; i++) {
        //     s[i].display();
        // }

        for(Student i:s) {
            i.display();
        }
    }    
}
