
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.fraction.Fraction;
import org.junit.Test;


public class MyFractionsTest {

	@Test(expected=NullArgumentException.class)
	public void testF1NullF2Null() {
		MyFractions.addSub(null, null, false);
	}

	@Test(expected=NullArgumentException.class)
	public void testF2Null() {
		Fraction one = new Fraction(1,4);
		MyFractions.addSub(one, null, false);
	}

	@Test
	public void testF1NumZeroAdd() {
		Fraction one = new Fraction(0,4);
		Fraction two = new Fraction(1,4);
		Fraction result = MyFractions.addSub(one,two,true);
		assertEquals(two, result);
	}

	@Test
	public void testF1NumZeroSub() {
		Fraction one = new Fraction(0,4);
		Fraction two = new Fraction(1,4);
		Fraction result = MyFractions.addSub(one,two,false);
		assertEquals(two.negate(), result);
	}

	@Test
	public void testF2NumZero() {
		Fraction one = new Fraction(1,4);
		Fraction two = new Fraction(0,4);
		Fraction result = MyFractions.addSub(one,two,false);
		assertEquals(one, result);
	}

	@Test
	public void gcd1Add() {
		Fraction one = new Fraction (1,3);
		Fraction two = new Fraction (1,5);
		Fraction result = MyFractions.addSub(one,two,true);
		Fraction expected = new Fraction (8,15);
		assertEquals(expected,result);
	}

	@Test
	public void gcd1Sub() {
		Fraction one = new Fraction (1,3);
		Fraction two = new Fraction (1,5);
		Fraction result = MyFractions.addSub(one,two,false);
		Fraction expected = new Fraction (2,15);
		assertEquals(expected,result);
	}

	@Test
	public void gcdNot1Add() {
		Fraction one = new Fraction (3,4);
		Fraction two = new Fraction (5, 6);
		Fraction result = MyFractions.addSub(one,two,true);
		Fraction expected = new Fraction (19,12);
		assertEquals(expected,result);
	}

	@Test
	public void gcdNot1Sub() {
		Fraction one = new Fraction (3,4);
		Fraction two = new Fraction (5, 6);
		Fraction result = MyFractions.addSub(one,two,false);
		Fraction expected = new Fraction (-1,12);
		assertEquals(expected,result);
	}

}
