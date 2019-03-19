package two;

import static org.junit.Assert.*;

import org.junit.Test;

public class sitest {

	@Test
	public void test() {
		
		Intcalc t= new Intcalc();
		double res=t.simple(1000, 5, 4);
		assertEquals(200,res,0.001);
	}

}
