package at.fhv.sentiment_analysis.handlers;

// Start of user code (user defined imports)
import java.time.Instant;
// End of user code

public class HistoryHandler {
	// Start of user code (user defined attributes)

	// End of user code
	

	private static HistoryHandler INSTANCE;
	
	private HistoryHandler(){
	    // singleton
	}
	
	public static HistoryHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new HistoryHandler();
	    }
	
	    return INSTANCE;
	}
	
	public void addHistory(String token, String text, at.fhv.sentiment_analysis.models.SentimentResult result) throws Exception {
		// Start of user code addHistory
		at.fhv.sentiment_analysis.models.User user = AuthHandler.getInstance().getUser(token);
		at.fhv.sentiment_analysis.models.HistoryItem item = new at.fhv.sentiment_analysis.models.HistoryItem();
        item.setRequested(Instant.now().toEpochMilli());
        item.setText(text);
        item.setResult(result);
        user.getHistory().getItems().add(item);
		// End of user code
	}
	
	public at.fhv.sentiment_analysis.models.History getHistory(String token) throws Exception {
		// Start of user code getHistory
		if(token == null || "".equals(token)) {
			throw new Exception("Token must not be empty");
		}
		
		at.fhv.sentiment_analysis.models.User user = AuthHandler.getInstance().getUser(token);
		return user.getHistory();
		// End of user code
	}
	
	// Start of user code (user defined operations)

	// End of user code
	
}
