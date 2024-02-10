package package1;

// for one object------5 calls for assigning the value
// for printing the values-----5 calls for printing the values
// single object---------5+5----10 calls
// 10 objects---------10*10----100 calls
public class Solution1 {
	
	int a,b,c,d,e;
	
	public static void main(String[] args) 
	{
	  Solution1 obj1=new Solution1();
	  obj1.a=12;  // 1
	  obj1.b=33; // 2
	  obj1.c=344;  // 3
	  obj1.d=34;   // 4
	  obj1.e=444;   // 5
	  
	  System.out.println(obj1.a);
	  System.out.println(obj1.b);
	  System.out.println(obj1.c);
	  System.out.println(obj1.d);
	  System.out.println(obj1.e);
	  
	  
	}

}
