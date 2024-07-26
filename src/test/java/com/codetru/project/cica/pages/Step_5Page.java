package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.JiraCreateIssue;

public class Step_5Page extends CommonPageCICA {

	private By exist_no = By.xpath("(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]");

	private By NextStep5 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[4]");

	private By error_Message_ExistingInsurQuest_1 = By.xpath("(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[1]");

	private By error_Message_ExistingInsurQuest_2 = By.xpath("(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[2]");

	private By ExitingInsurance_Question_1 = By.xpath("(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]");

	private By Error_HealthQuestions_1 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']");
	@JiraCreateIssue(isCreateIssue = true)
	public void Existing_Insurance() throws Exception {

		String Mandatory_Error = "Please enter a value.";

		WebUI.sleep(1);

		WebUI.clickElement(ExitingInsurance_Question_1);
		WebUI.clickElement(NextStep5);

	}

}
