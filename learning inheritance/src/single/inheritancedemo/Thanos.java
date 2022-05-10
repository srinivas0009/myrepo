package single.inheritancedemo;

public class Thanos extends Aliens1{

	public void aeroplane() {
		System.out.println("airasia");
	}

	public static void main(String[] args) {
		Thanos ob = new Thanos ();
        ob.aeroplane();
        ob.bike();
        ob.car();
        
	}
	

}
