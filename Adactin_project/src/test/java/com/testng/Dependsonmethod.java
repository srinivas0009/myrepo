package com.testng;

import org.testng.annotations.Test;

public class Dependsonmethod {
	
	
	
	      @Test
          public void mobiles() {
			System.out.println("adi offer");
		}
          @Test
          public void laptop() {
			System.out.println("new year offer");
		}
          
          @Test(dependsOnMethods = "mobiles")
          public void adioffer() {
			System.out.println("adi offer");
		}
          
}
