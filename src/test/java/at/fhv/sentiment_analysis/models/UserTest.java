package at.fhv.sentiment_analysis.models;

import org.junit.Test;
import org.meanbean.test.BeanTester;

/**
 * Unit tests for {@link User}
 * 
 * @author Michael Sieber
 *
 */
public class UserTest {

	/**
	 * Test standard bean behavior
	 */
	@Test
	public void testBean() {
		new BeanTester().testBean(User.class);
	}
}
