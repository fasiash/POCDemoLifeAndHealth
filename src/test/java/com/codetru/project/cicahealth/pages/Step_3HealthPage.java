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


public class Step_3HealthPage extends CommonPageHealthCICA {


//	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[3]")
	private By NextStep3 = By.xpath("(//ion-col[@size='24' and @size-md='6' and @class='md hydrated']/ion-button)[3]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryFirstName']/input")
	private By BenificiaryFirstname = By.xpath("//ion-input[@formcontrolname='BeneficiaryFirstName']/input");
	
//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryBusinessName']/input")
	private By Business_name = By.xpath("//ion-input[@formcontrolname='BeneficiaryBusinessName']/input");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[6]")
	private By Error_BenificicartFirstName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[6]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryMiddleName']/input")
	private By BenificiaryMiddlename = By.xpath("//ion-input[@formcontrolname='BeneficiaryMiddleName']/input"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[7]")
	private By Error_BenificicartMiddleName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[7]"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '8' and @size='24'])[8]")
	private By Error_BenificicaryLastName_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[8]"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[4]")
	private By Error_BenificicaryAddress_1_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[2]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryLastName']/input")
	private By BenificiaryLastname = By.xpath("//ion-input[@formcontrolname='BeneficiaryLastName']/input");

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryAddress1']/input")
	private By BenificiaryAddress_1 = By.xpath("//ion-input[@formcontrolname='BeneficiaryAddress1']/input");

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryAddress2']/input")
	private By BenificiaryAddress_2 = By.xpath("//ion-input[@formcontrolname='BeneficiaryAddress2']/input"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[5]")
	private By Error_MaximumBenificiaryAddress_2_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '24' and @size='24'])[3]"); 

