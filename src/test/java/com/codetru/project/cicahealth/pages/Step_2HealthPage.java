package com.codetru.project.cicahealth.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import org.openqa.selenium.By;

import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.project.cicahealth.CommonPageHealthCICA;
import com.codetru.utils.DataGenerateUtils;

public class Step_2HealthPage extends CommonPageHealthCICA {


	private By step_2 = By.xpath("//h3[text()='Insured Information']");

//	@FindBy(xpath = "(//ion-col/ion-button[starts-with(@class, 'md button')])[2]")
	private By NextStep2 = By.xpath("(//ion-col[@size='24' and @size-md='6' and @class='md hydrated'])[4]/ion-button");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedSSN']/input")
	private By SSN_Number = By.xpath("//ion-input[@formcontrolname='ProposedSSN']/input");

//	@FindBy(xpath = "//ion-col[@class = 'md hydrated' and @size-md = '14']")
	private By ErrorSSN_NumberMessage = By.xpath("//h3[.='Primary Applicant General Information']/following-sibling::ion-row[2]/ion-col[4]");

	private By ErrorSSN_MinimumMessage = By.xpath("//ion-input[@formcontrolname='ProposedSSN']/ancestor::ion-col/div/div/p[.='SSN should have exactly 9 digits.']");
	
	private By ErrorSSN_FormatMessage = By.xpath("//ion-input[@formcontrolname='ProposedSSN']/ancestor::ion-col/div/div/p[contains(text(),'First 3 digits')]");

	private By ErrorSSN_InvalidMessage = By.xpath("//ion-input[@formcontrolname='ProposedSSN']/ancestor::ion-col/div/div/p[contains(text(),'Invalid SSN.')]");

//	@FindBy(xpath="//ion-input[@formcontrolname='ProposedEmailAddress']/input")
	private By EmailAddress = By.xpath("//ion-input[@formcontrolname='ProposedEmailAddress']/input");

//	@FindBy(xpath="(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]")
	private By Error_EmailAddressMessage = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[1][@size='24' and@class='md hydrated'])[1]");

//	@FindBy(xpath="(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]")
	private By Error_EmailCorrectFormatMessage = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[1][@size='24' and@class='md hydrated'])[1]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedMobilePhone']/input")
	private By phoneNumber = By.xpath("//ion-input[@formcontrolname='ProposedPhone']/input");

//	@FindBy(xpath = "(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[2]")
	private By Error_PhoneNumberMessage = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[2])[1]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalAddress1']/input")
	private By Address_1_Message = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalAddress1']/input");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24'])[1]")
	private By Error_Address_1_Message = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[1])[2]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalAddress2']/input")
	private By Address_2_Message = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalAddress2']/input");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24'])[2]")
	private By Error_Address_2_Message = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[1])[3]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalZipCode']/input")
	private By ZipCode = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalZipCode']/input");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '7'])[1]")
	private By Error_ZipCode_Message = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[1])[4]");

//	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalZipCode']/following-sibling::ion-button")
	private By Proposed_ZipCode = By.xpath("//ion-input[@formcontrolname='ProposedPhysicalZipCode']/following-sibling::ion-button");

//	@FindBy(xpath = "//select[@formcontrolname='ProposedPhysicalCity']")
	private By city = By.xpath("//select[@formcontrolname='ProposedPhysicalCity']");

//	@FindBy(xpath = "//option[.='Dodge City ']")
	private By CitySelection = By.xpath("//option[.='Dodge City ']");
	
	private By Error_Message_ValidZipcode = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[2])[2]");

//	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '10'])[1]")
	private By Error_City_Message = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[1])[5]");

	private By Error_State_Message = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[2])[3]");

