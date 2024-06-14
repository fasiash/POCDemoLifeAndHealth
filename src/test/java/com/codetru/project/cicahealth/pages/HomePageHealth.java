package com.codetru.project.cicahealth.pages;

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
import com.codetru.project.cicahealth.CommonPageHealthCICA;



public class HomePageHealth extends CommonPageHealthCICA{
	
	 
		private By application_btn = By.id("applicationButton");
	 
		private By list_application1 = By.xpath("//div[@class='applicationDropdown']/div[1]");
	 
		private By new_health_application1 = By.xpath("//div[@class='applicationDropdown']/div[3]");
	 
		private By step1 = By.xpath("//span[.='Step 1: Product Information']");
		
		private By step1PrimaryApplicantInfo = By.xpath("//h3[text()=\"Primary Applicant's Information\"]");

	
	 
		public void Open_Application_Module1() throws Exception {
			
			WebUI.waitForPageLoaded();
			sleep(5);

			
			clickElement(application_btn);
			sleep(1);

			clickElement(new_health_application1);
			sleep(1);

			verifyElementVisible(step1, "Step-1 tab not available");
			clickElement(step1);
			sleep(2);
			
			WebUI.waitForPageLoaded();
//			verifyElementVisible(step1PrimaryApplicantInfo, "Insured Info not displayed");

		}
	 
	}



