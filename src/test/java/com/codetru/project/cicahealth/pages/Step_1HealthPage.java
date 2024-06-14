package com.codetru.project.cicahealth.pages;

import static com.codetru.keywords.WebUI.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
import com.codetru.utils.DataFakerUtils;
import com.codetru.utils.DataGenerateUtils;


public class Step_1HealthPage extends CommonPageHealthCICA{


	private By page_Error = By.xpath("//p[.='There are some errors on this page. Please correct before continuing.']");

	private By FirstName = By.xpath("//ion-input[@formcontrolname='ProposedFirstName']/input");

	private By Error_Message_FirstName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[5]");

	private By MiddleName = By.xpath("//ion-input[@formcontrolname='ProposedMiddleName']/input");

	private By Error_Message_MiddleName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[6]");

	private By LastName = By.xpath("//ion-input[@formcontrolname='ProposedLastName']/input");

	private By Error_Message_LastName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[7]");

	private By StateDropdown = By.xpath("//select[@formcontrolname='SignedState']");

	private By Error_Message_State = By.xpath("(//ion-col[@size='24' and @size-md='4'])[1]");

	private By state = By.xpath("(//option[.='  Georgia'])[1]");

	private By genderDropdown = By.xpath("//select[@formcontrolname='ProposedGender']");

	private By gender = By.xpath("//option[.='Male']");

	private By Error_Message_Gender = By.xpath("(//ion-col[@size='24' and @size-md='7' and @class='md hydrated'])[1]");

	private By DateOfBirth = By.xpath("//input[@formcontrolname='ProposedBirthDate']");

	private By age = By.xpath("//ion-input[@formcontrolname='ProposedAge']");

	private By Error_Message_DateOfBirth = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated'])[1]");

	private By Error_Message_ApplicantLocation = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[4]");

	private By signedStateDropdown = By.xpath("//select[@formcontrolname='SignedState']");
	private By SignedState = By.xpath("(//option[.=' Louisiana'])[2]");
	private By preferredlanguage = By.xpath("//select[@formcontrolname='PreferredLanguage']");
	private By language = By.xpath("//option[.=' English']");
	private By Call_Yes = By.xpath("(//ion-label[.='Yes'])[1]");
	private By Call_No = By.xpath("(//ion-label[.='No'])[1]");
	private By Error_Message_Language = By.xpath("(//ion-col[@size='24' and @size-md='4'])[2]");
	private By ErrorMessage_BasePlan = By.xpath("//ion-col[@class = 'md hydrated' and @size-md = '7']");
	private By plan = By.xpath("//select[@formcontrolname='Plan']");
	private By selectPlan = By.xpath("//option[.=' Allegiant Superior Choice Standard Issue']");
	private By selectPlan_CICA = By.xpath("//option[.=' CICA Life Plus Standard Issue']");
	private By selectPlan_Garuntee = By.xpath("//option[.=' CICA Life Plus Guaranteed Issue']");
	private By Accidental_Checkbox = By.xpath("//ion-Checkbox[@formcontrolname='ADB']");
	private By FaceAmount = By.xpath("//ion-input[@formcontrolname='AmountOfInsurance']/input");
	private By ErrorMessage_FaceAmount = By.xpath("//ion-col[@class = 'md hydrated' and @size-md = '3']");
	private By Annually = By.xpath("//ion-label[text()='Annually']/following-sibling::ion-radio");
	private By Semi_Annually = By.xpath("//ion-label[text()='Semi-Annually']/following-sibling::ion-radio");
	private By Quarterly = By.xpath("//ion-label[text()='Quarterly']/following-sibling::ion-radio");
	private By Monthly = By.xpath("//ion-label[text()='Monthly']/following-sibling::ion-radio");
	private By Yes = By.xpath("(//ion-label[text()='Yes']/following-sibling::ion-radio)[2]");
	private By No = By.xpath("(//ion-label[text()='No']/following-sibling::ion-radio)[2]");
	private By Nextstep_1 = By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[2]");
	private By premiumType = By.xpath("//ion-label[text()='Monthly']/following-sibling::ion-radio");
	private By loanRadioBtn = By.xpath("(//ion-label[text()='Yes']/following-sibling::ion-radio)[2]");
	private By calculate = By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[1]");
	private By step_2 = By.xpath("//span[normalize-space()='Step 2: Proposed Insured Information']");
	
