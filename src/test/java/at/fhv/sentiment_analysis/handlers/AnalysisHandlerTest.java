package at.fhv.sentiment_analysis.handlers;

import org.junit.Assert;
import org.junit.Test;

import at.fhv.sentiment_analysis.handlers.AnalysisHandler;

/**
 * Unit tests for {@link AnalysisHandler}
 * @author Michael Sieber
 *
 */
public class AnalysisHandlerTest {

	@Test
	public void testSingleton() {
		Assert.assertNotNull(AnalysisHandler.getInstance());
	}
}
