package com.codetru.project.cica.pages;

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
import com.codetru.utils.DataFakerUtils;
import com.codetru.utils.DataGenerateUtils;


public class Step_1Page extends CommonPageCICA{


	private By page_Error = By.xpath("//p[.='There are some errors on this page. Please correct before continuing.']");

	private By FirstName = By.xpath("//ion-input[@formcontrolname='ProposedFirstName']/input");

	private By Error_Message_FirstName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[1]");

	private By MiddleName = By.xpath("//ion-input[@formcontrolname='ProposedMiddleName']/input");

	private By Error_Message_MiddleName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[2]");

	private By LastName = By.xpath("//ion-input[@formcontrolname='ProposedLastName']/input");

	private By Error_Message_LastName = By.xpath("(//ion-col[@size='24' and @size-md='8'])[3]");

	private By StateDropdown = By.xpath("//select[@formcontrolname='ProposedPhysicalState']");

	private By Error_Message_State = By.xpath("(//ion-col[@size='24' and @size-md='4'])[1]");

	private By state = By.xpath("(//option[.=' Louisiana'])[1]");

	private By genderDropdown = By.xpath("//select[@formcontrolname='ProposedGender']");

	private By gender = By.xpath("//option[.='Male']");

	private By Error_Message_Gender = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[1]");

	private By DateOfBirth = By.xpath("//input[@formcontrolname='ProposedBirthDate']");

	private By age = By.xpath("//ion-input[@formcontrolname='ProposedAge']");

	private By Error_Message_DateOfBirth = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[2]");

	private By Error_Message_ApplicantLocation = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and @class='md hydrated'])[4]");

	private By signedStateDropdown = By.xpath("//select[@formcontrolname='SignedState']");
	private By SignedState = By.xpath("(//option[.=' Louisiana'])[2]");
	private By preferredlanguage = By.xpath("//select[@formcontrolname='ProposedPreferredLanguage']");
	private By language = By.xpath("//option[.=' English']");
	private By Call_Yes = By.xpath("(//ion-label[.='Yes'])[1]");
	private By Call_No = By.xpath("(//ion-label[.='No'])[1]");
	private By Error_Message_Language = By.xpath("(//ion-col[@size='24' and @size-md='4' and @class='md hydrated']/following-sibling::ion-col[@size='24' and"
			+ " @class='md hydrated'])[5]");
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
	private By Nextstep_1 = By.xpath("(//ion-col/ion-button[starts-with(@class, 'md button')])[5]");
	private By premiumType = By.xpath("//ion-label[text()='Monthly']/following-sibling::ion-radio");
	private By loanRadioBtn = By.xpath("(//ion-label[text()='Yes']/following-sibling::ion-radio)[2]");
	private By calculate = By.xpath("(//div/ion-row/ion-col/ion-button[starts-with(@class, md)])[2]");
	private By step_2 = By.xpath("//span[normalize-space()='Step 2: Proposed Insured Information']");
	
	private By insuredInfoElement = By.xpath("//h3[.='Proposed Insured Info']");
	
	public static String Randomfirstname;

	public void Product_Information(String statex) throws Exception {

		String Mandate_Error = "Please enter a value.";
		String Max_Error = "The maximum number of characters is 33.";
		String Max_Char = "qwertyuiopqwertyuiopqwertyuiopqwertyu";
		String Page_Error_ = "There are some errors on this page. Please correct before continuing.";
		String Fc_MxErr = "The maximum amount is 30000.";
		String Fc_MnErr = "The minimum amount is 1000.";


		WebUI.sleep(1);
		WebUI.scrollToElementAtTop(insuredInfoElement);
		
		Randomfirstname = DataGenerateUtils.randomFirstName();
		WebUI.clearAndFillTextSound(FirstName,Randomfirstname);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(FirstName,"value"),Randomfirstname);
				

		String Randommiddlename = DataGenerateUtils.randomMiddleName();
		WebUI.clearAndFillTextSound(MiddleName,Randommiddlename);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(MiddleName,"value"),Randommiddlename);
		
		WebUI.clearText(LastName);
		String Randomlastname = DataGenerateUtils.randomLastName();
		WebUI.clearAndFillTextSound(LastName,Randomlastname);
		WebUI.sleep(0.5);
		WebUI.verifyContains(getAttributeElement(LastName,"value"),Randomlastname);

		WebUI.verifyElementClickable(StateDropdown);
		WebUI.clickElement(StateDropdown);
		WebUI.clickElementsWithJs(StateDropdown);	
		WebUI.sleep(1);
		WebUI.clickElement(state);
		WebUI.clickElementsWithJs(state);	
		
		WebUI.verifyContains(getAttributeElement(StateDropdown,"value"), getAttributeElement(StateDropdown,"value"));

		WebUI.selectOptionByText(genderDropdown, PropertiesHelpers.getValue("gender"));

		WebUI.setText(DateOfBirth, PropertiesHelpers.getValue("date_Of_Birth"));
		
		WebUI.verifyElementClickable(signedStateDropdown);
		WebUI.clickElement(signedStateDropdown);
		WebUI.clickElementsWithJs(signedStateDropdown);
		WebUI.sleep(1);
		
		WebUI.setText(signedStateDropdown, statex);

		WebUI.verifyElementClickable(preferredlanguage);
		WebUI.clickElement(preferredlanguage);
		WebUI.clickElementsWithJs(preferredlanguage);
		WebUI.sleep(1);
		WebUI.clickElement(language);
		
		WebUI.clickElementsWithJs(language);
		WebUI.scrollToElementAtBottom(calculate);
		WebUI.verifyElementVisible(calculate);

		WebUI.verifyElementClickable(plan);
		WebUI.clickElement(plan);
		WebUI.sleep(1);
		WebUI.clickElement(selectPlan_CICA);
		WebUI.clickElementsWithJs(calculate);

		WebUI.clearText(FaceAmount);
		WebUI.sleep(1);
		int fAmountGenerated = DataGenerateUtils.random4DigitNumberLessThan30000();
		WebUI.clearAndFillTextSound(FaceAmount,String.valueOf(fAmountGenerated));
		WebUI.sleep(1);
		System.out.println(fAmountGenerated);
		WebUI.verifyContains(getAttributeElement(FaceAmount,"value"),String.valueOf(fAmountGenerated));

		WebUI.verifyElementClickable(Annually);
		WebUI.clickElement(Annually);
		
		WebUI.verifyElementClickable(Semi_Annually);
		WebUI.clickElement(Semi_Annually);
		
		WebUI.verifyElementClickable(Quarterly);
		WebUI.clickElement(Quarterly);
		
		WebUI.verifyElementClickable(Monthly);
		WebUI.clickElement(Monthly);
		
		WebUI.verifyElementClickable(Yes);
		WebUI.clickElement(Yes);
		WebUI.verifyElementClickable(No);
		WebUI.clickElement(No);
		WebUI.clickElement(calculate);
		
		WebUI.moveToElement(Nextstep_1);
		WebUI.clickElement(Nextstep_1);
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(step_2);
	}
}