	private By step1PrimaryApplicantInfo = By.xpath("//h3[text()=\"Primary Applicant's Information\"]");
	private By AgentCannotSellPolicyPop_up = By.xpath("//span[.='OK']");
	private By MaleRadioButton = By.xpath("//ion-label[text()='Male ']/following-sibling::ion-radio");
	private By FemaleRadioButton = By.xpath("//ion-label[text()='Female ']/following-sibling::ion-radio");
	private By ErrorMessage_Age = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '2'])[2]");
	private By ErrorMessage_Coverage = By.xpath("//p[.='Who is Applying for Coverage?']/parent::div/parent::ion-col/parent::ion-row/following-sibling::div[4]/div/p[.='Value Required']");
	private By CoverageRadioButton = By.xpath("(//ion-radio[@slot='start' and @value='1' and @mode='md'])[2]");
	public static String Randomfirstname;
	private By ErrorMessage_TitleXIXProgram = By.xpath("(//ion-col//div[@class='radio-form-box'])[2]/parent::ion-col/parent::ion-row/following-sibling::div[4]/div/p[.='Value Required']");
	private By TitleXIXProgramRadioButton_Yes = By.xpath("(//ion-radio[@slot='start' and @value='true' and @mode='md'])[1]");
	private By TitleXIXProgramRadioButton_No = By.xpath("(//ion-radio[@slot='start' and @value='false' and @mode='md'])[1]");
	private By MaximumBenifit_1stRadioButton = By.xpath("(//ion-radio-group[@formcontrolname='PlanDesign']/following::ion-row/following-sibling::div[4]/div/p[.='Value Required'])[1]");
	private By MaximumBenifit_2ndRadioButton = By.xpath("(//ion-radio-group[@formcontrolname='PlanDesign']/following::ion-row/following-sibling::div[4]/div/p[.='Value Required'])[1]");
	private By MaximumBenifit_3rdRadioButton = By.xpath("(//ion-radio-group[@formcontrolname='PlanDesign']/following::ion-row/following-sibling::div[4]/div/p[.='Value Required'])[1]");

	private By ErrorMessage_MaximumBenifit = By.xpath("(//ion-radio-group[@formcontrolname='PlanDesign']/following::ion-row/following-sibling::div[4]/div/p[.='Value Required'])[1]");
	private By ErrorMessage_Mode = By.xpath("(//ion-radio-group[@formcontrolname='PlanDesign']/following::ion-row/following-sibling::div[4]/div/p[.='Value Required'])[2]");
	private By BasePlanRadioButton = By.xpath("(//ion-radio[@slot='start' and  @mode='md' and@value='1'])[3]");
	private By ModeRadioButton_Annually = By.xpath("(//ion-radio[@slot='start' and  @mode='md' and@value='12'])");
	private By ModeRadioButton_Semi = By.xpath("(//ion-radio[@slot='start' and  @mode='md' and@value='6'])");
	private By ModeRadioButton_Qauterly = By.xpath("(//ion-radio[@slot='start' and  @mode='md' and@value='3'])[2]");
	private By ModeRadioButton_Monthly = By.xpath("(//ion-radio[@slot='start' and  @mode='md' and@value='1'])[4]");
	private By MaximumBenifit_10000 = By.xpath("//ion-radio[@value='10000']");
	private By MaximumBenifit_20000 = By.xpath("//ion-radio[@value='20000']");
	private By MaximumBenifit_30000 = By.xpath("//ion-radio[@value='30000']");
	private By CalculateOkPop_up = By.xpath("//span[.='OK']");
	private By ListOfPlanDetails = By.xpath("//ion-radio-group[@formcontrolname='Plan']/ion-row/ion-col");

	private By PrimaryApplication_Step2 = By.xpath("//h3[.='Primary Applicant General Information']");
	public void Product_InformationHealth() throws Exception {

		String Mandate_Error = "Value Required";
		String Max_Error = "The maximum number of characters is 33.";
		String Max_Char = "qwertyuiopqwertyuiopqwertyuiopqwertyu";
		String Page_Error_ = "There are some errors on this page. Please correct before continuing.";
		String Fc_MxErr = "The maximum amount is 30000.";
		String Fc_MnErr = "The minimum amount is 1000.";

		

		WebUI.scrollToElementAtBottom(calculate);
		WebUI.verifyElementClickable(calculate);
		WebUI.clickElement(calculate);
		WebUI.clickElement(AgentCannotSellPolicyPop_up);
		WebUI.scrollToElementAtBottom(page_Error);
		WebUI.verifyElementPresent(page_Error, "Error message not displayed");
		

		WebUI.verifyContains(getTextElement(page_Error).trim(), Page_Error_);
		
		WebUI.scrollToElementAtTop(FirstName);
		WebUI.verifyElementVisible(FirstName, "First Name textbox not displayed");

		WebUI.verifyContains(getTextElement(Error_Message_FirstName).trim(), Mandate_Error);


		WebUI.sleep(1);
		WebUI.scrollToElementAtTop(step1PrimaryApplicantInfo);
		WebUI.clearText(FirstName);
		WebUI.setText(FirstName, Max_Char);
		WebUI.sleep(1);
		WebUI.verifyElementVisible(Error_Message_FirstName);	
		WebUI.verifyContains(getTextElement(Error_Message_FirstName).trim(), Max_Error);	
		Randomfirstname = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(FirstName,Randomfirstname);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(FirstName,"value"),Randomfirstname);
		WebUI.clearText(MiddleName);
		WebUI.setText(MiddleName, Max_Char);
		WebUI.verifyElementVisible(Error_Message_MiddleName);
		WebUI.verifyContains(getTextElement(Error_Message_MiddleName).trim(), Max_Error);
		String Randommiddlename = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(MiddleName,Randommiddlename);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(MiddleName,"value"),Randommiddlename);

		WebUI.verifyContains(getTextElement(Error_Message_LastName).trim(), Mandate_Error);

		WebUI.clearText(LastName);
		WebUI.setText(LastName, Max_Char);
		WebUI.verifyElementVisible(Error_Message_LastName);
		WebUI.verifyContains(getTextElement(Error_Message_LastName).trim(), Max_Error);
		String Randomlastname = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(LastName,Randomlastname);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(LastName,"value"),Randomlastname);
		WebUI.sleep(1);
		WebUI.verifyContains(getTextElement(Error_Message_Gender).trim(), Mandate_Error);
		WebUI.clickElement(MaleRadioButton);
		WebUI.clickElement(FemaleRadioButton);
		WebUI.clickElement(MaleRadioButton);
		WebUI.sleep(1);
		WebUI.verifyContains(getTextElement(Error_Message_DateOfBirth).trim(), Mandate_Error);
		WebUI.verifyContains(getTextElement(ErrorMessage_Age).trim(), Mandate_Error);
