package com.codetru.project.cicahealth.pages;

import static com.codetru.keywords.WebUI.getTextElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codetru.keywords.WebUI;
import com.codetru.project.cicahealth.CommonPageHealthCICA;
import com.codetru.utils.DataFakerUtils;
import com.codetru.utils.DataGenerateUtils;

public class Step_5HealthPage extends CommonPageHealthCICA {

	private By NextStep5 = By.xpath("(//ion-col[@size='24' and @size-md='6' and @class='md hydrated']/ion-button)[5]");
	private By Error_HealthQuestions_1 = By.xpath("(//div//h3[contains(text(),'Predetermination')]/following-sibling::ion-row)[1]");
	private By Error_HealthQuestions_2 = By.xpath("(//div//h3[contains(text(),'Predetermination')]/following-sibling::ion-row)[2]");
	private By Error_HealthQuestions_3 = By.xpath("(//div//h3[contains(text(),'Predetermination')]/following-sibling::ion-row)[3]");
	private By Error_HealthQuestions_4 = By.xpath("(//div//h3[contains(text(),'Predetermination')]/following-sibling::ion-row)[4]");
	private By Error_HealthQuestions_5 = By.xpath("(//div//h3[contains(text(),'Predetermination')]/following-sibling::ion-row)[5]");
	private By Error_HealthQuestions_A = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[1]");
	private By Error_HealthQuestions_B = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[2]");
	private By Error_HealthQuestions_C = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[3]");
	private By Error_HealthQuestions_D = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[4]");
	private By Error_HealthQuestions_E = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[5]");

	private By Error_HealthQuestions_F = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[6]");

	private By Error_HealthQuestions_G = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[7]");

	private By Error_HealthQuestions_H = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[8]");

	private By Error_HealthQuestions_I = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[9]");

	private By Error_HealthQuestions_J = By.xpath("(//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated'])[10]");
//	private By Error_HealthQuestions_6 = By.xpath("(//div//h3[contains(text(),'Predetermination')]/following-sibling::ion-row)[6]");

	private By Error_HealthQuestions_6_1 = By.xpath("((//div[@class='block-info-inner'])[2]/div/ion-row/ion-col)[1]");
	private By Error_HealthQuestions_6_2 = By.xpath("((//div[@class='block-info-inner'])[2]/div/ion-row/ion-col)[2]");
	private By Error_HealthQuestions_6_3 = By.xpath("((//div[@class='block-info-inner'])[2]/div/ion-row/ion-col)[3]");

	private By HealthQuestions1 = By.xpath("(//ion-radio[@slot='start' and @value='false'])[5]");

	private By HealthQuestions2 = By.xpath("(//ion-radio[@slot='start' and @value='false'])[6]");

	private By HealthQuestions3 = By.xpath("(//ion-radio[@slot='start' and @value='false'])[7]");

	private By HealthQuestions_A = By.xpath("(//ion-radio[@slot='start' and @value='false'])[8]");

	private By HealthQuestions_B = By.xpath("(//ion-radio[@slot='start' and @value='false'])[9]");

	private By HealthQuestions_C = By.xpath("(//ion-radio[@slot='start' and @value='false'])[10]");

	private By HealthQuestions_D = By.xpath("(//ion-radio[@slot='start' and @value='false'])[11]");

	private By HealthQuestions_E = By.xpath("(//ion-radio[@slot='start' and @value='false'])[12]");
	
	private By HealthQuestions_F = By.xpath("(//ion-radio[@slot='start' and @value='false'])[13]");
	
	private By HealthQuestions_G = By.xpath("(//ion-radio[@slot='start' and @value='false'])[14]");
	
	private By HealthQuestions_H = By.xpath("(//ion-radio[@slot='start' and @value='false'])[15]");
	
	private By HealthQuestions_I = By.xpath("(//ion-radio[@slot='start' and @value='false'])[16]");
	
	private By HealthQuestions_J = By.xpath("(//ion-radio[@slot='start' and @value='false'])[17]");
	
	private By HealthQuestions_4 = By.xpath("(//ion-radio[@slot='start' and @value='false'])[18]");
	
	private By HealthQuestions_5 = By.xpath("(//ion-radio[@slot='start' and @value='false'])[19]");
	
	private By HealthQuestions_6_1 = By.xpath("//ion-input[@formcontrolname='StatementOfHealthQ7Heightf']/input");
	
	private By HealthQuestions_6_2 = By.xpath("//ion-input[@formcontrolname='StatementOfHealthQ7Heighti']/input");
	private By HealthQuestions_6_3 = By.xpath("//ion-input[@formcontrolname='StatementOfHealthQ7Weight']/input");

	private By no_physician = By.xpath("//ion-checkbox[@formcontrolname='PhysicianNameCheckbox']");

	private By Error_NoPhysicanCheckBox = By.xpath("//ion-input[@formcontrolname='PhysicianName']/parent::ion-item/parent::ion-col");

