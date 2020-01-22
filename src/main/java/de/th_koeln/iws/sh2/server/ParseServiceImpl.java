package de.th_koeln.iws.sh2.server;

import java.io.ByteArrayInputStream;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.th_koeln.iws.sh2.client.ParseResult;
import de.th_koeln.iws.sh2.client.ParseService;
import uk.ac.ox.cs.diadem.oxpath.parse.OXPathParser;
import uk.ac.ox.cs.diadem.oxpath.parse.ParseException;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ParseServiceImpl extends RemoteServiceServlet implements ParseService {

	@Override
	public ParseResult parseInput(String input) throws IllegalArgumentException {
		ParseResult result = new ParseResult();

		try {
			OXPathParser p = new OXPathParser(new ByteArrayInputStream(input.getBytes()));
			p.Expression();
			result.setMessage("Parsed Input OK");
		} catch (ParseException e) {
			result.setMessage("ERROR IN PARSE");
			result.setError(e.getMessage());
		}

		return result;
	}
}
