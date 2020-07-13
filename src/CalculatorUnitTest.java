import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorUnitTest 
{
	Calculation cal=new Calculation();
	
	@Test
	public void test()
	{
		double result=cal.calulator(2, 5000, "electronics");
		
		assertEquals(11800, result,0);
	}

}
