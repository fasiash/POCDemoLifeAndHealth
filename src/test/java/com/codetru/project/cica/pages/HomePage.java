package com.codetru.project.cica.pages;

import static com.codetru.keywords.WebUI.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codetru.keywords.WebUI;
import com.codetru.project.cica.CommonPageCICA;



public class HomePage extends CommonPageCICA{


	 
		private By application_btn = By.id("applicationButton");
	 
		private By list_application1 = By.xpath("//div[@class='applicationDropdown']/div[1]");
	 
		private By new_application1 = By.xpath("//div[@class='applicationDropdown']/div[2]");
	 
		private By step1 = By.xpath("//span[.='Step 1: Product Information']");
		
		private By step1InsuredInfo = By.xpath("//h3[text()='Proposed Insured Info']");

	
	 
		public void Open_Application_Module() throws Exception {
			
			WebUI.waitForPageLoaded();
			sleep(4);

			clickElement(application_btn);
			sleep(0.5);

			clickElement(new_application1);
			sleep(0.5);

			verifyElementVisible(step1, "Step-1 tab not available");
			clickElement(step1);
			sleep(1);
			
			WebUI.waitForPageLoaded();
//			verifyElementVisible(step1InsuredInfo, "Insured Info not displayed");

		}
	 
	}



