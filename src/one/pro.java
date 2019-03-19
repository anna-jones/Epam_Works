package one;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class pro {

	@Test
	public void test() {
		
		Calc test= new Calc();
		int arr[]= {6,7};
		
		int result=test.multiply(arr);
		assertEquals(42,result);
	}

}
