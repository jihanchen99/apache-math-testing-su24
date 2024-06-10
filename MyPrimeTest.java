
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;

public class MyPrimeTest {
	@Test
	public void test2() {
		assertEquals(2, MyPrime.nextPrime(1));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testNegativeInput() {
		MyPrime.nextPrime(-1);
	}

	@Test
	public void testInput2() {
		int result = MyPrime.nextPrime(2);
		assertEquals(2,result);
	}

	@Test
	public void testInput0() {
		assertEquals(2, MyPrime.nextPrime(0));
	}

	@Test
	public void testPrimeInput() {
		assertEquals(3, MyPrime.nextPrime(3));
	}

	@Test
	public void testInput14() {
		assertEquals(17, MyPrime.nextPrime(14));
	}

	@Test
	public void testInput25() {
		assertEquals(29, MyPrime.nextPrime(25));
	}

	@Test
	public void testInput35() {
		assertEquals(37, MyPrime.nextPrime(35));
	}

	@Test
	public void testInput49() {
		assertEquals(53, MyPrime.nextPrime(49));
	}


}
