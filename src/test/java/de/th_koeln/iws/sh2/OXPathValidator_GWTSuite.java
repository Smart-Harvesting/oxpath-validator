package de.th_koeln.iws.sh2;

import de.th_koeln.iws.sh2.client.OXPathValidator_GWTTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class OXPathValidator_GWTSuite extends GWTTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Tests for OXPathValidator_GWT");
		suite.addTestSuite(OXPathValidator_GWTTest.class);
		return suite;
	}
}
