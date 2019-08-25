package org.sample;

import org.testng.annotations.Test;

public class Meter {
	@Test(priority=-10)
		void test1(){System.out.println("test1");}
	
	@Test(priority=9)
		void test2(){System.out.println("test2");}
	
	@Test(priority=-1)
		void test3(){System.out.println("test3");}
	@Test(priority=4)
		void test4(){System.out.println("test4");}
	
	@Test(priority=12)
		void test5(){System.out.println("tet5");}
	
}	
	
