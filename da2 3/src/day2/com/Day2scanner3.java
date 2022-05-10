package day2.com;

import java.util.Scanner;

public class Day2scanner3 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ob =new Scanner (System.in);
System.out.println("enter m1");
int a = ob.nextInt();
System.out.println("enter m2");
int b = ob.nextInt();
System.out.println("enter m3");
int c = ob.nextInt();
System.out.println("enter m4");
int d = ob.nextInt();
System.out.println("enter m5");
int e = ob.nextInt();


int avrg = (a+b+c+d+e)/5;
System.out.println("average mark:"+avrg);

int sum = (a+b+c+d+e);
System.out.println("total mark:"+sum);
	}

}
