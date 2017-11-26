package at.fhv.sentiment_analysis.endpoints;

import org.junit.Test;

/**
 * Integration tests for {@link HistoryEndpoint}
 * 
 * @author Michael Sieber
 *
 */
public class HistoryEndpointIT {

	/**
	 * Test history loading with empty token
	 */
	@Test(expected = Exception.class)
	public void testGetHistoryEmptyToken() throws Exception {
		HistoryEndpoint endpoint = new HistoryEndpoint();
		endpoint.getHistory("");
	}

	/**
	 * Test history loading with null token
	 */
	@Test(expected = Exception.class)
	public void testGetHistoryNullToken() throws Exception {
		HistoryEndpoint endpoint = new HistoryEndpoint();
		endpoint.getHistory(null);
	}
}
