import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class calculatorTest {
	
	private calc calc=new calc();
	
	@BeforeClass
	public static void beforeAllTestCases() {
		System.out.println("executed only once before all test cases");
	}
	
	@Before
	public void beforeEveryTestCases() {
		System.out.println("executed before all test cases");
	}
	
	
	@Test
	public void addition() {
		int result=calc.add(10, 5);
		Assert.assertEquals(15, result);
		System.out.println("executed test case");
	}
	
	@Test
	public void subtraction() {
		int result=calc.substract(10, 5);
		Assert.assertEquals(5, result);
		System.out.println("executed test case");
	}
	
	@Test
	public void multiplication() {
		int result=calc.multiply(10, 5);
		Assert.assertEquals(50, result);
		System.out.println("executed test case");
	}
	
	@Test
	public void division() {
		int result=calc.divide(10, 5);
		Assert.assertEquals(2, result);
		System.out.println("executed test case");
	}
	
	//negative test case
	
	@Test(expected=ArithmeticException.class)
	public void expectedAttributeDivisionTest() {
		calc.divide(10, 0);
	}
	
	@Test
	public void tryCatchFailDivisionTest() {
		try {
			calc.divide(10, 0);
			fail();
		}
		catch(ArithmeticException ex) {
			Assert.assertEquals("cannot divide by zero",ex.getMessage());
		}
		
	}
	
	@Rule
	public ExpectedException thrown=ExpectedException.none();
	
	public void ruleAnnotationDivisionTest() {
		thrown.expect(ArithmeticException.class);
		thrown.expectMessage("cannot divide by zero");
		calc.divide(10, 0);
		
	}
	
//	@Test
//	public void assertThrowsDivisionMethod() {
//		
//	}
	
	
	private Object is(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@After
	public void aftereEveryTestCases() {
		System.out.println("executed after every test cases");
	}
	
	@AfterClass
	public static void afterAllTestCases() {
		System.out.println("executed only once after all test cases");
	}
	
	
	
	
}
