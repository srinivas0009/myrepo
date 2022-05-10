package com.testng;

import org.testng.annotations.Test;

public class Groups {
@Test(groups = "sports")
	public void football() {
		System.out.println("football");
	}
@Test(groups = "sports")
	public void cricket() {
		System.out.println("cricket");
	}
@Test(groups = "sports")
	public void volleyball() {
		System.out.println("volleyball");
	}
@Test(groups="books")
	public void sciencebook() {
		System.out.println("science");
	}
@Test(groups = "books")
	public void mathsbook() {
		System.out.println("maths");
	}
@Test(groups="books")
	public void englishbook() {
		System.out.println("english");
	}
@Test(groups = "socialmedia")
public void insta() {
	System.out.println("instagram");
}
@Test(groups = "socialmedia")
public void facebook() {
	System.out.println("facebook");
}
@Test(groups="socialmedia")
public void telegram() {
	System.out.println("telegram");
}

}
