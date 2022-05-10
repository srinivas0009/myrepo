package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_passing {
	@Parameters({"uname","pass"})
	@Test
	private void credential(@Optional("admin")String uname, @Optional("1234") int pass) {
		System.out.println(uname);
		System.out.println(pass);
	}
}