//	@FindBy(xpath = "(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]")
	private By NextStep3 = By.xpath("(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]");
	
	private By IsYourMallingAddres = By.xpath("(//h3[.='Primary Applicant Contact Information']/following-sibling::ion-row/ion-col[1][@size='24' and@class='md hydrated'])[6]");
	private By ZipCodeSearch = By.xpath("//ion-button[@title='Search']");
	private By Error_MessageIsYourMallingAddres = By.xpath("//div//p[text()='Is this your mailing address?']/following::div[6]");
	private By IsYourMallingAddresRadioButton_yes = By.xpath("(//ion-radio[@slot='start' and @value='true'])[3]");


	public void Proposed_Insured_Information() throws Exception {
		
		String Email_Max = "destinysdfghdfghdfsgdsfgsdfgdfghdfghdsfghjdsfghdfghdfghfgh";
		String Add_Max = "280 SIERRA DR. APT. B407 1142 SW ARLINGTON BLVD 1142 SW ARLINGTON BLVD";
		String Max_error ="The maximum number of characters is 33.";
		String Max_error_ ="The maximum number of characters is 50";
		String Min_error_Pn ="The minimum number of characters is 10.";
		String Max_error_Pn ="The maximum number of characters is 10.";
		String Min_error_Zp ="The minimum number of characters is 5.";
		String Max_error_Zp ="The maximum number of characters is 5.";
		String Mandatory_Error = "Value Required";
		String Ssn_error = "SSN should have exactly 9 digits.";
		String Ssn_error1 = "First 3 digits of SSN should not be 000, 666 or between 900 and 999.";
		String Ssn_error2 ="Invalid SSN.";
		String Chars_only = "abcdefghijklmnopqrstuvwxyz";
		String Ssn_Num_Error = "Please use a number format.";
		String incorrect_Email_Error = "Email is not in the correct format";
		String phone_Num_Format_Error = "Please use a number format.";
		String ValidZipCode_Error ="Please enter a valid Zip Code.";
		
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(step_2);
		
//		WebUI.scrollToElementAtBottom(NextStep2);
//		WebUI.clickElement(NextStep2);
//		WebUI.scrollToElementAtBottom(SSN_Number);
//		WebUI.verifyElementVisible(SSN_Number);
//		WebUI.scrollToElementAtBottom(NextStep2);
//		WebUI.verifyElementClickable(NextStep2);
		WebUI.clickElement(NextStep2);
		WebUI.scrollToElementAtTop(step_2);
		WebUI.verifyContains(getTextElement(ErrorSSN_NumberMessage).trim(), Ssn_error);
		WebUI.setText(SSN_Number, "25478451");
		WebUI.verifyElementVisible(ErrorSSN_MinimumMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_MinimumMessage).trim(), Ssn_error);
		WebUI.clearText(SSN_Number);
		
		WebUI.clearAndFillText(SSN_Number, "999987845");
		WebUI.verifyElementVisible(ErrorSSN_FormatMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_FormatMessage).trim(), Ssn_error1);

		WebUI.clearAndFillText(SSN_Number, "111111111");
		WebUI.verifyElementVisible(ErrorSSN_InvalidMessage);
		WebUI.verifyContains(getTextElement(ErrorSSN_InvalidMessage).trim(), Ssn_error2);
		
		WebUI.clickElement(SSN_Number);
		String RandomSSNNumber = DataGenerateUtils.randomValidSSN();
		WebUI.clearAndFillText(SSN_Number,RandomSSNNumber);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(SSN_Number,"value"),RandomSSNNumber);
//		----------------------------------
		WebUI.scrollToElementAtBottom(ZipCode);
		WebUI.verifyElementVisible(ZipCode);
//		WebUI.verifyElementVisible(Error_EmailAddressMessage);
//		WebUI.verifyContains(getTextElement(Error_EmailAddressMessage).trim(), Mandatory_Error);

//		WebUI.setText(EmailAddress, "destiny001");
//		WebUI.verifyElementVisible(Error_EmailCorrectFormatMessage);
//		WebUI.verifyContains(getTextElement(Error_EmailCorrectFormatMessage).trim(), incorrect_Email_Error);

//		WebUI.clearText(EmailAddress);
//		WebUI.setText(EmailAddress, Email_Max);
//		WebUI.verifyElementVisible(Error_EmailCorrectFormatMessage);
//		WebUI.verifyContains(getTextElement(Error_EmailCorrectFormatMessage).trim(), Max_error_);

		String RandomEmailAddress = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(EmailAddress,RandomEmailAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(EmailAddress,"value"),RandomEmailAddress);
		
