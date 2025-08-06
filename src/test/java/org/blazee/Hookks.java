package org.blazee;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookks extends Baseclss {
	@Before
	// precondition
	private void Precondition() {
		launchBrowser();
		windowMaximize();

	}

	@After
	// post condition
	private void psotcondition() {
		closeEntireBrowser();

	}

}
