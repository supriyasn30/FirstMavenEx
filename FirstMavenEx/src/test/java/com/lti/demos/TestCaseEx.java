package com.lti.demos;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCaseEx {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testCase1()
	{
		Assertions.assertEquals("Hello","Hello");
		Assertions.assertEquals(500, 200+300,"addition pass ");
	}
	
	@Test
	public void testAdd()
	{
		Calculator c = new Calculator();
		int r= c.add(300, 200);
		Assertions.assertEquals(500, r);
	}
	@Disabled
	@Test
	void testAssertEqual() {
		Assertions.assertEquals("ABC", "ABC");
		Assertions.assertEquals(20, 20, "optional assertion message");
		Assertions.assertEquals(2+2, 4);
	}
	
	@Test
	void testAssertFalse() {
		Assertions.assertFalse("FirstName".length() == 10);
		Assertions.assertFalse(10>20, "assertion message");
		
	}
	@Disabled
	@Test
	void testAssertNull() {
		String str1 = null;
		String str2 = "abc";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	
	@Test
	public void testEmptyArrayList() {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Assertions.assertEquals(0, a1.size());
		Assertions.assertTrue(a1.isEmpty());
		a1.add(100);
		a1.add(200);
		Assertions.assertEquals(0, a1.size());
	}

}
