package org.sample;

import org.testng.annotations.Test;

public class Prior {

		@Test(priority=-1)
			void test6(){System.out.println("test6");}
		
		@Test(priority=7)
			void test7(){System.out.println("test7");}
		
}
