package at.fhv.sentiment_analysis.models;

// Start of user code (user defined imports)

// End of user code

public class User {
	/**
	 * Description of the property email.
	 */
	private String email = null;
	
	/**
	 * Description of the property history.
	 */
	private at.fhv.sentiment_analysis.models.History history = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getEmail(){
		   return this.email;
		}
		
		public void setEmail(String email){
		   this.email = email;
		}
		
		public at.fhv.sentiment_analysis.models.History getHistory(){
		   return this.history;
		}
		
		public void setHistory(at.fhv.sentiment_analysis.models.History history){
		   this.history = history;
		}
		
	
}
