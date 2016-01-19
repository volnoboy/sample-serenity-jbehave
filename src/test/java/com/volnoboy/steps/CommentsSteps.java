package com.volnoboy.steps;

import com.volnoboy.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class CommentsSteps extends ScenarioSteps {

	private HomePage homePage;

	@Step
	public void openHomePage() {
		homePage.open();
	}
}
