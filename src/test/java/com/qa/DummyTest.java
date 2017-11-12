package com.qa;

import org.testng.annotations.Test;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;

public class DummyTest {

	@Link("l-11")
	@TmsLink("tms-22")
	@Issue("2233")
	@Test
	public void testAllureReportFolderLocation() {
	}
}
