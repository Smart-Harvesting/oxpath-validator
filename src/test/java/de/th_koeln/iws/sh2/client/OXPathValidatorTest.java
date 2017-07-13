package de.th_koeln.iws.sh2.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * GWT JUnit tests must extend GWTTestCase.
 */
public class OXPathValidatorTest extends GWTTestCase {

	/**
	 * Must refer to a valid module that sources this class.
	 */
	@Override
	public String getModuleName() {
		return "de.th_koeln.iws.sh2.OXPathValidatorJUnit";
	}

	/**
	 * This test will send a request to the server using the greetServer method in
	 * ParseService and verify the response.
	 */
	public void testParseService() {
		// Create the service that we will test.
		ParseServiceAsync parseService = GWT.create(ParseService.class);
		ServiceDefTarget target = (ServiceDefTarget) parseService;
		target.setServiceEntryPoint(GWT.getModuleBaseURL() + "oxpathvalidator/greet");

		// Since RPC calls are asynchronous, we will need to wait for a response
		// after this test method returns. This line tells the test runner to wait
		// up to 10 seconds before timing out.
		this.delayTestFinish(10000);

		// Send a request to the server.
		parseService.parseInput("GWT User", new AsyncCallback<ParseResult>() {
			@Override
			public void onFailure(Throwable caught) {
				// The request resulted in an unexpected error.
				fail("Request failure: " + caught.getMessage());
			}

			@Override
			public void onSuccess(ParseResult result) {
				// Verify that the response is correct.
				assertFalse(result.getMessage().isEmpty());

				// Now that we have received a response, we need to tell the test runner
				// that the test is complete. You must call finishTest() after an
				// asynchronous test finishes successfully, or the test will time out.
				OXPathValidatorTest.this.finishTest();
			}
		});
	}

}
