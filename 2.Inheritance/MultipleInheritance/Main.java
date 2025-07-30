interface Parent1{
    abstract void par1mthd();
}
interface Parent2{
    abstract void par2mthd();
}
class Child implements Parent1,Parent2{
    public void par1mthd(){
        System.out.println("Parent 1 Properties");
    }
    public void par2mthd(){
        System.out.println("Parent 2 Properties");
    }
    void child(){
        System.out.println("Child method");
    }
}
public class Main
{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.par1mthd();
		obj.par2mthd();
		obj.child();
	}
}
