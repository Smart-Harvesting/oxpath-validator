package de.th_koeln.iws.sh2;

import de.th_koeln.iws.sh2.client.OXPathValidatorTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class OXPathValidatorSuite extends GWTTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Tests for OXPathValidator");
		suite.addTestSuite(OXPathValidatorTest.class);
		return suite;
	}
}
