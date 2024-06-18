package com.codetru.project.cica;

import static com.codetru.keywords.WebUI.clickElement;
import static com.codetru.keywords.WebUI.getTextElement;
import static com.codetru.keywords.WebUI.setText;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.codetru.project.cica.pages.HomePage;
import com.codetru.project.cica.pages.LoginPage;
import com.codetru.project.cica.pages.PaymentValidationPage;
import com.codetru.project.cica.pages.Step_10Page;
import com.codetru.project.cica.pages.Step_10PageACH;
import com.codetru.project.cica.pages.Step_1Page;
import com.codetru.project.cica.pages.Step_2Page;
import com.codetru.project.cica.pages.Step_3Page;
import com.codetru.project.cica.pages.Step_4Page;
import com.codetru.project.cica.pages.Step_5Page;
import com.codetru.project.cica.pages.Step_6Page;
import com.codetru.project.cica.pages.Step_7Page;
import com.codetru.project.cica.pages.Step_8Page;
import com.codetru.project.cica.pages.Step_9Page;

public class CommonPageCICA {

	private LoginPage loginCICA;
	private HomePage homePage;
	private Step_1Page step_1Page;
	private Step_2Page step_2Page;
	private Step_3Page step_3Page;
	private Step_4Page step_4Page;
	private Step_5Page step_5Page;
	private Step_6Page step_6Page;
	private Step_7Page step_7Page;
	private Step_8Page step_8Page;
	private Step_9Page step_9Page;
	private Step_10Page step_10Page;
	private Step_10PageACH step_10PageACH;

	private PaymentValidationPage paymentValidate;

	public LoginPage getLoginPage() {
		if (loginCICA == null) {
			loginCICA = new LoginPage();
		}
		return loginCICA;
	}
	
	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}

	public Step_1Page getStep_1Page() {
		if (step_1Page == null) {
			step_1Page = new Step_1Page();
		}
		return step_1Page;
	}

	public Step_2Page getStep_2Page() {
		if (step_2Page == null) {
			step_2Page = new Step_2Page();
		}
		return step_2Page;
	}

	public Step_3Page getStep_3Page() {
		if (step_3Page == null) {
			step_3Page = new Step_3Page();
		}
		return step_3Page;
	}

	public Step_4Page getStep_4Page() {
		if (step_4Page == null) {
			step_4Page = new Step_4Page();
		}
		return step_4Page;
	}

	public Step_5Page getStep_5Page() {
		if (step_5Page == null) {
			step_5Page = new Step_5Page();
		}
		return step_5Page;
	}

	public Step_6Page getStep_6Page() {
		if (step_6Page == null) {
			step_6Page = new Step_6Page();
		}
		return step_6Page;
	}
	
	public Step_7Page getStep_7Page() {
		if (step_7Page == null) {
			step_7Page = new Step_7Page();
		}
		return step_7Page;
	}
	
	public Step_8Page getStep_8Page() {
		if (step_8Page == null) {
			step_8Page = new Step_8Page();
		}
		return step_8Page;
	}

	public Step_9Page getStep_9Page() {
		if (step_9Page == null) {
			step_9Page = new Step_9Page();
		}
		return step_9Page;
	}
	
	public Step_10Page getStep_10Page() {
		if (step_10Page == null) {
			step_10Page = new Step_10Page();
		}
		return step_10Page;
	}
	
	public Step_10PageACH getStep_10PageACH() {
		if (step_10PageACH == null) {
			step_10PageACH = new Step_10PageACH();
		}
		return step_10PageACH;
	}
	public PaymentValidationPage getPaymentValidationPage() {
		if (paymentValidate == null) {
			paymentValidate = new PaymentValidationPage();
		}
		return paymentValidate;
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

	public CommonPageCICA clickMenuProducts() {
		clickElement(menuProducts);
		return this;
	}


}
