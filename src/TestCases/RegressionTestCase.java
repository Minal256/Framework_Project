package TestCases;

import org.testng.annotations.Test;

import KeywordDriven_Frame.Keywords;

public class RegressionTestCase {
	
	@Test
	public void tc_01() {
		Keywords.openBrowser("chrome");
		Keywords.openURL("http://www.facebook.com");
	}

}
