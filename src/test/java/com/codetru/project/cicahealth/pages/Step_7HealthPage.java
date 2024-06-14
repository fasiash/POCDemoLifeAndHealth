package com.codetru.project.cicahealth.pages;

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
import com.codetru.project.cicahealth.CommonPageHealthCICA;
import com.codetru.utils.DataGenerateUtils;


public class Step_7HealthPage extends CommonPageHealthCICA{

	
//		@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[7]")
		private By Nextstep7 = By.xpath("(//ion-col[@size='24' and @size-md='6' and @class='md hydrated']/ion-button)[7]");	
	
//		@FindBy(xpath = "//ion-input[@formcontrolname='SignedCity']/input")
		private By signedCity = By.xpath("//ion-input[@formcontrolname='SignedCity']/input");
		
//		@FindBy(xpath = "//ion-input[@formcontrolname='DateSigned']/input")
//		private By Date_Signed = By.xpath("//ion-input[@formcontrolname='DateSigned']/input");
	
//		@FindBy(xpath = "//ion-radio-group[@formcontrolname='HoldDateCheckBox']/ion-row/ion-col[2]/ion-item")
		private By HoldDateRadioButton_No = By.xpath("//ion-radio-group[@formcontrolname='HoldDateCheckBox']/ion-row/ion-col[2]/ion-item");
	
//		@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[2]")
		private By Error_SignedCity = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[3]");
	
//		@FindBy(xpath = "(//h3[text()='Signature']/following-sibling::ion-row[2]/ion-col[@size='24' and @size-md='6'])[1]")
		private By Error_SignatureProposedInsurer = By.xpath("(//div/ion-row//ion-col[@size='24' and @size-md='8' and @class='md hydrated'])[8]");
	
//		@FindBy(xpath = "//h3[.='Signature']/following-sibling::ion-row[2]/ion-col/div/ion-button")
		private By ProposedInsurerSignature = By.xpath("//ion-button[text()= ' Signature of Proposed Insured ']");
	
//		@FindBy(xpath = "(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]")
		private By signature_pad1 = By.xpath("(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]");
	
//		@FindBy(xpath = "(//ion-col[@style='padding-right: 20px;']/ion-button)[1]")
		private By Padding_Right1 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
	
//		@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[6]")
		private By Error_HoldUntillDate = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[6]");
	
//		@FindBy(xpath = "//h3[text()='Agent']/following-sibling::ion-row/ion-col[4][@size='24']")
		private By Error_SignatureOfAgent = By.xpath("//h3[text()='Agent']/following-sibling::ion-row/ion-col[4][@size='24']");
	
//		@FindBy(xpath = "//div/h3[.='Agent']/following-sibling::ion-row/ion-col[4]/div/ion-button")
		private By SignatureOfAgent = By.xpath("//ion-button[contains(text(),'Producer')]");
	
//		@FindBy(xpath = "//canvas[@class='signature-pad-canvas hidden-xs-down']")
		private By signature_pad2 = By.xpath("//canvas[@class='signature-pad-canvas hidden-xs-down']");
	
//		@FindBy(xpath = "(//ion-col[@style='padding-right: 20px;']/ion-button)[1]")
		private By Padding_Right2 = By.xpath("(//ion-col[@style='padding-right: 20px;']/ion-button)[1]");
	
//		@FindBy(xpath = "(//img[@width='150'])[1]")
		private By Sign1 = By.xpath("(//img[@width='150'])[1]");
	
//		@FindBy(xpath = "(//img[@width='150'])[2]")
		private By Sign2 = By.xpath("(//img[@width='150'])[2]");
	
//		@FindBy(id="applicationButton")
		private By application_btn = By.id("applicationButton");
	
		private By SignedAgent_Error = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[6]");
		//img[@width='150']
		private By SignedAgentCity_ = By.xpath("//ion-input[@formcontrolname='AgentSignedCity']/input");

		public void Disclosure_and_Signature() throws Exception {
	
			String Max_Name = "sdfsadfgdfsfghfghxfghjdsfghdfghdfghjdfsghdsfghretyu";
			String Max_error_ ="The maximum number of characters is 50.";
			String Mandatory_Err = "Value Required";
			String hold_Date_Err = "Hold Date required or click No for delayed payment";
			
	
//			WebUI.moveToElement(Nextstep7);
//			WebUI.sleep(2);
//			WebUI.clickElement(Nextstep7);
//			WebUI.sleep(2);
//			WebUI.scrollToElementAtBottom(Error_SignedCity);
//			WebUI.verifyElementVisible(Error_SignedCity,1);
	
//			WebUI.verifyContains(getTextElement(Error_SignedCity).trim(), Mandatory_Err);
	
			WebUI.sleep(1);
			
			WebUI.moveToElement(signedCity);
			WebUI.moveToElement(ProposedInsurerSignature);
			
//			WebUI.clearAndFillText(signedCity, Max_Name);
//			WebUI.sleep(1);
//			WebUI.moveToElement(Error_SignedCity);
//			WebUI.verifyElementVisible(Error_SignedCity, 1);
//			WebUI.verifyContains(getTextElement(Error_SignedCity).trim(), Max_error_);
			
			WebUI.moveToElement(signedCity);
			String RandomCity = DataGenerateUtils.randomCity();
			WebUI.clearAndFillText(signedCity,RandomCity);
			WebUI.sleep(1);
			WebUI.verifyContains(getAttributeElement(signedCity,"value"),RandomCity);
			
//			act.moveToElement(signedCity).build().perform();
			WebUI.moveToElement(signedCity);

			WebUI.scrollToElementAtBottom(Error_SignatureProposedInsurer);
			WebUI.sleep(1);
	
//			WebUI.verifyContains(getTextElement(Error_SignatureProposedInsurer).trim(), Mandatory_Err);
	
//			WebUI.sleep(1);
			WebUI.clickElement(ProposedInsurerSignature);
			WebUI.sleep(1);
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

//			WebUI.scrollToElementAtBottom(Error_HoldUntillDate);
//			WebUI.verifyElementVisible(Error_HoldUntillDate);
//
//			
//			WebUI.verifyContains(getTextElement(Error_HoldUntillDate).trim(), hold_Date_Err);
			
//	
			WebUI.clickElement(HoldDateRadioButton_No);
			WebUI.scrollToElementAtBottom(Nextstep7);
			
//			
//			WebUI.verifyContains(getTextElement(SignedAgent_Error).trim(), Mandatory_Err);
//			WebUI.sleep(1);
//			WebUI.clearAndFillText(SignedAgentCity_, Max_Name);
//			WebUI.sleep(1);
			
//			WebUI.verifyElementVisible(SignedAgent_Error);
//			WebUI.verifyContains(getTextElement(SignedAgent_Error).trim(), Max_error_);
			
			WebUI.moveToElement(SignedAgentCity_);
			String RandomCity2 = DataGenerateUtils.randomCity();
			WebUI.clearAndFillText(SignedAgentCity_,RandomCity2);
			WebUI.sleep(1);
			WebUI.verifyContains(getAttributeElement(SignedAgentCity_,"value"),RandomCity2);

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
			WebUI.sleep(1);
			WebUI.verifyElementVisible(Sign2);
//			
			WebUI.sleep(1);

			WebUI.clickElement(Nextstep7);

			
			
			
		}
}
