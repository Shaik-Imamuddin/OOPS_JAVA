//if you want to create only single object for a class
//we can assign static values(recomended)
//else we can also get the data fro the user

class Student{
    int id=1;
    double marks=100;

    void display(){
        System.out.println("Roll NO "+id+" Scored "+marks+" Marks");
    }
}

public class Main {
    public static void main(String[] args){
        Student obj = new Student();
        obj.display();
    }
}