package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;

import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.JiraCreateIssue;

public class Step_3Page extends CommonPageCICA {
	
	private By noRadioBtn = By.xpath("//ion-item/ion-label[.='No']/following-sibling::ion-radio[@value='false']");

	private By NextStep3 = By.xpath("(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]");

	private By step3_Yes = By.xpath("//ion-item/ion-label[.='Yes']/following-sibling::ion-radio[@role='radio']");

	private By step3_No = By.xpath("//ion-item/ion-label[.='No']/following-sibling::ion-radio[@role='radio']");

	private By Error_ProposedOWner_Message = By.xpath("//form[@class='ng-untouched ng-pristine ng-invalid']//div[@class='block-info-app']");

	private By BenificiaryFirstname = By.xpath("//ion-input[@formcontrolname='BeneficiaryFirstName']/input");
	@JiraCreateIssue(isCreateIssue = true)
	public void Policy_Owner_Information() throws Exception {
		
		String Mandatory_Error = "Please enter a value.";
		
		WebUI.sleep(1);
		
		WebUI.clickElement(step3_No);
		WebUI.sleep(1);

		WebUI.clickElement(NextStep3);
		WebUI.sleep(2);
	
	}

}
