package com.codetru.project.cicahealth.pages;

import static com.codetru.keywords.WebUI.getAttributeElement;
import static com.codetru.keywords.WebUI.getTextElement;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.codetru.driver.DriverManager;
import com.codetru.helpers.PropertiesHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.project.cicahealth.CommonPageHealthCICA;
import com.codetru.utils.DataGenerateUtils;

public class Step_10PageACH extends CommonPageHealthCICA {
	
//	@FindBy(xpath="//span[text()='Step 9: Make a Payment']")
	private By MakePayment_Step_9 = By.xpath("//span[text()='Step 9: Make a Payment']");
	
	private By nextButton = By.xpath("//ion-button[normalize-space()='Next']");
	
	private By wait_ion_padding = By.xpath("(//ion-content[contains(@class, ion-padding)])[6]");
		
//	@FindBy(xpath="//ion-button[normalize-space()='Next']")
	private By nextButton_PolicyPayment = By.xpath("//ion-button[normalize-space()='Next']");
	
//	@FindBy(xpath="(//ion-content[contains(@class, ion-padding)])[6]")
	private By waitUntill = By.xpath("(//ion-content[contains(@class, ion-padding)])[6]");
	
//	@FindBy(xpath="(//ion-col/ion-button[@size='small' and @color='primary'])[1]")
	private By nxtBtn = By.xpath("(//ion-col/ion-button[@size='small' and @color='primary'])[1]");
	
//	@FindBy(xpath="//ion-checkbox[@formcontrolname='disclaimerYes']")
	private By Disclaimeryes = By.xpath("//ion-checkbox[@formcontrolname='disclaimerYes']");
	
//	@FindBy(xpath="//ion-label[.=' Relationship']/parent::ion-item/following-sibling::div[.=' Please enter a value. ']")
	private By Error_PolicyPayment_Relationship = By.xpath("//ion-label[.=' Relationship']/parent::ion-item/following-sibling::div[.=' Please enter a value. ']");
	
//	@FindBy(xpath="(//ion-col[@size='24' and @size-md='8' and @class='md hydrated'])[5]")
	private By ErrorMessage_PolicyPayment_PaymentType = By.xpath("(//ion-col[@size='24' and @size-md='8' and @class='md hydrated'])[5]");
	
//	@FindBy(xpath="//select[@formcontrolname='Relationship']")
	private By RelationShipDropDown = By.xpath("//select[@formcontrolname='Relationship']");
	
//	@FindBy(xpath="//option[.='Parent ']")
	private By RelationShip_Parent = By.xpath("//option[.='Parent ']");
	
//	@FindBy(xpath="//select[@formcontrolname='PaymentType']")
	private By PaymentType = By.xpath("//select[@formcontrolname='PaymentType']");
	
//	@FindBy(xpath="//option[.='Premium']")
	private By PaymentType_premium = By.xpath("//option[.='Premium']");
	
//	@FindBy(xpath="//ion-button[@color='primary' and @size-md='8']")
	private By NextBtn_BillingPage = By.xpath("//ion-button[@color='primary' and @size-md='8']");
	
//	@FindBy(xpath="(//h3[.='Payment Preferences']/following-sibling::ion-row/ion-col[@size='24'])[1]")
	private By Error_FormOfPayment = By.xpath("(//h3[.='Payment Preferences']/following-sibling::ion-row/ion-col[@size='24'])[1]");
	
//	@FindBy(xpath="(//ion-radio[@slot='start' and @aria-checked='false'])[1]")
	private By CreditCard = By.xpath("(//ion-radio[@slot='start' and @aria-checked='false'])[1]");
	
//	@FindBy(xpath="(//h3[.='Payment Preferences']/following-sibling::ion-row/ion-col[@size='24'])[2]")
	private By Error_ReccuringPayemtns = By.xpath("(//h3[.='Payment Preferences']/following-sibling::ion-row/ion-col[@size='24'])[2]");
	
//	@FindBy(xpath="//ion-checkbox[@role='checkbox']")
	private By Reccuring_CheckBox = By.xpath("//ion-checkbox[@role='checkbox']");
	
//	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @size-md='12'])[1]")
	private By Error_BillignFirstName = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @size-md='12'])[1]");
	
//	@FindBy(xpath="//ion-input[@formcontrolname='CardHolderFirstName']/input")
	private By BillingFirstName = By.xpath("//ion-input[@formcontrolname='CardHolderFirstName']/input");
	
//	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @size-md='12'])[2]")
	private By Error_BillignLastName = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @size-md='12'])[2]");
	
//	@FindBy(xpath="//ion-input[@formcontrolname='CardHolderLastName']/input")
	private By BillingLastName = By.xpath("//ion-input[@formcontrolname='CardHolderLastName']/input");
	
//	@FindBy(xpath="//ion-input[@formcontrolname='Zip']/input")
	private By billingZipCode = By.xpath("//ion-input[@formcontrolname='Zip']/input");
	
//	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[3]")
	private By Error_BillignStreetAddress = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[3]");
	
//	@FindBy(xpath="//ion-input[@formcontrolname='StreetAddress']/input")
	private By billingStreetAddress = By.xpath("//ion-input[@formcontrolname='StreetAddress']/input");
	
//	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[4]")
	private By Error_BillignCityAndRegion = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[4]");
	