	private By NextStep6 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]");

	private By Physician_textbox = By.xpath("//ion-input[@formcontrolname='PhysicianName']");

	public void Predetermination_Questions() throws Exception {

		String Mandatory_Err = "Value Required";
		String Max_HeightInFeet_Err ="The maximum value is 9";
		String Max_HeightInInches_Err ="The maximum value is 11";
		String MIn_HeightInFeet_Err ="The minimum value is 1";
		String HeightInInches_Err ="The maximum value is 11";
		String WeightInPounds_Err ="The maximum value is 1000";
		String MIn_WeightInPounds_Err ="The minimum value is 1";
		String RandomHeight;
		
		WebUI.sleep(2);
//		WebUI.moveToElement(NextStep5);
//		WebUI.sleep(0.5);
//		WebUI.clickElement(NextStep5);

//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_1);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_1);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_1).trim(), Mandatory_Err);
//
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_2);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_2);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_2).trim(), Mandatory_Err);
//
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_3);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_3);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_3).trim(), Mandatory_Err);
//
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_A);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_A);
//		
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_A).trim(), Mandatory_Err);
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_B);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_B);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_B).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_C);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_C);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_C).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_D);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_D);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_D).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_E);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_E);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_E).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_F);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_F);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_F).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_G);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_G);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_G).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_H);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_H);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_H).trim(), Mandatory_Err);
//		
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_I);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_I);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_I).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_J);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_J);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_J).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_4);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_4);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_4).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_5);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_5);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_5).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_6_1);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_6_1);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6_1).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_6_2);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_6_2);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6_2).trim(), Mandatory_Err);
//		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_6_3);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_6_3);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6_3).trim(), Mandatory_Err);
		
		WebUI.scrollToElementAtTop(HealthQuestions1);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions1);
		WebUI.clickElement(HealthQuestions1);
		
		WebUI.scrollToElementAtBottom(HealthQuestions2);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions2);
		WebUI.clickElement(HealthQuestions2);
		
		WebUI.scrollToElementAtBottom(HealthQuestions3);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions3);
		WebUI.clickElement(HealthQuestions3);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_A);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_A);
		WebUI.clickElement(HealthQuestions_A);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_B);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_B);
		WebUI.clickElement(HealthQuestions_B);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_C);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_C);
		WebUI.clickElement(HealthQuestions_C);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_D);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_D);
		WebUI.clickElement(HealthQuestions_D);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_E);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_E);
		WebUI.clickElement(HealthQuestions_E);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_F);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_F);
		WebUI.clickElement(HealthQuestions_F);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_G);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_G);
		WebUI.clickElement(HealthQuestions_G);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_H);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_H);
		WebUI.clickElement(HealthQuestions_H);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_I);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_I);
		WebUI.clickElement(HealthQuestions_I);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_J);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_J);
		WebUI.clickElement(HealthQuestions_J);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_4);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_4);
		WebUI.clickElement(HealthQuestions_4);
		
		WebUI.scrollToElementAtBottom(HealthQuestions_5);
		WebUI.sleep(0.2);
		WebUI.verifyElementClickable(HealthQuestions_5);
		WebUI.clickElement(HealthQuestions_5);
		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_5);
//		WebUI.sleep(0.5);
//		WebUI.verifyElementVisible(Error_HealthQuestions_5);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_5).trim(), Mandatory_Err);
		
		WebUI.scrollToElementAtBottom(NextStep5);
		
//		WebUI.scrollToElementAtBottom(Error_HealthQuestions_6_1);
		WebUI.sleep(0.5);
//		WebUI.clearAndFillText(HealthQuestions_6_1, "0");
//		WebUI.verifyElementVisible(Error_HealthQuestions_6_1);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6_1).trim(), MIn_HeightInFeet_Err);
//		WebUI.sleep(0.5);
		
//		WebUI.clearAndFillText(HealthQuestions_6_1, "14");
//		WebUI.verifyElementVisible(Error_HealthQuestions_6_1);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6_1).trim(), Max_HeightInFeet_Err);
		
		WebUI.clearAndFillText(HealthQuestions_6_1, "5");
		WebUI.sleep(1);
		WebUI.verifyElementVisible(HealthQuestions_6_1);
		WebUI.verifyContains(WebUI.getAttributeElement(HealthQuestions_6_1,"value"), "5");
		
//		WebUI.sleep(0.5);
//		WebUI.clearAndFillText(HealthQuestions_6_2, "12");
//		WebUI.verifyElementVisible(Error_HealthQuestions_6_2);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6_2).trim(), Max_HeightInInches_Err);
		
		WebUI.clearAndFillText(HealthQuestions_6_2, "7");
		WebUI.verifyContains(WebUI.getAttributeElement(HealthQuestions_6_2,"value"), "7");
		
//		WebUI.sleep(0.5);
//		WebUI.clearAndFillText(HealthQuestions_6_3, "0");
//		WebUI.verifyElementVisible(HealthQuestions_6_3);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6_3).trim(), MIn_WeightInPounds_Err);
		
//		WebUI.sleep(0.5);
//		WebUI.clearAndFillText(HealthQuestions_6_3, "1400");WebUI.verifyElementVisible(HealthQuestions_6_2);
//		WebUI.verifyContains(WebUI.getTextElement(Error_HealthQuestions_6_3).trim(), WeightInPounds_Err);
		
		WebUI.clearAndFillText(HealthQuestions_6_3, "145");
		WebUI.sleep(0.5);
		WebUI.verifyContains(WebUI.getAttributeElement(HealthQuestions_6_3,"value"), "145");
		WebUI.sleep(0.5);
		WebUI.clickElement(NextStep5);


		
	}
}
