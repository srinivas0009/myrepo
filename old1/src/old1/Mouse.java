package old1;

public class Mouse extends Cpu {

	public void cpu(float f) {
		// TODO Auto-generated constructor stub
		System.out.println(f);
		
	}
public void cpu1() {
	// TODO Auto-generated method stub
super.cpu1('m');
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mouse ob = new Mouse();
ob.cpu('a');
ob.cpu(55);
ob.cpu(0.3f);
ob.cpu(5, 5);
ob.cpu1('p');
	}

}