//	@FindBy(xpath="//ion-input[@formcontrolname='City']/input")
	private By billingCityAndRegion = By.xpath("//ion-input[@formcontrolname='City']/input");
	
//	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[5]")
	private By Error_BillignState = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[5]");
	
//	@FindBy(xpath="//select[@formcontrolname='State']")
	private By billingState = By.xpath("//select[@formcontrolname='State']");
	
//	@FindBy(xpath="//option[.=' Arkansas']")
	private By StateSelection = By.xpath("//option[.=' Arkansas']");
	
//	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[6]")
	private By Error_BillignZipCode = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[6]");
	
//	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[7]")
	private By Error_BillignCountry = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[7]");
	
//	@FindBy(xpath="//select[@formcontrolname='Country']")
	private By billingCountry = By.xpath("//select[@formcontrolname='Country']");
	
//	@FindBy(xpath="//option[.=' COLOMBIA']")
	private By billingCountrySelection = By.xpath("//option[.=' COLOMBIA']");
	
//	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[8]")
	private By Error_BillignPhoneNumber = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[8]");
	
//	@FindBy(xpath="//ion-input[@formcontrolname='Phone']/input")
	private By BillingPhoneNumber = By.xpath("//ion-input[@formcontrolname='Phone']/input");
	
//	@FindBy(xpath="(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[9]")
	private By Error_BillignEmailAddress = By.xpath("(//h3[.='Billing Information']/following-sibling::ion-row/ion-col[@size='24' and @class='md hydrated'])[9]");
	
//	@FindBy(xpath="//ion-input[@formcontrolname='Email']/input")
	private By BillingEmailAddress = By.xpath("//ion-input[@formcontrolname='Email']/input");
	
//	@FindBy(xpath="//input[@name='cardNumber']")
	private By CardNumber = By.xpath("//input[@name='cardNumber']");
	
//	@FindBy(id="cardholderName")
	private By cardHolderName = By.id("cardholderName");
	
//	@FindBy(id="cardNumber-hint")
	private By Error_CardNumber = By.id("cardNumber-hint");
	
//	@FindBy(id="cardholderName-hint")
	private By Error_CardHoldername = By.id("cardholderName-hint");
	
//	@FindBy(id="expiryMonth")
	private By ExpiryMonth = By.id("expiryMonth");
	
//	@FindBy(id="expiryDate-hint")
	private By Error_ExpiryMonth = By.id("expiryDate-hint");
	
//	@FindBy(id="expiryYear")
	private By ExpiryYear = By.id("expiryYear");
	
//	@FindBy(id="expiryDate-hint")
	private By Error_ExpiryYear = By.id("expiryDate-hint");
	
//	@FindBy(id="securityCode")
	private By SecurityCode = By.id("securityCode");
	
//	@FindBy(id="securityCode-hint")
	private By Error_SecurityCode = By.id("securityCode-hint");
	
//	@FindBy(id="pin-helptxt")
	private By SecurityCode_PInHintVisa_Master = By.id("pin-helptxt");
	
//	@FindBy(id="submitButton")
	private By MakePayment = By.id("submitButton");
	
//	@FindBy(xpath="//input[@id='ReceiptEmail']")
	private By mail_Id = By.xpath("//input[@id='ReceiptEmail']");
 
//	@FindBy(xpath="//input[@name='sendReceipt']")
	private By send_btn = By.xpath("//input[@name='sendReceipt']");
 
//	@FindBy(id="login")
	private By email_field = By.id("login");
 
//	@FindBy(id="refreshbut")
	private By submit = By.id("refreshbut");
 
//	@FindBy(xpath="//span[.='<MarketingIntl@citizensinc.com>']")
	private By email_from =By.xpath("(//span[contains(text(),'Citizensinc.com')])");
 
//	@FindBy(xpath="//a[@title='Receipt.pdf']")
	private By reciept = By.xpath("//a[@title='Receipt.pdf']");
 
//	@FindBy(xpath="(//span[.='MarketingIntl@citizensinc.com'])")
	private By email_inbox = By.xpath("(//span[contains(text(),'Citizensinc.com')])");
 
//	@FindBy(xpath="return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-item').shadowRoot.querySelector('div>div>div>a')")
	private By open_file = By.id("open_file1");
 
	//--------------------------------------------------------------------------------------------
	//ACH Payment Method ---------NOT USING THIS PAYMENT METHOD
//	@FindBy(xpath="//ion-label[text()='ACH (Automated Clearing House) ']/following-sibling::ion-radio[@slot='start']")
	private By ACh = By.xpath("//ion-label[text()='ACH (Automated Clearing House) ']/following-sibling::ion-radio[@slot='start']");
//	@FindBy(xpath="(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[2]")
	private By Error_AccountType = By.xpath("(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[2]");
//	@FindBy(xpath="//select[@formcontrolname='AccountType']")
	private By AccountType = By.xpath("//select[@formcontrolname='AccountType']");
//	@FindBy(xpath="//option[.=' Checking ']")
	private By SavingType = By.xpath("//option[.=' Checking ']");
//	@FindBy(xpath="(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[3]")
	private By Error_AccountNumber = By.xpath("(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[3]");
