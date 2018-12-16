package com.qa;

import org.testng.annotations.Test;

import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;

@Epic("Exploratory")
@Feature("Dummy")
@Story("Funny")
public class DummyTest {

	@Link(name = "l-11", type = "my")
	@TmsLink("tms-22")
	@Issue("2233")
	@Test
	public void testAllureReportFolderLocation() {
		step1("Make it");
	}
	
	@Step("Do step 1: {0}")
	@Attachment("Greetings")
	@io.qameta.allure.Description("X3")
	private String step1(String action) {
		return "Hello Allure!";
	}
}
