package reverse.string;

public class Mutable {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer t = new StringBuffer("welocome to java");
StringBuffer y = new StringBuffer("welocme to java");
StringBuffer rev=t.reverse();
System.out.println(rev);


System.out.println(t.hashCode());
System.out.println(y.hashCode());

t.append(y);
System.out.println(t);
System.out.println(t.hashCode());
	}

}
