package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.DataGenerateUtils;
import com.codetru.utils.JiraCreateIssue;


public class Step_8Page extends CommonPageCICA {

	
		private By NextStep8 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[7]");
	
		private By signedCity = By.xpath("//ion-input[@formcontrolname='SignedCity']/input");
		
	
		private By HoldDateRadioButton_No = By.xpath("//ion-radio-group[@formcontrolname='HoldDateCheckBox']/ion-row/ion-col[2]/ion-item");
	
		private By Error_SignedCity = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[3]");
	
		private By Error_SignatureProposedInsurer = By.xpath("(//h3[text()='Signature']/following-sibling::ion-row[2]/ion-col[@size='24' and @size-md='6'])[1]");
	
		private By ProposedInsurerSignature = By.xpath("//h3[.='Signature']/following-sibling::ion-row[2]/ion-col/div/ion-button");
	
		private By signature_pad1 = By.xpath("(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]");
	
		private By Padding_Right1 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
	
		private By Error_HoldUntillDate = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[7]");
	
		private By Error_SignatureOfAgent = By.xpath("//h3[text()='Agent']/following-sibling::ion-row/ion-col[4][@size='24']");
	
		private By SignatureOfAgent = By.xpath("//div/h3[.='Agent']/following-sibling::ion-row/ion-col[4]/div/ion-button");
	
		private By signature_pad2 = By.xpath("//canvas[@class='signature-pad-canvas hidden-xs-down']");
	
		private By Padding_Right2 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
	
		private By Sign1 = By.xpath("(//img[@width='150'])[1]");
	
		private By Sign2 = By.xpath("(//img[@width='150'])[2]");
	
		private By application_btn = By.id("applicationButton");
		@JiraCreateIssue(isCreateIssue = true)
		public void Disclosure_and_Signature() throws Exception {
	
			String Max_Name = "sdfsadfgdfsfghfghxfghjdsfghdfghdfghjdfsghdsfghretyu";
			String Max_error_ ="The maximum number of characters is 50.";
			String Mandatory_Err = "Please enter a value.";
			String hold_Date_Err = "Hold Date must be before License Expiration Date";
			
			WebUI.sleep(1);
			WebUI.moveToElement(signedCity);
			WebUI.moveToElement(ProposedInsurerSignature);
						
			WebUI.moveToElement(signedCity);
			
			String RandomCity = DataGenerateUtils.randomCity();
			WebUI.clearAndFillText(signedCity,RandomCity);
			WebUI.sleep(1);
			WebUI.verifyContains(getAttributeElement(signedCity,"value"),RandomCity);
			WebUI.moveToElement(signedCity);
			
	
			WebUI.scrollToElementAtBottom(Error_SignatureProposedInsurer);
			WebUI.sleep(2);
			WebUI.scrollToElementAtBottom(HoldDateRadioButton_No);
			WebUI.verifyElementPresent(HoldDateRadioButton_No, 1);
			WebUI.sleep(1);
	
			WebUI.sleep(1);
			WebUI.clickElement(ProposedInsurerSignature);
			WebUI.sleep(2);
			WebUI.clickHold(signature_pad1);
			WebUI.moveToOffset(25, 25);
			WebUI.moveToOffset(35, 30);
			WebUI.moveToOffset(16, 26);
			WebUI.moveToOffset(-76, -26);
			WebUI.moveToOffset(18, 56);
			WebUI.moveToOffset(-52, -36);
			WebUI.moveToOffset(-21, -25);
			WebUI.moveToOffset(36, 26);
			WebUI.moveToOffset(-54, 56);
			WebUI.releaseElement(signature_pad1);
			WebUI.clickElement(Padding_Right1);
			WebUI.sleep(2);
			WebUI.verifyElementVisible(Sign1);
				
			WebUI.scrollToElementAtBottom(Error_HoldUntillDate);
			WebUI.verifyElementVisible(Error_HoldUntillDate);
			
			WebUI.clickElement(HoldDateRadioButton_No);
			WebUI.scrollToElementAtBottom(NextStep8);
			WebUI.verifyElementVisible(NextStep8, 2);
			WebUI.sleep(1);
			
	
			WebUI.clickElement(SignatureOfAgent);
			WebUI.sleep(1);
			WebUI.clickHold(signature_pad2); 
			WebUI.moveToOffset(25, 25);
			WebUI.moveToOffset(35, 30);
			WebUI.moveToOffset(16, 26);
			WebUI.moveToOffset(-76, -26);
			WebUI.moveToOffset(18, 56);
			WebUI.moveToOffset(-52, -36);
			WebUI.moveToOffset(-21, -25);
			WebUI.moveToOffset(36, 26);
			WebUI.moveToOffset(112, 56);
			WebUI.releaseElement(signature_pad2); 
			WebUI.clickElement(Padding_Right2);
			WebUI.sleep(2);
			WebUI.verifyElementVisible(Sign2);
			WebUI.sleep(1);
			
			
			WebUI.clickElement(NextStep8);
			WebUI.sleep(1);
			WebUI.verifyElementVisible(application_btn, 2);
			WebUI.sleep(1);
			
			WebUI.clickElement(NextStep8);
			
			
		}
}
