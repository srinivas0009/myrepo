package install;

import javax.security.sasl.Sasl;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class Interview_preperation_java {

	public static void main(String[] args) {

//		int n= 8;
//		boolean prime= true;
//		
//		for (int i = 2; i < n; i++) {
//			
//			if (n%i==0) {
//				prime= false;
//				break;
//				
//			}
//			
//		}
//		if (prime) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not prime");
//		}	

		// odd and even number in array

//		int a[]= {1,2,3,4,5,6,7,8,9,10,20,55,44,78,80,100,909,7000000};

//	for(int i=0;i<a.length;i++)
		// {
		// if(a[i]%2==0)
		// System.out.println("even number"+a[i]);
		// }
		// for(int i=0;i<a.length;i++)
		// {
		// if(a[i]%2!=0)
		// System.out.println("odd numer"+a[i]);
		// }

		// String s ="learn java learn java selenium learn framework";
		// int count;

		// String word[] = s.split(" ");

		// System.out.println("duplicate words");
		// for(int i=0;i<word.length;i++) {
		// count=1;
		// for(int j=i+1;j<word.length;j++) {
		// if(word[j].equals(word[i])){
		// count++;
		// word[j]="0";
		// }
		// if(count>1 && word[i]!="0") {
		// System.out.println(word[i]);
		// }
		// }
//}

		String s= "ABBA";
		
		String rev = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}
		else {System.out.println("not palindrome");}
		
		
	String sr = "i like java i learn java";
	
	String[] spl = sr.split(" ");
	
	for(int i =spl.length-1;i>=0;i--) {
		
		System.out.print(spl[i]+" ");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}