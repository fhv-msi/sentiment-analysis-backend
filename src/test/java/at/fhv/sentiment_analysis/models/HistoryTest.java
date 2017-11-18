package at.fhv.sentiment_analysis.models;

import org.junit.Test;
import org.meanbean.test.BeanTester;

/**
 * Unit tests for {@link History}
 * 
 * @author Michael Sieber
 *
 */
public class HistoryTest {

	/**
	 * Test standard bean behavior
	 */
	@Test
	public void testBean() {
		new BeanTester().testBean(History.class);
	}
}
