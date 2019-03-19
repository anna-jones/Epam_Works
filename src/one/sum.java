package one;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class sum {

	@Test
	public void test() {
		
		Calc test= new Calc();
		int arr[]= {5,6,7,8,9,10};
		
		int result=test.sum(arr);
		assertEquals(45,result);
	}

}
