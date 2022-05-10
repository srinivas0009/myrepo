package learnstring.com;

public class Valueof {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte  a = 127;
short b= 5555;
int c =33;
long d = 98421345L;
float e = 777.99F;
double f = 88787.7;
char g = 'v';
boolean m = false;


String  p = "welcome to my computer";


String valueof = p.valueOf(a);
System.out.println(valueof);

String valueof1 = p.valueOf(b);
System.out.println(valueof1);

String valueof2 = p.valueOf(c);
System.out.println(valueof2);

String valueof3 = p.valueOf(d);
System.out.println(valueof3);

String valueof4 = p.valueOf(e);
System.out.println(valueof4);

String valueof5=p.valueOf(f);
System.out.println(valueof5);

String valueof6 = p.valueOf(g);
System.out.println(valueof6);

String valueof7 = p.valueOf(m);
System.out.println(valueof7);


char[]x = p.toCharArray();
System.out.println(x[0]);



	}

}
