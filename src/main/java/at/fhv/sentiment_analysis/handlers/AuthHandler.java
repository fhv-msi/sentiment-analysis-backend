package at.fhv.sentiment_analysis.handlers;

// Start of user code (user defined imports)
import org.apache.commons.codec.digest.DigestUtils;
import java.util.HashMap;
import java.util.Map;
// End of user code

public class AuthHandler {
	// Start of user code (user defined attributes)
	protected Map<String, at.fhv.sentiment_analysis.models.User> users = new HashMap<>();
	// End of user code
	

	private static AuthHandler INSTANCE;
	
	private AuthHandler(){
	    // singleton
	}
	
	public static AuthHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new AuthHandler();
	    }
	
	    return INSTANCE;
	}
	
	public void logout(String token) throws Exception {
		// Start of user code logout
		if(token == null || "".equals(token)) {
			throw new Exception("Unknown token");
		}
		users.remove(token);
		// End of user code
	}
	
	public String login(String email) throws Exception {
		// Start of user code login
		if(email == null || "".equals(email)) {
			throw new Exception("Email must not be empty");
		}
		
		 String token = DigestUtils.md2Hex(email);
	        if (!users.containsKey(token)) {
	        	at.fhv.sentiment_analysis.models.User user = new at.fhv.sentiment_analysis.models.User();
	        	user.setEmail(email);
	        	user.setHistory(new at.fhv.sentiment_analysis.models.History());
	            users.put(token, user);
	        }

	        return token;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	public at.fhv.sentiment_analysis.models.User getUser(String token) throws Exception{
		if(!users.containsKey(token)) {
			throw new Exception("Unknown token");
		}
        return users.get(token);
    }
	// End of user code
	
}
