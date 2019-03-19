package two;

import static org.junit.Assert.*;

import org.junit.Test;
import java.text.DecimalFormat;
public class citest {
	
	private static DecimalFormat df = new DecimalFormat(".##");

	@Test
	public void test() {
		
		Intcalc t= new Intcalc();
		double result=t.compound(5000,5,10);
		String ans=df.format(result);
		String exp="3144.47";
		assertEquals(exp,ans);
	}

}
