package at.fhv.sentiment_analysis.models;

import org.junit.Test;
import org.meanbean.test.BeanTester;

/**
 * Unit tests for {@link SentimentResult}
 * 
 * @author Michael Sieber
 *
 */
public class SentimentResultTest {

	/**
	 * Test standard bean behavior
	 */
	@Test
	public void testBean() {
		new BeanTester().testBean(SentimentResult.class);
	}
}
