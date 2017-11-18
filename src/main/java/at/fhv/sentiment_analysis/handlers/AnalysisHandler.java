package at.fhv.sentiment_analysis.handlers;

// Start of user code (user defined imports)
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
// End of user code

public class AnalysisHandler {
	// Start of user code (user defined attributes)

	// End of user code
	

	private static AnalysisHandler INSTANCE;
	
	private AnalysisHandler(){
	    // singleton
	}
	
	public static AnalysisHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new AnalysisHandler();
	    }
	
	    return INSTANCE;
	}
	
	public at.fhv.sentiment_analysis.models.SentimentResult analyze(String text, String token) throws Exception {
		// Start of user code analyze
		if(token == null || "".equals(token)) {
			throw new Exception("Not authenticated");
		}
		
		if(text == null || "".equals(text)) {
			at.fhv.sentiment_analysis.models.SentimentResult empty = new at.fhv.sentiment_analysis.models.SentimentResult();
			empty.setConfidence(50.0f);
			empty.setSentiment("Neutral");
			return empty;
		}
		
		HttpResponse response = Request.Post("http://sentiment.vivekn.com/api/text/")
				.bodyForm(Form.form().add("txt", text).build()).execute().returnResponse();
		String result = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
		Gson gson = new GsonBuilder().create();
		JsonObject jsonObject = gson.fromJson(result, JsonObject.class);
		at.fhv.sentiment_analysis.models.SentimentResult sentimentResult = gson.fromJson(jsonObject.get("result"),
				at.fhv.sentiment_analysis.models.SentimentResult.class);
		HistoryHandler.getInstance().addHistory(token, text, sentimentResult);
		return sentimentResult;
		// End of user code
	}
	
	// Start of user code (user defined operations)

	// End of user code
	
}
