package learnstring.com;

public class STRINGLErn {

public static void main(String[] args) {
	String s = "             i am going to be a good programmer one day";
	
	int length=s.length();
	System.out.println(length);

	boolean equals = s.equals("i am going to be a good programmer");
	System.out.println(equals);
	
	boolean equalsIgnoreCase=s.equalsIgnoreCase("i am going to be a good Programmer one day");
	System.out.println(equalsIgnoreCase);
	
	String toUppercase= s.toUpperCase();
	System.out.println(toUppercase);
	
	String toLowercase=s.toLowerCase();
			System.out.println(toLowercase);
			
	boolean startswith=s.startsWith("h");
	System.out.println(startswith);
	
	boolean endswith=s.endsWith("y");
	System.out.println(endswith);
	
	boolean contains=s.contains("z");
	System.out.println(contains);
	
	int index=s.indexOf("i");
	System.out.println(index);
	
	int lastIndexof =s.lastIndexOf("e");
	System.out.println(lastIndexof);
	
	char charAt= s.charAt(5);
	System.out.println(charAt);
	
	String replace =s.replace("i", "you");
	System.out.println(replace);
	
	String substring = s.substring(18);
	System.out.println(substring);
	
	String substring2 = s.substring(18,24);
	System.out.println(substring2);
	
	boolean empty =s.isEmpty();
	System.out.println(empty);
	
	String [] split = s.split(" ");
	System.out.println(split[3]);
	
	String trim =s.trim();
	System.out.println(trim);
	
	String s1 = "a";
	String s2 = "b";
	
	int compareTo = s1.compareTo(s2);
	System.out.println(compareTo);
	
	String s3 = "g";
	String s4 = "f";
	
	int compareto = s3.compareTo(s4);
	System.out.println(compareto);
	
	String s5 = "A";
	String s6 = "A";
	
	
	int comarify = s5.compareTo(s6);
	System.out.println(comarify);
	
	String concat =s5.concat(s6);
	System.out.println(concat);
	

	
	
}

}
