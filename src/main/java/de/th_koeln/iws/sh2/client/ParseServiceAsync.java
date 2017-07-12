package de.th_koeln.iws.sh2.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface ParseServiceAsync {
	void parseInput(String input, AsyncCallback<ParseResult> callback) throws IllegalArgumentException;
}
