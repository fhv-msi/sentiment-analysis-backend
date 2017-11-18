package at.fhv.sentiment_analysis.endpoints;

import org.junit.Assert;
import org.junit.Test;

import at.fhv.sentiment_analysis.models.History;
import at.fhv.sentiment_analysis.models.HistoryItem;
import at.fhv.sentiment_analysis.models.SentimentResult;

/**
 * Integration tests for {@link HistoryEndpoint}
 * 
 * @author Michael Sieber
 *
 */
public class HistoryEndpointIT {

	/**
	 * Test successful history loading
	 */
	@Test
	public void testGetHistory() throws Exception {
		AuthEndpoint authEndpoint = new AuthEndpoint();
		AnalysisEndoint analysisEndpoint = new AnalysisEndoint();
		String token = authEndpoint.login("user@test.com");
		SentimentResult result = analysisEndpoint.analyze("i hate people", token);
		
		HistoryEndpoint historyEndpoint = new HistoryEndpoint();
		History history = historyEndpoint.getHistory(token);
		
		Assert.assertNotNull(history);
		Assert.assertNotNull(history.getItems());
		Assert.assertEquals(1, history.getItems().size());
		
		HistoryItem item = history.getItems().get(0);
		Assert.assertNotNull(item);
		Assert.assertEquals(result.getConfidence(), item.getResult().getConfidence(), 0);
		Assert.assertEquals(result.getSentiment(), item.getResult().getSentiment());
	}

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
