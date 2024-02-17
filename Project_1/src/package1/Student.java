package package1;

// 1) it is like method
// 2) constructor name and class name will be same
// 3) no return type
// 4) no need to call, it will call automatically when the object
// of the class will be created

public class Student {
	
	public void m1()
	{
		this.m2();
		System.out.println("first method changes done by deepak");
		this.m2();
	}
	public void m2()
	{
		System.out.println("second method");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.m1();
	}
}
