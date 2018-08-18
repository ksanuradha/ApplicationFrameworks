package test.edu.msc.sliit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.edu.msc.sliit.Calculator;
import com.edu.msc.sliit.Calculatorimpl;

public class CalculatorTester {
	
	Calculator calculator=null;
	
	@Before
	public void setUp(){
		calculator=new Calculatorimpl();
	}
	
	@Test
	public void testAdd() {
		double value1=6;
		double value2=4;
		double answer=calculator.add(value1, value2);
		assertEquals(answer,10,0);
	}
	@Test
	public void testmulipication() {
		double value1=6;
		double value2=4;
		double answer=calculator.multiple(value1, value2);
		assertEquals(answer,24,0);
	}
	@Test
	public void testdivide() {
		double value1=6;
		double value2=3;
		double answer=calculator.devide(value1, value2);
		/*
		try {
			double answer=calculator.devide(value1, value2);
			
		} catch (Exception e) {
			
		}*/
		
		assertEquals(answer,2,0);
		
	}
	@Test
	public void testsubstration() {
		double value1=6;
		double value2=3;
		double answer=calculator.substration(value1, value2);
		assertEquals(answer,3,0);
	}
	
	
	

}
