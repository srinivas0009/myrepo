package javap.com;

public class Child extends Static_variable {
int a = 45;
	public void docu(){
		// TODO Auto-generated constructor stub
		System.out.println(this .a);
		System.out.println(super.a);
		System.out.println("ratan");
		super.getdata();
		super.setdata();
	}
public void peace() {
	// TODO Auto-generated method stub
this.docu();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ob = new Child();
ob.peace();
	}

}
