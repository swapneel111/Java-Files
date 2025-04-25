package junitpractice1;

import java.util.List;

public class TestUtils {
	public int add(int x,int y) {
		return x+y;
	}
	public List returnList(List list) {
		return list;
	}
	
	public int div(int x,int y) throws ArithmeticException {
		if(y!=0) {
			return x/y;
			
		}
		throw new ArithmeticException("The denominator is zero");
		
	}
}
