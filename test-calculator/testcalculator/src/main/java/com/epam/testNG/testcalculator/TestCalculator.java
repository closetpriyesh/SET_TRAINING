package com.epam.testNG.testcalculator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;
@Listeners(listeners.CalculatorListener.class)
public class TestCalculator {

	Calculator calc;
	Object[][] xlDataForIsPos;

	@BeforeMethod(groups = { "all", "positive", "negative" })
	public void instantiate() {
		calc = new Calculator();

	}

	@Test(groups = { "positive", "all" }, dataProvider = "posDiv")
	public void posDivision(Long value1, Long value2) {
		assertEquals(calc.div(value1, value2), value1 / value2);
	}

	@Test(groups = { "negative", "all" }, dataProvider = "posMul", expectedExceptions = ArithmeticException.class)
	public void negDivision(Long value1, Long value2) {
		assertEquals(calc.div(value1, value2), value1 / value2);
	}

	@Test(groups = { "positive", "all" }, dataProvider = "posIsPositive")
	public void posIsPositive(Long value) {
		assertTrue(calc.isPositive(value));
	}

	@Test(groups = { "negative", "all" }, dataProvider = "negIsPositive")
	public void negIsPostive(Long value) {
		assertTrue(calc.isPositive(value));
	}

	@Test(groups = { "positive", "all" }, dataProvider = "posSum")
	public void posSum(Long value1, Long value2) {
		assertEquals(calc.sum(value1, value2), value1 + value2);
	}

	@Test(groups = { "negative", "all" }, dataProvider = "negSum")
	public void negSum(Long value1, Long value2) {
		assertEquals(calc.sum(value1, value2), value1 - value2);
	}

	@Test(groups = { "positive", "all" }, dataProvider = "posMul")
	public void posMul(Long value1, Long value2) {
		assertEquals(calc.mult(value1, value2), value1 * value2);
	}

	@Test(groups = { "negative", "all" }, dataProvider = "negMul")
	public void negMul(Long value1, Long value2) {
		assertEquals(calc.mult(value1, value2), value1 + value2);
	}

	@Test(dependsOnMethods = { "posIsPositive" }, groups = { "positive", "all" }, dataProvider = "posIsPositive")
	public void posSqrt(Long value) {
		assertEquals(calc.sqrt(value), Math.sqrt(value));
	}

	@Test(groups = { "negative",
			"all" }, dataProvider = "negIsPositive", expectedExceptions = ArithmeticException.class)
	public void negSqrt(Long value) {
		assertEquals(calc.sqrt(value), Math.sqrt(value));
	}

	@DataProvider(name = "posDiv")
	public Object[][] createData0() {
		ReadFromCSV rfc = new ReadFromCSV();
		return rfc.dataForPosdiv();
	}

	@DataProvider(name = "posIsPositive")
	public Object[][] createData1() {
		return new Object[][] { { new Long(5) }, { new Long(10) }, { new Long(1000) }, { new Long(10000) }, };
	}

	@DataProvider(name = "negIsPositive")
	public Object[][] createData2() {
		return new Object[][] { { new Long(-5) }, { new Long(-10) }, { new Long(-1000) }, { new Long(-10000) }, };
	}

	@DataProvider(name = "posSum")
	public Object[][] createData3() {
		ReadFromExcel rfe = new ReadFromExcel();
		return rfe.DataForIspos();

	}

	@DataProvider(name = "negSum")
	public Object[][] createData4() {
		return new Object[][] { { new Long(-5), new Long(-5) }, { new Long(5), new Long(5) } };
	}

	@DataProvider(name = "posMul")
	public Object[][] createData5() {
		return new Object[][] { { new Long(-5), new Long(-5) }, { new Long(5), new Long(5) } };
	}

	@DataProvider(name = "negMul")
	public Object[][] createData6() {
		return new Object[][] { { new Long(-5), new Long(-5) }, { new Long(5), new Long(5) } };
	}

	@AfterMethod(groups = { "all", "positive", "negative" })
	public void close() {
		System.gc();
	}

}