//	@FindBy(xpath = "//ion-button[normalize-space()='Add Beneficiary']")
	private By AddBenificiary = By.xpath("//ion-button[normalize-space()='Add Beneficiary']"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '10' and @size='24'])[2]")
	private By Error_BenificicaryCity_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '10' and @size='24'])[2]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryCity']/input")
	private By BenificiaryCity = By.xpath("//ion-input[@formcontrolname='BeneficiaryCity']/input"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[4]")
	private By Error_BenificicaryState_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[9]"); 

//	@FindBy(xpath = "//select[@formcontrolname='BeneficiaryState']")
	private By benificiaryState = By.xpath("//select[@formcontrolname='BeneficiaryState']"); 

//	@FindBy(xpath = "(//option[.=' Arizona'])[2]")
	private By Arizona_State = By.xpath("(//option[.=' Arizona'])[2]"); 

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[5]")
	private By Error_BenificicaryZipCode_Message = By.xpath("(//ion-col[@class = 'md hydrated' and @size-md = '7' and @size='24'])[10]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryZipCode']/input")
	private By benificiaryZipcode = By.xpath("//ion-input[@formcontrolname='BeneficiaryZipCode']/input"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryEmailAddress']/input")
	private By benificiaryEmailAddress = By.xpath("//ion-input[@formcontrolname='BeneficiaryEmailAddress']/input"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[1]")
	private By Error_Message_BenificiaryEmailAddress = By.xpath("(//ion-col[@class='md hydrated' and @size='24' and @size-md='5'])[1]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname= 'BeneficiaryPhone']/input")
	private By benificiaryPhone = By.xpath("//ion-input[@formcontrolname= 'BeneficiaryPhone']/input"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[2]")
	private By Error_Message_MinimumBenificiaryPhone = By.xpath("(//ion-col[@class='md hydrated' and @size='24' and @size-md='5'])[2]"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[3]")
	private By Error_Message_MinimumBenificiarySSN = By.xpath("(//ion-col[@class='md hydrated' and @size='24' and @size-md='5'])[3]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiarySSN']/input")
	private By BenificiarySSN = By.xpath("//ion-input[@formcontrolname='BeneficiarySSN']/input"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[7]/ion-col[@class='md hydrated' and @size='24'])[4]")
	private By Error_Message_BenificiaryDOB = By.xpath("(//ion-col[@class='md hydrated' and @size='24' and @size-md='5'])[4]"); 

//	@FindBy(xpath = "//input[@formcontrolname='BeneficiaryBirthDate']")
	private By BenificiaryDOB = By.xpath("//input[@formcontrolname='BeneficiaryBirthDate']"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[1]")
//	private By Error_Message_BenificiaryPercent = By.xpath("(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[1]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryPercent']/input")
	private By BenificiaryPercent = By.xpath("//ion-input[@formcontrolname='BeneficiaryPercent']/input"); 

	@FindBy(xpath = "//p[normalize-space()='Primary Beneficiaries must equal 100']")
	private By benificiaryMaxPercentError = By.xpath("//p[normalize-space()='Primary Beneficiaries must equal 100']"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[2]")
	private By Error_Message_BenificiaryRelationShip = By.xpath("(//ion-col[@class='md hydrated' and @size='24' and @size-md='8'])[11]"); 

//	@FindBy(xpath = "//select[@formcontrolname='BeneficiaryRelation']")
	private By Benificiaryrelation = By.xpath("//select[@formcontrolname='BeneficiaryRelation']"); 

//	@FindBy(xpath = "(//div[@formarrayname= 'BeneficiaryInformation']//ion-row[8]/ion-col[@class='md hydrated' and @size='24'])[3]")
	private By error_Message_BenificiaryRelationShipForElementOthers = By.xpath("(//ion-col[@class='md hydrated' and @size='24' and @size-md='10'])[3]"); 

//	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryOtherExplain']/input")
	private By benificiaryOthersRelationsship = By.xpath("//ion-input[@formcontrolname='BeneficiaryOtherExplain']/input"); 

//	@FindBy(xpath = "//option[.=' Other']")
	private By Other = By.xpath("//option[.=' Other']");

//	@FindBy(xpath="(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[4]")
	private By NextStep4 = By.xpath("(//ion-col[@size='24' and @size-md='6' and @class='md hydrated']/ion-button)[4]");


	public void Beneficiary_Information() throws Exception {


		String Max_Name = "sdfsadfgdfsfghfghxfghjdsfghdfghdfghjdfsghdsfghretyu";
		String Add_Max = "913 Alena Lakes Suite 843 35311 Kub Extensions Apt.Lakes Suite 843 ";
		String Max_error ="The maximum number of characters is 33.";
		String Max_error_ ="The maximum number of characters is 50";
		String Mandatory_Error = "Value Required";
		String Min_error_Zp ="The minimum number of characters is 5.";
		String Max_error_Zp ="The maximum number of characters is 5.";
		String Min_error_Pn ="The minimum number of characters is 10.";
		String Max_error_Pn ="The maximum number of characters is 10.";
		String Min_error_ssn ="The minimum number of characters is 9.";
		String Max_error_ssn ="The maximum number of characters is 9.";
		String incorrect_email_error = "Email is not in the correct format";
		String benif_max_percentage_error = "Primary Beneficiaries must equal 100";
		
		WebUI.sleep(2);
//		WebUI.scrollToElementAtBottom(NextStep3);
//		WebUI.verifyElementClickable(NextStep3);
//		WebUI.clickElement(NextStep3);
//		WebUI.scrollToElementAtTop(BenificiaryFirstname);
//		WebUI.verifyElementPresent(BenificiaryFirstname, "Error message not displayed");

//		WebUI.verifyContains(getTextElement(Error_BenificicartFirstName_Message).trim(), Mandatory_Error);

//		WebUI.clearText(BenificiaryFirstname);
//		WebUI.setText(BenificiaryFirstname, Max_Name);
//		WebUI.verifyElementVisible(Error_BenificicartFirstName_Message);
//		WebUI.verifyContains(getTextElement(Error_BenificicartFirstName_Message).trim(), Max_error);

		String RandomBenificiaryfirstname = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(BenificiaryFirstname,RandomBenificiaryfirstname);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryFirstname,"value"),RandomBenificiaryfirstname);
		
//		WebUI.clearText(BenificiaryMiddlename);
//		WebUI.setText(BenificiaryMiddlename, Max_Name);
//		WebUI.verifyElementVisible(Error_BenificicartMiddleName_Message);
//		WebUI.verifyContains(getTextElement(Error_BenificicartMiddleName_Message).trim(), Max_error);

		String RandomBenificiaryMiddlename = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillText(BenificiaryMiddlename,RandomBenificiaryMiddlename);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryMiddlename,"value"),RandomBenificiaryMiddlename);
		
//		C.Empty_Input(driver, Error_BenificicaryLastName_Message,Mandatory_Error , e, Test.Case4(10), Test.Exp4(10));
//		WebUI.verifyContains(getTextElement(Error_BenificicaryLastName_Message).trim(), Mandatory_Error);

//		WebUI.clearText(BenificiaryLastname);
//		WebUI.setText(BenificiaryLastname, Max_Name);
//		WebUI.verifyElementVisible(Error_BenificicaryLastName_Message);
//		WebUI.verifyContains(getTextElement(Error_BenificicaryLastName_Message).trim(), Max_error);

		String RandomBenificiaryLastname = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(BenificiaryLastname,RandomBenificiaryLastname);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryLastname,"value"),RandomBenificiaryLastname);
		
//		WebUI.verifyContains(getTextElement(Error_BenificicaryAddress_1_Message).trim(), Mandatory_Error);	
//		WebUI.clearText(BenificiaryAddress_1);
//		WebUI.setText(BenificiaryAddress_1, Add_Max);
//		WebUI.verifyElementVisible(Error_BenificicaryAddress_1_Message);
//		WebUI.verifyContains(getTextElement(Error_BenificicaryAddress_1_Message).trim(), Max_error);

		String RandomBenificiaryAddress = "520 Jordan Rd,Sedona";
		WebUI.clearAndFillText(BenificiaryAddress_1,RandomBenificiaryAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_1,"value"),RandomBenificiaryAddress);
		
//		C.Max_Char(driver, BenificiaryAddress_2, Error_MaximumBenificiaryAddress_2_Message, Add_Max,Max_error, e, Test.Case4(15), Test.Exp4(15));
//		WebUI.clearText(BenificiaryAddress_2);
//		WebUI.setText(BenificiaryAddress_2, Add_Max);
//		WebUI.verifyElementVisible(Error_MaximumBenificiaryAddress_2_Message);
//		WebUI.verifyContains(getTextElement(Error_MaximumBenificiaryAddress_2_Message).trim(), Max_error);

//		String RandomBenificiaryAddress_2 = DataGenerateUtils.randomShortAddress();
//		WebUI.clearAndFillText(BenificiaryAddress_2,RandomBenificiaryAddress_2);
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BenificiaryAddress_2,"value"),RandomBenificiaryAddress_2);
//		WebUI.scrollToElementAtBottom(AddBenificiary);
//		WebUI.verifyElementVisible(AddBenificiary);