//	@FindBy(xpath="//ion-input[@formcontrolname='AccountNumber']/input")
	private By AccountNumber = By.xpath("//ion-input[@formcontrolname='AccountNumber']/input");
//	@FindBy(xpath="//ion-input[@formcontrolname='RoutingNumber']/parent::ion-item/parent::ion-col")
	private By Error_RoutingNumber = By.xpath("//ion-input[@formcontrolname='RoutingNumber']/parent::ion-item/parent::ion-col");
//	@FindBy(xpath="//ion-input[@formcontrolname='RoutingNumber']/input")
	private By RountingNumber = By.xpath("//ion-input[@formcontrolname='RoutingNumber']/input");
	
	//-----------------------------------------------------------------------------------------------
//	private By recipientEmail = By.id("ReceiptEmail");
//	private By sendReceiptBtn = By.id("sendReceipt");
//	private By loginID = By.id("login");
//	private By refreshButton = By.id("refreshbut");

	public void Make_a_Payment() throws Exception {

		String Max_Name = "PaymentasdfgaedfsdfgwSEDFGASDFGBASDFGBASDFGASDFGBASDFGSADF1234sdfsghdsfghjdfgh2345";
		String max_name = "sadfgsadfgsadfghasfgasdfghsadfgasdfghsadfghsdafghjasdfgn";
		String Max_error_70 ="The maximum number of characters is 70";
		String Max_error_50 ="The maximum number of characters is 50";
		String Mandatory_Err = "Please enter a value.";
		String billing_FMax_Name = "qwertyuiopasdfghj";
		String billing_FMax_Name_Err = "The maximum number of characters is 15.";
		String billing_City_Max_Err = "The maximum number of characters is 40.";
		String billing_Zip_Format_Err = "Please use a number format.";
		String billing_Zip_Max_Char_Err = "The minimum number of characters is 5.";
		String billing_Ph_Format_Err = "Please use a number format.";
		String billing_Ph_Min_Char_Err = "The minimum number of characters is 10.";
		String billing_Ph_Max_Char_Err = "The maximum number of characters is 10.";
		String billing_Email_Format_Err = "Email is not in the correct format";
		String billing_Email_Max_Char_Err = "The maximum number of characters is 50.";
		String billing_Invalid_Card_Err = "Enter a valid card number";
		String billing_Card_Holder_Name_Err = "Enter a valid cardholder's name";
		String billing_Card_Month_Err = "Enter a valid month";
		String billing_Card_Year_Err = "Enter a valid year";
		String billing_Card_PastYear_Err = "Expiry date must be in the future";
		String billing_Card_SecuCode_Err = "Enter a valid security code";
		String billing_Pin_Hint = "Last 3 digits on the back of card";
		String billing_Pin_Hint_Front = "4 digits on the front of card";

//		MakePayment_Step_9.click();
		WebUI.clickElement(MakePayment_Step_9);
		WebUI.sleep(3);
		
//		WebElement nextButton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ion-button[normalize-space()='Next']")));
//		nextButton.click();
//		WebUI.clickElement(nextButton, 5);
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ion-content[contains(@class, ion-padding)])[6]"))).click();
//		WebUI.clickElement(By.xpath("(//ion-content[contains(@class, ion-padding)])[6]"));
//		WebUI.clickElement(wait_ion_padding,5);
		
//		WebElement	nxtBtn= driver.findElement(By.xpath("(//ion-col/ion-button[@size='small' and @color='primary'])[1]"));
//		act.scrollToElement(nxtBtn).build().perform();
//		WebUI.scrollToElementAtBottom(nxtBtn);
		
//		WebElement Disclaimeryes=driver.findElement(By.xpath("//ion-checkbox[@formcontrolname='disclaimerYes']"));
//		Disclaimeryes.click();
//		WebUI.clickElement(Disclaimeryes);
		
//		nxtBtn	.click();
//		WebUI.clickElement(nxtBtn);

//		WebElement Error_PolicyPayment_Relationship =driver.findElement(By.xpath("//ion-label[.=' Relationship']/parent::ion-item/following-sibling::div[.=' Please enter a value. ']"));
//		Assert.assertTrue(Error_PolicyPayment_Relationship.isDisplayed());
//		String LabelErrorPolicyPayment_RelationText=Error_PolicyPayment_Relationship.getText();
//		System.out.println("Relationship "+LabelErrorPolicyPayment_RelationText);
//		WebUI.verifyElementPresent(Error_PolicyPayment_Relationship);
		
//		WebElement ErrorMessage_PolicyPayment_PaymentType =driver.findElement(By.xpath("(//ion-col[@size='24' and @size-md='8' and @class='md hydrated'])[5]"));
//		Assert.assertTrue(ErrorMessage_PolicyPayment_PaymentType.isDisplayed());
//		String LabelError_PaymentTypeText=ErrorMessage_PolicyPayment_PaymentType.getText();
//		System.out.println("Payment Type "+LabelError_PaymentTypeText);
//		WebUI.verifyElementVisible(ErrorMessage_PolicyPayment_PaymentType,2);
		
//		WebElement	RelationShipDropDown= driver.findElement(By.xpath("//select[@formcontrolname='Relationship']"));
//		RelationShipDropDown.click(); //RelationShipDropDown
		WebUI.clickElement(RelationShipDropDown,2);
		
