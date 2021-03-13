package com.pluralsight;

import org.junit.Assert;
import org.junit.Test;

public class Junit {

	@Test
	public void cangoToHomePage() {
		Pages.homepage().goTo();
		Assert.assertTrue(Pages.homepage().isAt());
	
	}

}
