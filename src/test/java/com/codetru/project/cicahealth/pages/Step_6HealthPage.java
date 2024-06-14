package com.codetru.project.cicahealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;


public class Step_6HealthPage extends CommonPageCICA{



//	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]")
	private By nextstep6 = By.xpath("(//ion-col[@size='24' and @size-md='6' and @class='md hydrated']/ion-button)[6]");	

//	@FindBy(xpath = "//h3[.='HIPAA Privacy Authorization']")
	private By Disclosure = By.xpath("//h3[.='Disclosure and Signature']");

	public void Remarks() throws Exception {
		WebUI.sleep(2);
//		C.page_Navigation(driver, act, nextstep7, Disclosure, e, Test.Case7(1), Test.Exp7(1));
		WebUI.scrollToElementAtBottom(nextstep6);
		WebUI.sleep(1);
		WebUI.clickElement(nextstep6);
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(Disclosure);
		WebUI.waitForPageLoaded(1);
				
	}


}
