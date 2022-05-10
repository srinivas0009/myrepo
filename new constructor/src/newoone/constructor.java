package newoone;



public class constructor {
int a,b;
	public constructor() {
		// TODO Auto-generated constructor stub
		System.out.println("default");
	}
public constructor(int d,int c) {
	// TODO Auto-generated method stub
	a=d;
	b=c;

}
public void method() {
	// TODO Auto-generated method stub
System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor ob = new constructor ();
constructor ob1 = new constructor(25,25);
ob1.method();
	}

}
