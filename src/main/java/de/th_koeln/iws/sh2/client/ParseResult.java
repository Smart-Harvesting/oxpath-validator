package de.th_koeln.iws.sh2.client;

import java.io.Serializable;

public class ParseResult implements Serializable {

	private static final long serialVersionUID = 1L;
	private String message;
	private String error;

	public ParseResult() {
	};

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getError() {
		return this.error;
	}
}