//		WebUI.verifyContains(getTextElement(Error_BenificicaryCity_Message).trim(), Mandatory_Error);
	
//		WebUI.clearText(BenificiaryCity);
//		WebUI.setText(BenificiaryCity, Max_Name);
//		WebUI.verifyElementVisible(Error_BenificicaryCity_Message);
//		WebUI.verifyContains(getTextElement(Error_BenificicaryCity_Message).trim(), Max_error);

		String RandomBenificiaryCity = DataGenerateUtils.randomCity();
		WebUI.clearAndFillText(BenificiaryCity,RandomBenificiaryCity);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryCity,"value"),RandomBenificiaryCity);
		
//		WebUI.verifyContains(getTextElement(Error_BenificicaryState_Message).trim(), Mandatory_Error);
		WebUI.waitForElementVisible(benificiaryState);
		WebUI.clickElement(benificiaryState);
		WebUI.sleep(1);
//		WebUI.waitForElementVisible(Arizona_State);
		WebUI.selectOptionByText(benificiaryState,"Arizona");
		
//		WebUI.verifyContains(getTextElement(Error_BenificicaryZipCode_Message).trim(), Mandatory_Error);
//
//		WebUI.clearText(benificiaryZipcode);
//		WebUI.setText(benificiaryZipcode, "345");
//		WebUI.verifyElementVisible(Error_BenificicaryZipCode_Message);
//		WebUI.verifyContains(getTextElement(Error_BenificicaryZipCode_Message).trim(), Min_error_Zp);

//		WebUI.clearText(benificiaryZipcode);
//		WebUI.setText(benificiaryZipcode, "3456789");
//		WebUI.verifyElementVisible(Error_BenificicaryZipCode_Message);
//		WebUI.verifyContains(getTextElement(Error_BenificicaryZipCode_Message).trim(), Max_error_Zp);

		String RandomBenificiaryZipcode = DataGenerateUtils.randomZipCode();
		WebUI.clearAndFillText(benificiaryZipcode,RandomBenificiaryZipcode);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(benificiaryZipcode,"value"),RandomBenificiaryZipcode);
		
//		WebUI.clearText(benificiaryEmailAddress);
//		WebUI.setText(benificiaryEmailAddress, "asdsaf");
//		WebUI.verifyElementVisible(Error_Message_BenificiaryEmailAddress);
//		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryEmailAddress).trim(), incorrect_email_error);
//
//		WebUI.clearText(benificiaryEmailAddress);
//		WebUI.setText(benificiaryEmailAddress, Max_Name);
//		WebUI.verifyElementVisible(Error_Message_BenificiaryEmailAddress);
//		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryEmailAddress).trim(), Max_error_);
//
		String RandomBenificiaryEmail = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(benificiaryEmailAddress,RandomBenificiaryEmail);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(benificiaryEmailAddress,"value"),RandomBenificiaryEmail);

