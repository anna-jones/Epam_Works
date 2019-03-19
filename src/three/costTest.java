package three;

import static org.junit.Assert.*;

import org.junit.Test;
import three.cost;
public class costTest {

	@Test
	public void test() {
		
		cost t= new cost();
		double res=t.cost1("High",1000,"Yes");
		assertEquals(2500000,res,0);
	}

}
