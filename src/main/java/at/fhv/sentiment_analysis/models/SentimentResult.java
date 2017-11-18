package at.fhv.sentiment_analysis.models;

// Start of user code (user defined imports)

// End of user code

public class SentimentResult {
	/**
	 * Description of the property sentiment.
	 */
	private String sentiment = null;
	
	/**
	 * Description of the property confidence.
	 */
	private float confidence = 0;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getSentiment(){
		   return this.sentiment;
		}
		
		public void setSentiment(String sentiment){
		   this.sentiment = sentiment;
		}
		
		public float getConfidence(){
		   return this.confidence;
		}
		
		public void setConfidence(float confidence){
		   this.confidence = confidence;
		}
		
	
}
