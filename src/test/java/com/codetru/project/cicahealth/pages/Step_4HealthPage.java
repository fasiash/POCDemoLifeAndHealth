package com.codetru.project.cicahealth.pages;

import static com.codetru.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.project.cicahealth.CommonPageHealthCICA;

public class Step_4HealthPage extends CommonPageHealthCICA {

	private By exist_no = By.xpath("(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]");

	private By NextStep4 = By.xpath("(//ion-col[@size='24' and @size-md='6' and @class='md hydrated']/ion-button)[4]");

//	private By error_Message_ExistingInsurQuest_1 = By.xpath("(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[1]");

//	private By error_Message_ExistingInsurQuest_2 = By.xpath("(//h3[text()='Existing Insurance']/following-sibling::ion-row[@class='md hydrated'])[2]");

//	private By ExitingInsurance_Question_1 = By.xpath("(//ion-label[text()='No ']/following-sibling::ion-radio[@slot='start'])[1]");

	private By Error_Coverage = By.xpath("//h3[.='Coverage with Other Companies']/following-sibling::ion-row");
	private By CoverageRadioButton_yes = By.xpath("(//ion-radio[@slot='start' and @value='true'])[4]");
	private By CoverageRadioButton_No = By.xpath("(//ion-radio[@slot='start' and @value='false'])[4]");
	private By NextStep5_Statement = By.xpath("//h3[contains(text(),'Statement')]");

	public void Existing_Insurance() throws Exception {

		String Mandatory_Error = "Value Required";

		WebUI.sleep(1);
//		WebUI.clickElement(NextStep4);
//		WebUI.verifyContains(getTextElement(Error_Coverage).trim(), Mandatory_Error);
//		C.step_5_(driver, ExitingInsurance_Question_1, NextStep5, Error_HealthQuestions_1, e, Test.Case5(6), Test.Exp5(6));
//		WebUI.verifyElementClickable(CoverageRadioButton_yes);
//		WebUI.clickElement(CoverageRadioButton_yes);
//		WebUI.verifyElementClickable(CoverageRadioButton_No);
//		WebUI.sleep(0.5);
		WebUI.clickElementWithJs(CoverageRadioButton_No);
		WebUI.sleep(1);
		WebUI.clickElementWithJs(NextStep4);
//		WebUI.scrollToElementAtBottom(NextStep5);
//		WebUI.verifyElementVisible(NextStep5_Statement);
		WebUI.sleep(1);

	}

}
