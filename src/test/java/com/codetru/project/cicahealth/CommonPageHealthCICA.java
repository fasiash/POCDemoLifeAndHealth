package com.codetru.project.cicahealth;

import static com.codetru.keywords.WebUI.clickElement;
import static com.codetru.keywords.WebUI.getTextElement;
import static com.codetru.keywords.WebUI.setText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codetru.project.cica.pages.HomePage;
import com.codetru.project.cica.pages.LoginPage;
import com.codetru.project.cica.pages.Step_10Page;
import com.codetru.project.cica.pages.Step_1Page;
import com.codetru.project.cica.pages.Step_2Page;
import com.codetru.project.cica.pages.Step_3Page;
import com.codetru.project.cica.pages.Step_4Page;
import com.codetru.project.cica.pages.Step_5Page;
import com.codetru.project.cica.pages.Step_6Page;
import com.codetru.project.cica.pages.Step_7Page;
import com.codetru.project.cica.pages.Step_8Page;
import com.codetru.project.cica.pages.Step_9Page;
import com.codetru.project.cicahealth.pages.HomePageHealth;

import com.codetru.project.cicahealth.pages.LoginPageHealth;
import com.codetru.project.cicahealth.pages.Step_1HealthPage;
import com.codetru.project.cicahealth.pages.Step_2HealthPage;
import com.codetru.project.cicahealth.pages.Step_3HealthPage;
import com.codetru.project.cicahealth.pages.Step_4HealthPage;
import com.codetru.project.cicahealth.pages.Step_5HealthPage;
import com.codetru.project.cicahealth.pages.Step_6HealthPage;
import com.codetru.project.cicahealth.pages.Step_7HealthPage;
import com.codetru.project.cicahealth.pages.Step_8HealthPage;
import com.codetru.project.cicahealth.pages.Step_9HealthPage;
import com.codetru.project.cicahealth.pages.Step_10PageACH;

public class CommonPageHealthCICA {

	private LoginPageHealth loginCICA1;
	private HomePageHealth homePage1;
	private Step_1HealthPage step_1Page;
	private Step_2HealthPage step_2Page;
	private Step_3HealthPage step_3Page;
	
	private Step_4HealthPage step_4Page;
	private Step_5HealthPage step_5Page;
	private Step_6HealthPage step_6Page;
	private Step_7HealthPage step_7Page;
	private Step_8HealthPage step_8Page;
	private Step_9HealthPage step_9Page;
	private Step_10PageACH step_10PageACH;

	public LoginPageHealth getLoginPage1() {
		if (loginCICA1 == null) {
			loginCICA1 = new LoginPageHealth();
		}
		return loginCICA1;
	}
	
	public HomePageHealth getHomePage1() {
		if (homePage1 == null) {
			homePage1 = new HomePageHealth();
		}
		return homePage1;
	}

	public Step_1HealthPage getStep_1HealthPage() {
		if (step_1Page == null) {
			step_1Page = new Step_1HealthPage();
		}
		return step_1Page;
	}

	public Step_2HealthPage getStep_2HealthPage() {
		if (step_2Page == null) {
			step_2Page = new Step_2HealthPage();
		}
		return step_2Page;
	}



	public Step_3HealthPage getStep_3HealthPage() {
		if (step_3Page == null) {
			step_3Page = new Step_3HealthPage();
		}
		return step_3Page;
	}

	public Step_4HealthPage getStep_4HealthPage() {
		if (step_4Page == null) {
			step_4Page = new Step_4HealthPage();
		}
		return step_4Page;
	}

	public Step_5HealthPage getStep_5HealthPage() {
		if (step_5Page == null) {
			step_5Page = new Step_5HealthPage();
		}
		return step_5Page;
	}
	
	public Step_6HealthPage getStep_6HealthPage() {
		if (step_6Page == null) {
			step_6Page = new Step_6HealthPage();
		}
		return step_6Page;
	}
	
	public Step_7HealthPage getStep_7HealthPage() {
		if (step_7Page == null) {
			step_7Page = new Step_7HealthPage();
		}
		return step_7Page;
	}

	public Step_8HealthPage getStep_8HealthPage() {
		if (step_8Page == null) {
			step_8Page = new Step_8HealthPage();
		}
		return step_8Page;
	}
	
	public Step_9HealthPage getStep_9HealthPage() {
		if (step_9Page == null) {
			step_9Page = new Step_9HealthPage();
		}
		return step_9Page;
	}
	
	public Step_10PageACH getStep_10PageACH() {
		if (step_10PageACH == null) {
			step_10PageACH = new Step_10PageACH();
		}
		return step_10PageACH;
	}
	
//  ------------------------------------------------------------------------------------------------------------------

	private By menuProducts = By.xpath("//span[normalize-space()='Products']");
	private By menuCategory = By.xpath("//span[normalize-space()='Category']");
	private By menuBrand = By.xpath("//span[normalize-space()='Brand']");
	private By menuAddNewProduct = By.xpath("//span[normalize-space()='Add New Product']");
	private By menuAllProducts = By.xpath("//span[normalize-space()='All products']");
	private By messageNotify = By.xpath("//span[@data-notify='message']");
	private By buttonEdit = By.xpath("(//a[@title='Edit'])[1]");
	private By buttonSave = By.xpath("//button[normalize-space()='Save']");
	private By inputSearch = By.xpath("//input[@id='search']");
	public By avatarProfile = By.xpath("//span[contains(@class,'avatar avatar-sm')]");
	public By buttonCookies = By.xpath("//button[normalize-space()='Ok. I Understood']");

	public void enterDataOnSearchDataTable(String value) {
		setText(inputSearch, value, Keys.ENTER);
	}

	public void clickEditButton() {
		clickElement(buttonEdit);
	}

	public void clickSaveButton() {
		clickElement(buttonSave);
	}

	public String getMessageNotify() {
		return getTextElement(messageNotify);
	}

	public CommonPageHealthCICA clickMenuProducts() {
		clickElement(menuProducts);
		return this;
	}


}