//		WebUI.verifyElementVisible(Error_PhoneNumberMessage);
//		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), Mandatory_Error);

//		
//		WebUI.clearAndFillText(phoneNumber, "98765432");
//		WebUI.verifyElementVisible(Error_PhoneNumberMessage);
//		WebUI.verifyContains(getTextElement(Error_PhoneNumberMessage).trim(), Min_error_Pn);
//
//		WebUI.clearAndFillText(phoneNumber, "98765432100");
//
		String RandomPhoneumber = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(phoneNumber,RandomPhoneumber);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(phoneNumber,"value"),RandomPhoneumber);
		
////		WebUI.verifyContains(getTextElement(Error_Address_1_Message).trim(), Mandatory_Error);
//		WebUI.verifyElementVisible(Error_Address_1_Message);
//		WebUI.verifyContains(getTextElement(Error_Address_1_Message).trim(), Mandatory_Error);
		
////		WebUI.clearText(Address_1_Message);
//		WebUI.setText(Address_1_Message, Add_Max);
//		WebUI.verifyElementVisible(Error_Address_1_Message);
//		WebUI.verifyContains(getTextElement(Error_Address_1_Message).trim(), Max_error);
//
		String RandomAddress = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(Address_1_Message,RandomAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(Address_1_Message,"value"),RandomAddress);
		
////		WebUI.clearText(Address_2_Message);
//		WebUI.setText(Address_2_Message, Add_Max);
//		WebUI.verifyElementVisible(Error_Address_2_Message);
//		WebUI.verifyContains(getTextElement(Error_Address_2_Message).trim(), Max_error);
		
		String RandomAddress_2 = DataGenerateUtils.randomShortAddress();
		WebUI.clearAndFillText(Address_2_Message,RandomAddress_2);
		WebUI.sleep(1);
		WebUI.scrollToElementAtBottom(Error_MessageIsYourMallingAddres);
		WebUI.verifyContains(getAttributeElement(Address_2_Message,"value"),RandomAddress_2);
	
//		WebUI.verifyElementVisible(Error_ZipCode_Message);
//		WebUI.verifyContains(getTextElement(Error_ZipCode_Message).trim(), Mandatory_Error);

//		WebUI.clearAndFillText(ZipCode, "1234");
//		WebUI.verifyElementVisible(Error_ZipCode_Message);
//		WebUI.verifyContains(getTextElement(Error_ZipCode_Message).trim(), Min_error_Zp);
//
////		WebUI.clearText(ZipCode);
//		WebUI.clearAndFillText(ZipCode, "123456");
//		WebUI.verifyElementVisible(Error_ZipCode_Message);
//		WebUI.verifyContains(getTextElement(Error_ZipCode_Message).trim(), Max_error_Zp);
		

		String CorrectZipCode = "12345";
		WebUI.clearAndFillText(ZipCode,CorrectZipCode);
		WebUI.sleep(1);
		
//		WebUI.verifyElementVisible(ZipCode);
//		WebUI.verifyContains(getTextElement(ZipCode).trim(), CorrectZipCode);
		
//		WebUI.verifyElementVisible(Error_State_Message);
//		WebUI.verifyContains(getTextElement(Error_State_Message).trim(), Mandatory_Error);
//		WebUI.verifyElementVisible(Error_City_Message);
//		WebUI.verifyContains(getTextElement(Error_City_Message).trim(), Mandatory_Error);
		
		WebUI.verifyElementVisible(ZipCodeSearch);
		WebUI.clickElement(ZipCodeSearch);
		WebUI.sleep(2);
		
//		WebUI.verifyElementVisible(Error_MessageIsYourMallingAddres);
//		WebUI.verifyContains(getTextElement(Error_MessageIsYourMallingAddres).trim(), Mandatory_Error);
		WebUI.verifyElementClickable(IsYourMallingAddresRadioButton_yes);
		WebUI.clickElement(IsYourMallingAddresRadioButton_yes);
		WebUI.scrollToElementAtBottom(NextStep2);
		WebUI.verifyElementClickable(NextStep2);
		WebUI.clickElement(NextStep2);

	}

}
