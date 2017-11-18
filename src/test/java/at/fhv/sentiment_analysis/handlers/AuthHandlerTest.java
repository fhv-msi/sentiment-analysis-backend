package at.fhv.sentiment_analysis.handlers;

import org.junit.Assert;
import org.junit.Test;

import at.fhv.sentiment_analysis.handlers.AuthHandler;
import at.fhv.sentiment_analysis.models.User;

/**
 * Unit tests for {@link AuthHandler}
 * 
 * @author Michael Sieber
 *
 */
public class AuthHandlerTest {

	/**
	 * Test singleton pattern
	 */
	@Test
	public void testSingleton() {
		Assert.assertNotNull(AuthHandler.getInstance());
	}

	/**
	 * Test successful logout
	 */
	@Test
	public void testLogout() throws Exception {
		AuthHandler handler = AuthHandler.getInstance();
		handler.users.put("user@test.com", new User());
		handler.logout("user@test.com");
		Assert.assertFalse(handler.users.containsKey("user@test.com"));
	}

	/**
	 * Test logout with empty token
	 */
	@Test(expected = Exception.class)
	public void testLogoutEmptyMail() throws Exception {
		AuthHandler handler = AuthHandler.getInstance();
		handler.users.put("user@test.com", new User());
		handler.logout("");
	}

	/**
	 * Test logout with null token
	 */
	@Test(expected = Exception.class)
	public void testLogoutNullMail() throws Exception {
		AuthHandler handler = AuthHandler.getInstance();
		handler.users.put("user@test.com", new User());
		handler.logout(null);
	}

	/**
	 * Test successful user loading
	 */
	@Test
	public void testGetUser() throws Exception {
		AuthHandler handler = AuthHandler.getInstance();
		handler.users.put("user@test.com", new User());
		Assert.assertNotNull(handler.getUser("user@test.com"));
	}

	/**
	 * Test user loading with empty token
	 */
	@Test(expected = Exception.class)
	public void testGetUserEmptyMail() throws Exception {
		AuthHandler handler = AuthHandler.getInstance();
		handler.users.put("user@test.com", new User());
		handler.getUser("");
	}

	/**
	 * Test user loading with null token
	 */
	@Test(expected = Exception.class)
	public void testGetUserNullMail() throws Exception {
		AuthHandler handler = AuthHandler.getInstance();
		handler.users.put("user@test.com", new User());
		handler.getUser(null);
	}

	/**
	 * Test successful user login
	 */
	@Test
	public void testLogin() throws Exception {
		AuthHandler handler = AuthHandler.getInstance();
		String token = handler.login("user@test.com");
		Assert.assertNotNull(token);
		Assert.assertNotEquals("", token);

		User user = handler.users.get(token);
		Assert.assertEquals("user@test.com", user.getEmail());
		Assert.assertNotNull(user.getHistory());
	}

	/**
	 * Test user login with empty mail
	 */
	@Test(expected = Exception.class)
	public void testLoginEmptyMail() throws Exception {
		AuthHandler handler = AuthHandler.getInstance();
		handler.login("");
	}
	
	/**
	 * Test user login with null mail
	 */
	@Test(expected = Exception.class)
	public void testLoginNullMail() throws Exception {
		AuthHandler handler = AuthHandler.getInstance();
		handler.login(null);
	}
}
