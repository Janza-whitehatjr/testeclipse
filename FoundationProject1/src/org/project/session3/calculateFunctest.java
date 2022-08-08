package org.project.session3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculateFunctest {
	Calculate testobj1 = new Calculate();
	

	@Test
	void test() {
		//fail("Not yet implemented");
		int pout= testobj1.perimeter(10, 5);
		assertEquals(30,pout);
		
	}
	@Test
	void test2() {
		//fail("Not yet implemented");
		double SIout= testobj1.simpleInterest(1000, 2, 2);
		assertEquals(40,SIout);
		
	}
	@Test
	void test3() {
		//fail("Not yet implemented");
		double CIout= testobj1.compoundInterest(1000, 5, 2);
		assertEquals(102.5, CIout);
		
	}

}
