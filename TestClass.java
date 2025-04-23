package junitpracticetestingutil;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junitpractice1.TestUtils;

//import org.junit.Test;

public class TestClass {
	
	TestUtils utils;
	
	@Before
	public void setup() {
		utils=new TestUtils();
		System.out.println("hello");
	}
	
	/*@Test
	public void assertEqualsAddition() {
		
		TestUtils utils=new TestUtils();
		int result=utils.add(10,5);
		assertEquals(15,result);
		//assertNotEquals(15,result);
	}
	
	@Test
	/*public void assertCheck() {
		
		List<Integer>data=Arrays.asList(1,2,3,4);
		List list=utils.returnList(data);
		for(Object o: list) {
			Integer i= (Integer)o;
			assertTrue(i%2==0);
			
		}
	}
	
	@After
	public void closeResource() {
		System.out.println("hi");
		this.utils=null;
	}*/
	
	
	@Test
	public void checkEqualArray() {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {1,2,3,4,5};
		assertArrayEquals(arr1,arr2);
		
	}
	
	
	@Test
	
	public void checkException() {
			assertThrows(ArithmeticException.class,()->{
				utils.div(10, 0);
			});
			
		
	}
	
}