//		driver.findElement(By.xpath("//option[.='Parent ']")).click();
		WebUI.clickElement(RelationShip_Parent,2);
		
//		WebElement	PaymentType= driver.findElement(By.xpath("//select[@formcontrolname='PaymentType']"));
//		PaymentType.click();
		WebUI.clickElement(PaymentType,2);
		
//		driver.findElement(By.xpath("//option[.='Premium']")).click();
//		Thread.sleep(1000);
		WebUI.clickElement(PaymentType_premium);
		WebUI.sleep(1);
		
//		nextButton.click();
		WebUI.clickElement(nextButton);

		
		
//		WebElement	nxtBtn1= driver.findElement(By.xpath("(//ion-col/ion-button[@size='small' and @color='primary'])[1]"));
//		act.scrollToElement(nxtBtn1).build().perform();
		WebUI.scrollToElementAtBottom(nxtBtn);
		WebUI.sleep(1);
		
//		WebElement Disclaimeryes1	=driver.findElement(By.xpath("//ion-checkbox[@formcontrolname='disclaimerYes']"));
//		Disclaimeryes1.click();
		WebUI.clickElement(Disclaimeryes);
		WebUI.sleep(1);
//		nxtBtn1.click();
		WebUI.clickElement(nxtBtn);
		WebUI.sleep(3);


//		C.scrollTo(driver, NextBtn_BillingPage);
		WebUI.scrollToElementAtBottom(NextBtn_BillingPage);
		WebUI.sleep(1);
//		NextBtn_BillingPage.click();
		WebUI.clickElement(NextBtn_BillingPage);
		WebUI.sleep(1);

//		C.Sc_Empty_Input(driver, act, Error_FormOfPayment, Mandatory_Err, e, Test.Case10(22), Test.Exp10(22));
		WebUI.scrollToElementAtBottom(Error_FormOfPayment);
		WebUI.verifyElementVisible(Error_FormOfPayment, 2);
		WebUI.verifyContains(getTextElement(Error_FormOfPayment).trim(), Mandatory_Err);
		
//		C.Mandate_Click(driver, CreditCard, e,Test.Case10(23), Test.Exp10(23));
		
//		WebElement ACh =driver.findElement(By.xpath("//ion-label[text()='ACH (Automated Clearing House) ']/following-sibling::ion-radio[@slot='start']"));
//		ACh.click();
		WebUI.clickElement(ACh);
		WebUI.sleep(1);

		

//		WebElement Error_AcountType =driver.findElement(By.xpath("(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[2]"));
//		act.scrollToElement(Error_AcountType).build().perform();
		WebUI.scrollToElementAtBottom(Error_AccountType);
		WebUI.sleep(0.5);
		
//		Assert.assertTrue(Error_AcountType.isDisplayed());
		WebUI.isElementVisible(Error_AccountType,5);
		
//		WebElement AcountType =driver.findElement(By.xpath("//select[@formcontrolname='AccountType']"));
//		AcountType.click();
		WebUI.verifyElementClickable(AccountType);
		WebUI.clickElement(AccountType);
		
//		WebElement SavingType =driver.findElement(By.xpath("//option[.=' Checking ']"));
//		SavingType.click();
		WebUI.clickElement(SavingType);
		
//		WebElement Error_AcountNumber =driver.findElement(By.xpath("(//ion-row[@class='md hydrated']/ion-col[@size='24' and @size-md='12' and @class='md hydrated'])[3]"));
//		act.scrollToElement(Error_AcountNumber).build().perform();
//		Assert.assertTrue(Error_AcountNumber.isDisplayed());
		WebUI.scrollToElementAtBottom(Error_AccountNumber);
		WebUI.verifyElementVisible(Error_AccountNumber);
		WebUI.sleep(1);
		
		
//		WebElement AcountNumber =driver.findElement(By.xpath("//ion-input[@formcontrolname='AccountNumber']/input"));
//		AcountNumber.sendKeys("asdfgdfgh");
//		Assert.assertTrue(Error_AcountNumber.isDisplayed());
		WebUI.setText(AccountNumber, "qwertyuiop");
		WebUI.verifyElementVisible(Error_AccountNumber);
		
		
//		AcountNumber.clear();
//		Thread.sleep(1000);
		WebUI.clearText(AccountNumber);
		WebUI.sleep(0.5);
//		AcountNumber.sendKeys("4099999992");
		WebUI.setText(AccountNumber, "4099999992");
		
//		WebElement Error_RoutingNumber =driver.findElement(By.xpath("//ion-input[@formcontrolname='RoutingNumber']/parent::ion-item/parent::ion-col"));
////		act.scrollToElement(Error_AcountNumber).build().perform();
//		Assert.assertTrue(Error_RoutingNumber.isDisplayed());
		WebUI.verifyElementVisible(Error_RoutingNumber);
		
//		String LabelError_RoutingNumber=Error_RoutingNumber.getText();
//		System.out.println(LabelError_RoutingNumber);
		
//		WebElement RountingNumber =driver.findElement(By.xpath("//ion-input[@formcontrolname='RoutingNumber']/input"));
//		RountingNumber.sendKeys("asdfgdfgh");
//		Assert.assertTrue(Error_RoutingNumber.isDisplayed());
		WebUI.clearAndFillText(RountingNumber, "asdfgdfgh");
		WebUI.sleep(0.5);
		WebUI.verifyElementVisible(Error_RoutingNumber);
		WebUI.sleep(0.5);
		
