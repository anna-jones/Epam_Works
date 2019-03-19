package one;

import static org.junit.Assert.*;
import one.Calc;
import org.junit.Test;

public class div {

	@Test
	public void test() {
		
		Calc test= new Calc();
		int answer=test.div(6,2);
		assertEquals(3,answer);
	}

}
