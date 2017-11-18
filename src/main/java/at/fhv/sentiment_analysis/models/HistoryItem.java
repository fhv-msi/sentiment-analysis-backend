package at.fhv.sentiment_analysis.models;

// Start of user code (user defined imports)

// End of user code

public class HistoryItem {
	/**
	 * Description of the property text.
	 */
	private String text = null;
	
	/**
	 * Description of the property requested.
	 */
	private long requested = 0;
	
	/**
	 * Description of the property result.
	 */
	public at.fhv.sentiment_analysis.models.SentimentResult result = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getText(){
		   return this.text;
		}
		
		public void setText(String text){
		   this.text = text;
		}
		
		public long getRequested(){
		   return this.requested;
		}
		
		public void setRequested(long requested){
		   this.requested = requested;
		}
		
		public at.fhv.sentiment_analysis.models.SentimentResult getResult(){
		   return this.result;
		}
		
		public void setResult(at.fhv.sentiment_analysis.models.SentimentResult result){
		   this.result = result;
		}
		
	
}