//		String LabelError_CorrectFormatRoutingNumber=Error_RoutingNumber.getText();
//		System.out.println(LabelError_CorrectFormatRoutingNumber);
//		Thread.sleep(1000);
//		RountingNumber.clear();
//		RountingNumber.sendKeys("1254718");
		WebUI.clearAndFillText(RountingNumber, "1254718");
		WebUI.sleep(0.5);
//		Assert.assertTrue(Error_RoutingNumber.isDisplayed());
		WebUI.verifyElementVisible(Error_RoutingNumber);
//		String LabelError_MinimumRoutingNumber=Error_RoutingNumber.getText();
//		System.out.println(LabelError_MinimumRoutingNumber);
//		Thread.sleep(1000);
		WebUI.sleep(0.5);
//		RountingNumber.clear();
//		RountingNumber.sendKeys("1254718215");
		WebUI.clearAndFillText(RountingNumber, "1254718215");
		WebUI.sleep(0.5);
//		Assert.assertTrue(Error_RoutingNumber.isDisplayed());
		WebUI.verifyElementVisible(Error_RoutingNumber);
		
//		String LabelError_MaximumRoutingNumber=Error_RoutingNumber.getText();
//		System.out.println(LabelError_MaximumRoutingNumber);
//		Thread.sleep(1000);
		WebUI.sleep(0.5);
//		RountingNumber.clear();
//		RountingNumber.sendKeys("011075150");
		WebUI.clearAndFillText(RountingNumber, "011075150");
		WebUI.sleep(0.5);
//===============================================================================================================
		

//		C.Sc_Empty_Input(driver, act, Error_ReccuringPayemtns, Mandatory_Err, e, Test.Case10(29), Test.Exp10(29));
		WebUI.scrollToElementAtBottom(Error_ReccuringPayemtns);
		WebUI.verifyElementVisible(Error_ReccuringPayemtns, 2);
		WebUI.verifyContains(getTextElement(Error_ReccuringPayemtns).trim(), Mandatory_Err);

		
		//Reccuring_CheckBox.click();
		
//		Thread.sleep(1500);
		WebUI.sleep(2);
		
//		C.Mandate_Click(driver, Reccuring_CheckBox, e,Test.Case10(27), Test.Exp10(27));
		WebUI.clickElement(Reccuring_CheckBox,2);

//		C.Sc_Empty_Input(driver, act, Error_BillignFirstName, Mandatory_Err, e, Test.Case10(33), Test.Exp10(33));
//		WebUI.scrollToElementAtBottom(Error_BillignFirstName);
//		WebUI.verifyElementVisible(Error_BillignFirstName, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignFirstName).trim(), Mandatory_Err);

		
//		C.Max_Char_Act(driver, act, BillingFirstName, Error_BillignFirstName, "dsfdsafgdsafgdsfg",
//				"The maximum number of characters is 15.", e,  Test.Case10(32), Test.Exp10(32));
//		WebUI.clearAndFillText(BillingFirstName, billing_FMax_Name);
//		WebUI.sleep(1);
//		WebUI.moveToElement(Error_BillignFirstName);
//		WebUI.verifyElementVisible(Error_BillignFirstName, 1);
//		WebUI.verifyContains(getTextElement(Error_BillignFirstName).trim(), billing_FMax_Name_Err);

			
//		C.Send_verify_Valid_C(driver, BillingFirstName, e, "Testing Payment", Test.Case10(31), Test.Exp10(31));
//		WebUI.clearAndFillText(BillingFirstName, PropertiesHelpers.getValue("billing_FName"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BillingFirstName, "value"), PropertiesHelpers.getValue("billing_FName"));
		String RandomBillingFirstName = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillText(BillingFirstName,RandomBillingFirstName);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BillingFirstName,"value"),RandomBillingFirstName);
		
//		C.Sc_Empty_Input(driver, act, Error_BillignLastName, Mandatory_Err, e, Test.Case10(36), Test.Exp10(36));
//		WebUI.scrollToElementAtBottom(Error_BillignLastName);
//		WebUI.verifyElementVisible(Error_BillignLastName, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignLastName).trim(), Mandatory_Err);

//		C.Max_Char_sc2(driver,act,BillingLastName,billingZipCode,Error_BillignLastName,Max_Name, Max_error_70, e,Test.Case10(35),Test.Exp10(35));
//		WebUI.clearAndFillText(BillingLastName, Max_Name);
//		WebUI.sleep(1);
//		WebUI.moveToElement(billingZipCode);
//		WebUI.verifyElementVisible(billingZipCode,2);
//		WebUI.moveToElement(Error_BillignLastName);
//		WebUI.verifyContains(getTextElement(Error_BillignLastName).trim(), Max_error_70);
//		WebUI.sleep(1);
		
//		C.Send_verify_Valid_C(driver, BillingLastName, e, "Testing Payment lastname", Test.Case10(34), Test.Exp10(34));
//		WebUI.clearAndFillText(BillingLastName, PropertiesHelpers.getValue("billing_LName"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BillingLastName, "value"), PropertiesHelpers.getValue("billing_LName"));
		String RandomBillingLastName = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillText(BillingLastName,RandomBillingLastName);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BillingLastName,"value"),RandomBillingLastName);
		