//		WebUI.clearText(benificiaryPhone);
//		WebUI.setText(benificiaryPhone, "123");
//		WebUI.verifyElementVisible(Error_Message_MinimumBenificiaryPhone);
//		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiaryPhone).trim(), Min_error_Pn);

//		WebUI.clearText(benificiaryPhone);
//		WebUI.setText(benificiaryPhone, "12487451245871");
//		WebUI.verifyElementVisible(Error_Message_MinimumBenificiaryPhone);
//		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiaryPhone).trim(), Max_error_Pn);

		String RandomBenificiaryPhone = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(benificiaryPhone,RandomBenificiaryPhone);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(benificiaryPhone,"value"),RandomBenificiaryPhone);
		
//		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiarySSN).trim(), Mandatory_Error);
//		WebUI.clearText(BenificiarySSN);
//		WebUI.setText(BenificiarySSN, "12345");
//		WebUI.verifyElementVisible(Error_Message_MinimumBenificiarySSN);
//		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiarySSN).trim(), Min_error_ssn);


//		WebUI.clearText(BenificiarySSN);
//		WebUI.setText(BenificiarySSN, "123455874512");
//		WebUI.verifyElementVisible(Error_Message_MinimumBenificiarySSN);
//		WebUI.verifyContains(getTextElement(Error_Message_MinimumBenificiarySSN).trim(), Max_error_ssn);

		String RandomBenificiarySSN = DataGenerateUtils.randomSSNNumber();
		WebUI.clearAndFillText(BenificiarySSN,RandomBenificiarySSN);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiarySSN,"value"),RandomBenificiarySSN);
		
//		C.Empty_Input(driver, Error_Message_BenificiaryDOB,Mandatory_Error , e, Test.Case4(40), Test.Exp4(40));
//		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryDOB).trim(), Mandatory_Error);


		String RandomBenificiaryDOB = DataGenerateUtils.randomDateOfBirthDDMMYYYY();
		WebUI.clearAndFillText(BenificiaryDOB,RandomBenificiaryDOB);
		WebUI.sleep(1);
		
//		C.Empty_Input(driver, Error_Message_BenificiaryPercent,Mandatory_Error , e, Test.Case4(57), Test.Exp4(57));
//		WebUI.verifyContains(getTextElement(benificiaryMaxPercentError).trim(), benif_max_percentage_error);
//
//		WebUI.clearText(BenificiaryPercent);
//		WebUI.setText(BenificiaryPercent, "123455874512");
//		WebUI.verifyElementVisible(benificiaryMaxPercentError);
//		WebUI.verifyContains(getTextElement(benificiaryMaxPercentError).trim(), benif_max_percentage_error);

//		C.Send_verify_Valid_C(driver, BenificiaryPercent, e, "100", Test.Case4(43), Test.Exp4(43));
		WebUI.clearAndFillText(BenificiaryPercent, "100");
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BenificiaryPercent, "value"), "100");
//
//		WebUI.verifyContains(getTextElement(Error_Message_BenificiaryRelationShip).trim(), Mandatory_Error);
//
		WebUI.clickElement(Benificiaryrelation);
		WebUI.sleep(1);
		WebUI.clickElement(Other);
		WebUI.sleep(2);
		WebUI.clickElement(Benificiaryrelation);
		WebUI.sleep(1);
//		WebUI.isElementVisible(error_Message_BenificiaryRelationShipForElementOthers, 2);
//		WebUI.verifyContains(getTextElement(error_Message_BenificiaryRelationShipForElementOthers).trim(), "Please Explain Other Relationship");
//
////		C.Send_verify_Valid(driver, benificiaryOthersRelationsship, e, "Others", Test.Case4(48), Test.Exp4(48));
		WebUI.clearAndFillText(benificiaryOthersRelationsship, "Others");
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(benificiaryOthersRelationsship, "value"), "Others");

//		C.page_Navigation(driver, act, NextStep4,NextStep5 , e, Test.Case4(51), Test.Exp4(51));
		WebUI.moveToElement(NextStep3);
		WebUI.sleep(1);
		WebUI.clickElement(NextStep3);
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(NextStep4);
		

		
		}


}
