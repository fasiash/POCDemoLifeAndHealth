package com.codetru.project.cica.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;


public class Step_7Page extends CommonPageCICA{



	private By nextstep7 = By.xpath("(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]");	

	private By Disclosure = By.xpath("//h3[.='HIPAA Privacy Authorization']");

	public void Remarks() throws Exception {

		WebUI.moveToElement(nextstep7);
		WebUI.sleep(1);
		WebUI.clickElement(nextstep7);
		WebUI.waitForPageLoaded();
		WebUI.verifyElementVisible(Disclosure);
		WebUI.waitForPageLoaded(2);
				
	}


}