//		C.Sc_Empty_Input(driver, act, Error_BillignStreetAddress, Mandatory_Err, e, Test.Case10(39), Test.Exp10(39));
//		WebUI.scrollToElementAtBottom(Error_BillignStreetAddress);
//		WebUI.verifyElementVisible(Error_BillignStreetAddress, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignStreetAddress).trim(), Mandatory_Err);

		
//		C.Max_Char(driver,billingStreetAddress,Error_BillignStreetAddress,max_name,Max_error_50,e,Test.Case10(38),Test.Exp10(38));
//		WebUI.clearText(billingStreetAddress);
//		WebUI.setText(billingStreetAddress, max_name);
//		WebUI.verifyElementVisible(Error_BillignStreetAddress);
//		WebUI.verifyContains(getTextElement(Error_BillignStreetAddress).trim(), Max_error_50);

		
//		C.Send_verify_Valid_C(driver, billingStreetAddress, e, "Austin, texas USA", Test.Case10(37), Test.Exp10(37));
//		WebUI.clearAndFillText(billingStreetAddress, PropertiesHelpers.getValue("billing_Address"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(billingStreetAddress, "value"), PropertiesHelpers.getValue("billing_Address"));
		String RandomBillingAddress = "203 S. Leslie,Stuttgart";
		WebUI.clearAndFillText(billingStreetAddress,RandomBillingAddress);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(billingStreetAddress,"value"),RandomBillingAddress);
		
//		C.Sc_Empty_Input(driver, act, Error_BillignCityAndRegion,Mandatory_Err, e, Test.Case10(42), Test.Exp10(42));
//		WebUI.scrollToElementAtBottom(Error_BillignCityAndRegion);
//		WebUI.verifyElementVisible(Error_BillignCityAndRegion, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignCityAndRegion).trim(), Mandatory_Err);

	
//		C.Max_Char(driver,billingCityAndRegion,Error_BillignCityAndRegion,max_name,"The maximum number of characters is 40.",
//				e,Test.Case10(41),Test.Exp10(41));
//			Thread.sleep(2000);
//		WebUI.clearText(billingCityAndRegion);
//		WebUI.setText(billingCityAndRegion, max_name);
//		WebUI.verifyElementVisible(Error_BillignCityAndRegion);
//		WebUI.verifyContains(getTextElement(Error_BillignCityAndRegion).trim(), billing_City_Max_Err);
//		WebUI.sleep(2);
		
//		C.Send_verify_Valid_C(driver, billingCityAndRegion, e, "Dallas", Test.Case10(40), Test.Exp10(40));
//		WebUI.clearAndFillText(billingCityAndRegion, PropertiesHelpers.getValue("billing_City"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(billingCityAndRegion, "value"), PropertiesHelpers.getValue("billing_City"));
		String RandomBillingCity = DataGenerateUtils.randomCity();
		WebUI.clearAndFillText(billingCityAndRegion,RandomBillingCity);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(billingCityAndRegion,"value"),RandomBillingCity);
		
//		C.Sc_Empty_Input(driver, act, Error_BillignState,Mandatory_Err, e, Test.Case10(46), Test.Exp10(46));
//		WebUI.scrollToElementAtBottom(Error_BillignState);
//		WebUI.verifyElementVisible(Error_BillignState, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignState).trim(), Mandatory_Err);
	
//		C.C2(driver, billingState, StateSelection, e, Test.Case10(44), Test.Exp10(44));
		WebUI.verifyElementClickable(billingState);
		WebUI.clickElement(billingState);
		WebUI.sleep(1);
		WebUI.clickElement(StateSelection);

//		C.Sc_Empty_Input(driver,act, Error_BillignZipCode, Mandatory_Err, e,Test.Case10(126), Test.Exp10(126));
//		WebUI.scrollToElementAtBottom(Error_BillignZipCode);
//		WebUI.verifyElementVisible(Error_BillignZipCode, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignZipCode).trim(), Mandatory_Err);

//		C.Max_Char_Act(driver, act, billingZipCode, Error_BillignZipCode, "asdfasd","Please use a number format.", e,  Test.Case10(48), Test.Exp10(48));
//		WebUI.clearAndFillText(billingZipCode, "asdfasd");
//		WebUI.sleep(1);
//		WebUI.moveToElement(Error_BillignZipCode);
//		WebUI.verifyElementVisible(Error_BillignZipCode, 1);
//		WebUI.verifyContains(getTextElement(Error_BillignZipCode).trim(), billing_Zip_Format_Err);
		
//		C.Max_Char(driver,billingZipCode,Error_BillignZipCode,"1234","The minimum number of characters is 5.",e,Test.Case10(49),Test.Exp10(49));
//		WebUI.clearText(billingZipCode);
//		WebUI.setText(billingZipCode, "1234");
//		WebUI.verifyElementVisible(Error_BillignZipCode);
//		WebUI.verifyContains(getTextElement(Error_BillignZipCode).trim(), billing_Zip_Max_Char_Err);
//		WebUI.sleep(1);
	
