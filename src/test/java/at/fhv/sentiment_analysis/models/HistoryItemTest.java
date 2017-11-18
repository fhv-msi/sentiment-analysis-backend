package at.fhv.sentiment_analysis.models;

import org.junit.Test;
import org.meanbean.test.BeanTester;

/**
 * Unit tests for {@link HistoryItem}
 * 
 * @author Michael Sieber
 *
 */
public class HistoryItemTest {

	/**
	 * Test standard bean behavior
	 */
	@Test
	public void testBean() {
		new BeanTester().testBean(HistoryItem.class);
	}
}
