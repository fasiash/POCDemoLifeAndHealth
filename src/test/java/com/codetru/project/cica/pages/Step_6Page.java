package com.codetru.project.cica.pages;

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
import com.codetru.project.cica.CommonPageCICA;
import com.codetru.utils.JiraCreateIssue;

public class Step_6Page extends CommonPageCICA {

	private By NextStep6 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button[starts-with(@class, md)])[5]");

	private By Error_HealthQuestions_1 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[1]/ion-row/ion-col[@class='md hydrated']");

	private By Error_HealthQuestions_2 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[2]/ion-row/ion-col[@class='md hydrated']");

	private By Error_HealthQuestions_3 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[3]/ion-row/ion-col[@class='md hydrated']");

	private By Error_HealthQuestions_4 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[4]/ion-row/ion-col[@class='md hydrated']");

	private By Error_HealthQuestions_5 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[5]/ion-row/ion-col[@class='md hydrated']");

	private By Error_HealthQuestions_6 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[6]/ion-row/ion-col[@class='md hydrated']");

	private By Error_HealthQuestions_7 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[7]/ion-row/ion-col[@class='md hydrated']");

	private By Error_HealthQuestions_8 = By.xpath("//div[@class='block-info-app' and @style='margin-top: 20px; margin-bottom: 20px;' ]/div[8]/ion-row/ion-col[@class='md hydrated']");

	private By HealthQuestions1 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[3]");

	private By HealthQuestions2 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[4]");

	private By HealthQuestions3 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[5]");

	private By HealthQuestions4 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[6]");

	private By HealthQuestions5 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[7]");

	private By HealthQuestions6 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[8]");

	private By HealthQuestions7 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[9]");

	private By HealthQuestions8 = By.xpath("(//ion-item/ion-label[.='No']/following-sibling::ion-radio)[10]");

	private By no_physician = By.xpath("//ion-checkbox[@formcontrolname='PhysicianNameCheckbox']");

	private By Error_NoPhysicanCheckBox = By.xpath("//ion-input[@formcontrolname='PhysicianName']/parent::ion-item/parent::ion-col");

	private By NextStep7 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]");

	private By Physician_textbox = By.xpath("//ion-input[@formcontrolname='PhysicianName']");
	@JiraCreateIssue(isCreateIssue = true)
	public void Predetermination_Questions() throws Exception {

		String Mandatory_Err = "Please enter a value.";

		WebUI.sleep(1);

		WebUI.scrollToElementAtBottom(HealthQuestions1);
		WebUI.sleep(0.2);
		WebUI.clickElement(HealthQuestions1);
		
		WebUI.scrollToElementAtBottom(HealthQuestions2);
		WebUI.sleep(0.2);
		WebUI.clickElement(HealthQuestions2);

		WebUI.scrollToElementAtBottom(HealthQuestions3);
		WebUI.sleep(0.2);
		WebUI.clickElement(HealthQuestions3);

		WebUI.scrollToElementAtBottom(HealthQuestions4);
		WebUI.sleep(0.2);
		WebUI.clickElement(HealthQuestions4);

		WebUI.scrollToElementAtBottom(HealthQuestions5);
		WebUI.sleep(0.2);
		WebUI.clickElement(HealthQuestions5);

		WebUI.scrollToElementAtBottom(HealthQuestions6);
		WebUI.sleep(0.2);
		WebUI.clickElement(HealthQuestions6);

		WebUI.scrollToElementAtBottom(HealthQuestions7);
		WebUI.sleep(0.2);
		WebUI.clickElement(HealthQuestions7);

		WebUI.scrollToElementAtBottom(HealthQuestions8);
		WebUI.sleep(0.2);
		WebUI.clickElement(HealthQuestions8);

		WebUI.scrollToElementAtBottom(NextStep6);
		WebUI.sleep(0.2);
		WebUI.verifyElementVisible(NextStep6);


		WebUI.clickElement(no_physician);

		WebUI.clickElement(NextStep6);


		
	}
}