//		C.Max_Char(driver,billingZipCode,Error_BillignZipCode,"5478415114155211","The maximum number of characters is 5.",
//				e,Test.Case10(50),Test.Exp10(50));
//		Thread.sleep(1000);
//		WebUI.clearText(billingZipCode);
//		WebUI.setText(billingZipCode, "5478415114155211");
//		WebUI.verifyElementVisible(Error_BillignZipCode);
//		WebUI.verifyContains(getTextElement(Error_BillignZipCode).trim(), billing_Zip_Max_Char_Err);
//		WebUI.sleep(1);

//		C.Send_verify_Valid_C(driver, billingZipCode, e, "67801", Test.Case10(1), Test.Exp10(1));
//		WebUI.clearAndFillText(billingZipCode, PropertiesHelpers.getValue("billing_Zip"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(billingZipCode, "value"), PropertiesHelpers.getValue("billing_Zip"));
		String RandomBillingZipcode = DataGenerateUtils.randomZipCode();
		WebUI.clearAndFillText(billingZipCode,RandomBillingZipcode);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(billingZipCode,"value"),RandomBillingZipcode);

//		C.Sc_Empty_Input(driver,act, Error_BillignCountry, "Please choose a Country", e,Test.Case10(54), Test.Exp10(54));
//		WebUI.scrollToElementAtBottom(Error_BillignCountry);
//		WebUI.verifyElementVisible(Error_BillignCountry, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignCountry).trim(), Mandatory_Err);

//		C.C2(driver, billingCountry, billingCountrySelection, e, Test.Case10(53), Test.Exp10(53));
//		WebUI.verifyElementClickable(billingCountry,2);
//		WebUI.clickElement(billingCountry);
//		WebUI.sleep(1);
//		WebUI.clickElement(billingCountrySelection);

//		C.act_scroll1(driver, act, NextBtn_BillingPage, e, Test.Case10(127), Test.Exp10(127));
		WebUI.scrollToElementAtBottom(NextBtn_BillingPage);
		WebUI.verifyElementVisible(NextBtn_BillingPage);

//		C.Sc_Empty_Input(driver,act, Error_BillignPhoneNumber, Mandatory_Err, e,Test.Case10(128), Test.Exp10(128));
//		WebUI.scrollToElementAtBottom(Error_BillignPhoneNumber);
//		WebUI.verifyElementVisible(Error_BillignPhoneNumber, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignPhoneNumber).trim(), Mandatory_Err);

//		C.Max_Char(driver,BillingPhoneNumber,Error_BillignPhoneNumber,"sadfasdd","Please use a number format.",e,Test.Case10(57),Test.Exp10(57));
//		WebUI.clearText(BillingPhoneNumber);
//		WebUI.setText(BillingPhoneNumber, "sadfasdd");
//		WebUI.verifyElementVisible(Error_BillignPhoneNumber);
//		WebUI.verifyContains(getTextElement(Error_BillignPhoneNumber).trim(), billing_Ph_Format_Err);
//		WebUI.sleep(1);
		
//		C.Max_Char(driver,BillingPhoneNumber,Error_BillignPhoneNumber,"1254812","The minimum number of characters is 10.",
//				e,Test.Case10(129),Test.Exp10(129));
//		WebUI.clearText(BillingPhoneNumber);
//		WebUI.setText(BillingPhoneNumber, "1254812");
//		WebUI.verifyElementVisible(Error_BillignPhoneNumber);
//		WebUI.verifyContains(getTextElement(Error_BillignPhoneNumber).trim(), billing_Ph_Min_Char_Err);
//		WebUI.sleep(1);
	
//		C.Max_Char(driver,BillingPhoneNumber,Error_BillignPhoneNumber,"125481212512","The maximum number of characters is 10.",
//				e,Test.Case10(58),Test.Exp10(58));
//		WebUI.clearText(BillingPhoneNumber);
//		WebUI.setText(BillingPhoneNumber, "125481212512");
//		WebUI.verifyElementVisible(Error_BillignPhoneNumber);
//		WebUI.verifyContains(getTextElement(Error_BillignPhoneNumber).trim(), billing_Ph_Max_Char_Err);
//		WebUI.sleep(1);
		
//		C.Send_verify_Valid_C(driver, BillingPhoneNumber, e, "1254812123", Test.Case10(56), Test.Exp10(56));
//		WebUI.clearAndFillText(BillingPhoneNumber, PropertiesHelpers.getValue("billing_Phone"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BillingPhoneNumber, "value"), PropertiesHelpers.getValue("billing_Phone"));
		String RandomBillingPhone = DataGenerateUtils.randomPhoneNumber();
		WebUI.clearAndFillText(BillingPhoneNumber,RandomBillingPhone);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BillingPhoneNumber,"value"),RandomBillingPhone);
		
//		C.Sc_Empty_Input(driver,act, Error_BillignEmailAddress, Mandatory_Err, e,Test.Case10(62), Test.Exp10(62));
//		WebUI.scrollToElementAtBottom(Error_BillignEmailAddress);
//		WebUI.verifyElementVisible(Error_BillignEmailAddress, 2);
//		WebUI.verifyContains(getTextElement(Error_BillignEmailAddress).trim(), Mandatory_Err);