//		WebUI.moveByOffsetWithRobot(DateOfBirth, 686, 363);
//		WebUI.moveByOffsetWithRobotAndClick(DateOfBirth, 686, 351);
//		WebUI.clickElement(DateOfBirth);
		
		String RandomDOB = DataGenerateUtils.randomDateOfBirthDDMMYYYY();
//		WebUI.click
		WebUI.setText(DateOfBirth,RandomDOB);
		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(DateOfBirth,"value"),RandomDOB);
//		WebUI.setText(DateOfBirth, PropertiesHelpers.getValue("date_Of_Birth"));
		WebUI.verifyElementClickable(StateDropdown);
//		WebUI.clickElement(StateDropdown);	
		WebUI.sleep(1);
//		WebUI.clickElement(state);
		WebUI.selectOptionByText(StateDropdown, "Georgia");
		WebUI.verifyElementVisible(Error_Message_Language);
		WebUI.verifyContains(getTextElement(Error_Message_Language).trim(), Mandate_Error);
		WebUI.verifyElementClickable(preferredlanguage);
		WebUI.clickElement(preferredlanguage);
		WebUI.sleep(1);
		WebUI.clickElement(language);
		WebUI.verifyElementVisible(ErrorMessage_Coverage);	
		WebUI.verifyContains(getTextElement(ErrorMessage_Coverage).trim(), Mandate_Error);	
		WebUI.verifyElementClickable(CoverageRadioButton);
		System.out.println("CoverageDetials*************"+CoverageRadioButton);
		
		WebUI.clickElement(CoverageRadioButton);
		WebUI.verifyElementVisible(ErrorMessage_TitleXIXProgram);	
		WebUI.verifyContains(getTextElement(ErrorMessage_TitleXIXProgram).trim(), Mandate_Error);
		WebUI.verifyElementClickable(TitleXIXProgramRadioButton_Yes);
		WebUI.clickElement(TitleXIXProgramRadioButton_Yes);
		WebUI.verifyElementClickable(TitleXIXProgramRadioButton_No);
		WebUI.clickElement(TitleXIXProgramRadioButton_No);
		WebUI.scrollToElementAtBottom(calculate);
