package com.volnoboy.jbehave;

import com.volnoboy.steps.CommentsSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;

public class CommentsStory {

	@Steps
	private CommentsSteps commentsSteps;

	@Given("user navigated to comments")
	public void givenUserNavigatedToComments() {
		commentsSteps.openHomePage();
	}

}
