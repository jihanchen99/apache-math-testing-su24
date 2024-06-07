import static org.junit.Assert.*;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;


public class MySorterTest {

	@Test(expected=NullArgumentException.class)
	public void testNullInputs() {
		MySorter.sortInPlace(null, MySorter.OrderDirection.DECREASING, (double[])null);
	}

	@Test(expected=NullArgumentException.class)
	public void testNullArrayInYList(){
		double[] x = {1.0, 2.0, 3.0};
		double[] y1 = null;
		double[] y2 = {4.0, 5.0, 6.0};
		MySorter.sortInPlace(x, MySorter.OrderDirection.INCREASING, y1, y2);
	}

	@Test(expected=DimensionMismatchException.class)
	public void testUnequalArrayLength(){
		double[] x = {1.0, 2.0, 3.0};
		double[] y1 = {4.0, 5.0};
		double[] y2 = {6.0, 7.0, 8.0};
		MySorter.sortInPlace(x, MySorter.OrderDirection.INCREASING, y1, y2);
	}

	@Test
	public void testDecreasingOrder() {
		double[] x = {1.0, 2.0, 3.0};
		double[] y1 = {4.0, 5.0, 6.0};
		double[] y2 = {7.0, 8.0, 9.0};

		double[] x_expected = {3.0, 2.0, 1.0};
		double[] y1_expected = {6.0, 5.0, 4.0};
		double[] y2_expected = {9.0, 8.0, 7.0};

		MySorter.sortInPlace(x, MySorter.OrderDirection.DECREASING, y1, y2);

		assertArrayEquals(x_expected, x, 0.0001);
		assertArrayEquals(y1_expected, y1, 0.0001);
		assertArrayEquals(y2_expected, y2, 0.0001);
	}

	@Test
	public void testIncreasingOrder() {
		double[] x = {3.0, 2.0, 1.0};
		double[] y1 = {6.0, 5.0, 4.0};
		double[] y2 = {9.0, 8.0, 7.0};

		double[] x_expected = {1.0, 2.0, 3.0};
		double[] y1_expected = {4.0, 5.0, 6.0};
		double[] y2_expected = {7.0, 8.0, 9.0};

		MySorter.sortInPlace(x, MySorter.OrderDirection.INCREASING, y1, y2);

		assertArrayEquals(x_expected, x, 0.0001);
		assertArrayEquals(y1_expected, y1, 0.0001);
		assertArrayEquals(y2_expected, y2, 0.0001);
	}


	
}
