package ss.week4.test;

import org.junit.Before;
import org.junit.Test;
import ss.week4.Polynomial;
import ss.week4.Sum;
import ss.week4.Constant;
import ss.week4.LinearProduct;

public class PolynomialTest {
	
    private static final double DELTA = 1e-15;
    private Polynomial testPolynomial;
    
    @Before
    public void setUp() {
    	testPolynomial = new Polynomial(new double[]{1,2,3,4,5});
    	}

    @Test
    public void testApply() {
    	assertEquals();
    }
}