//		C.Max_Char(driver,BillingEmailAddress,Error_BillignEmailAddress,"asas","Email is not in the correct format",
//				e,Test.Case10(61),Test.Exp10(61)); billing_Email_Format_Err
//		WebUI.clearText(BillingEmailAddress);
//		WebUI.setText(BillingEmailAddress, "asas");
//		WebUI.verifyElementVisible(Error_BillignEmailAddress);
//		WebUI.verifyContains(getTextElement(Error_BillignEmailAddress).trim(), billing_Email_Format_Err);
//		WebUI.sleep(1);

//		C.Max_Char(driver,BillingEmailAddress,Error_BillignEmailAddress,"sdasdfgasdfaSdfgasdfbsDfgasdfgnasdfgsdfgsdzfghdfsgdhfjgfdg",
//				"The maximum number of characters is 50.",e,Test.Case10(63),Test.Exp10(63));
//		WebUI.clearText(BillingEmailAddress);
//		WebUI.setText(BillingEmailAddress, max_name);
//		WebUI.verifyElementVisible(Error_BillignEmailAddress);
//		WebUI.verifyContains(getTextElement(Error_BillignEmailAddress).trim(), billing_Email_Max_Char_Err);
//		WebUI.sleep(1);

//		C.Send_verify_Valid_C(driver, BillingEmailAddress, e, "none@none.com", Test.Case10(60), Test.Exp10(60)); //billing_Email
//		WebUI.clearAndFillText(BillingEmailAddress, PropertiesHelpers.getValue("billing_Email"));
//		WebUI.sleep(1);
//		WebUI.verifyContains(getAttributeElement(BillingEmailAddress, "value"), PropertiesHelpers.getValue("billing_Email"));
		String RandomBillingEmail = DataGenerateUtils.randomEmail();
		WebUI.clearAndFillText(BillingEmailAddress,RandomBillingEmail);
		WebUI.sleep(1);
		WebUI.verifyContains(getAttributeElement(BillingEmailAddress,"value"),RandomBillingEmail);
		
//		C.Scroll_Click(driver, wait, act, NextBtn_BillingPage, e, Test.Case10(66), Test.Exp10(66));
		WebUI.scrollToElementAtBottom(NextBtn_BillingPage);
		WebUI.sleep(1);
		WebUI.waitForElementVisible(NextBtn_BillingPage,2);
		WebUI.sleep(1);
		WebUI.clickElement(NextBtn_BillingPage);
		WebUI.sleep(3);


//		driver.switchTo().parentFrame();
//		Thread.sleep(2000);
//		WebUI.switchToParentFrame();
		WebUI.switchToFrameByIdOrName("i-frame");
		WebUI.sleep(2);
		
//		driver.findElement(By.id("ReceiptEmail")).sendKeys("cicalife_001@yopmail.com");
//		Thread.sleep(1000);
		
		WebUI.clickElement(mail_Id);
		WebUI.setText(mail_Id, PropertiesHelpers.getValue("recipient_Email"));
		
//		WebUI.sendKeysWithJavaScript(mail_Id, PropertiesHelpers.getValue("recipient_Email"));
		
		WebUI.sleep(1);
		
//		driver.findElement(By.id("sendReceipt")).click();
//		Thread.sleep(2000);
		WebUI.clickElement(send_btn,2);
		WebUI.sleep(3);
		
		
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(1000);
		WebUI.dismissAlert();
		WebUI.sleep(2);
		
//		driver.switchTo().newWindow(WindowType.TAB);	
		WebUI.openNewTab();
		WebUI.sleep(2);
		
//		driver.get("https://yopmail.com/");
		WebUI.openWebsite(PropertiesHelpers.getValue("email_URL"));
		WebUI.waitForPageLoaded(10);
		
		
//		driver.findElement(By.id("login")).sendKeys("cicalife_001@yopmail.com");
		WebUI.setText(email_field, PropertiesHelpers.getValue("recipient_Email"));
		
//		driver.findElement(By.id("refreshbut")).click();
		WebUI.clickElement(submit);
		
//		driver.switchTo().frame("ifmail");
		WebUI.switchToFrameByIdOrName("ifmail");
		
//		WebElement email_from = driver.findElement(By.xpath("//span[.='<MarketingIntl@citizensinc.com>']"));

		
		if(WebUI.isElementVisible(email_from, 3))
		{
			WebUI.clickElement(reciept);
		}
		else
		{
			WebUI.switchToDefaultContent();
			WebUI.switchToFrameByIdOrName("ifinbox");
			WebUI.sleep(2);
			WebUI.clickElement(email_inbox);
			WebUI.sleep(3);
			WebUI.switchToDefaultContent();
			WebUI.switchToFrameByIdOrName("ifmail");
			WebUI.sleep(1);
			WebUI.clickElement(reciept);
		}
		
//		Thread.sleep(3000);
		WebUI.sleep(3);
		
//		driver.switchTo().newWindow(WindowType.TAB);
		WebUI.openNewTab();
		
//		driver.get("chrome://downloads/");
		WebUI.openWebsite("edge://downloads/");
		WebUI.sleep(2);
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		
//		WebElement open_file = (WebElement) js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-item').shadowRoot.querySelector('div>div>div>a')");
		WebUI.sleep(1);
//		open_file.click();
		WebUI.clickElement(open_file);
		WebUI.sleep(4);
		
		
	
	}

}
