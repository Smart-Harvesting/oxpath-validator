package de.th_koeln.iws.sh2.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("parse")
public interface ParseService extends RemoteService {
	ParseResult parseInput(String input) throws IllegalArgumentException;
}
