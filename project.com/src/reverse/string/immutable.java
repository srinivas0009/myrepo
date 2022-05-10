package reverse.string;

public class immutable {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
String t = "i love java";
String y = "i love java";

System.out.println(System.identityHashCode(t));
System.out.println(System.identityHashCode(y));
	 
t=t+y;

System.out.println(t);
System.out.println(t.hashCode());
}
}