package at.fhv.sentiment_analysis.models;

// Start of user code (user defined imports)

// End of user code

public class History {
	/**
	 * Description of the property items.
	 */
	private java.util.List<at.fhv.sentiment_analysis.models.HistoryItem> items = new java.util.ArrayList<at.fhv.sentiment_analysis.models.HistoryItem>();
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public java.util.List<at.fhv.sentiment_analysis.models.HistoryItem> getItems(){
		   return this.items;
		}
		
		public void setItems(java.util.List<at.fhv.sentiment_analysis.models.HistoryItem> items){
		   this.items = items;
		}
		
	
}