//		WebUI.verifyElementVisible(ErrorMessage_TitleXIXProgram);	
//		WebUI.verifyContains(getTextElement(ErrorMessage_TitleXIXProgram).trim(), Mandate_Error);
		WebUI.verifyElementClickable(BasePlanRadioButton);
		WebUI.clickElement(BasePlanRadioButton);
		WebUI.verifyElementVisible(ErrorMessage_MaximumBenifit);	
		WebUI.verifyContains(getTextElement(ErrorMessage_MaximumBenifit).trim(), Mandate_Error);
		WebUI.verifyElementClickable(MaximumBenifit_10000);
		WebUI.clickElement(MaximumBenifit_10000);
		WebUI.verifyElementClickable(MaximumBenifit_20000);
		WebUI.clickElement(MaximumBenifit_20000);
		WebUI.verifyElementClickable(MaximumBenifit_30000);
		WebUI.clickElement(MaximumBenifit_30000);
		WebUI.sleep(2);
		WebUI.scrollToElementAtBottom(Nextstep_1);
//		WebUI.verifyElementVisible(ErrorMessage_Mode);	
//		WebUI.verifyContains(getTextElement(ErrorMessage_Mode).trim(), Mandate_Error);
		WebUI.verifyElementClickable(ModeRadioButton_Annually);
		WebUI.clickElement(ModeRadioButton_Annually);
		WebUI.verifyElementClickable(ModeRadioButton_Semi);
		WebUI.clickElement(ModeRadioButton_Semi);
		WebUI.verifyElementClickable(ModeRadioButton_Qauterly);
		WebUI.clickElement(ModeRadioButton_Qauterly);
		WebUI.verifyElementClickable(ModeRadioButton_Monthly);
		WebUI.clickElement(ModeRadioButton_Monthly);
		WebUI.verifyElementClickable(Nextstep_1);
		WebUI.clickElement(Nextstep_1);
		WebUI.verifyElementClickable(CalculateOkPop_up);
		WebUI.clickElement(CalculateOkPop_up);
		WebUI.sleep(1);
		WebUI.clickElement(calculate);
		WebUI.sleep(1);
		WebUI.clickElement(Nextstep_1);
		WebUI.waitForElementVisible(PrimaryApplication_Step2);

	}
}



