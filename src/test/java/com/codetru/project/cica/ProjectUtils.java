package com.codetru.project.cica;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.codetru.constants.FrameworkConstants;
import com.codetru.driver.DriverManager;
import com.codetru.helpers.CaptureHelpers;
import com.codetru.keywords.WebUI;
import com.codetru.listeners.TestListener;
import com.codetru.report.AllureManager;
import com.codetru.report.ExtentReportManager;
import com.codetru.report.ExtentTestManager;
import com.codetru.utils.DateUtils;
import com.codetru.utils.JiraServiceProvider;
import com.codetru.utils.LogUtils;

public class ProjectUtils {
	public static JiraServiceProvider jsp ;
	   public static boolean verifyContainsForJira(String value1, String value2) {
	    	SoftAssert softAssert = new SoftAssert();	    	 
	    	
	        boolean result = value1.contains(value2);
	        if (result == true) {
	            LogUtils.info("Verify Equals: " + value1 + " CONTAINS " + value2);
	            if (ExtentTestManager.getExtentTest() != null) {
	                ExtentReportManager.pass("Verify Contains: " + value1 + " CONTAINS " + value2);
	            }
	            AllureManager.saveTextLog("Verify Contains: " + value1 + "CONTAINS" + value2);
	        } else {
	            LogUtils.info("Verify Contains: " + value1 + " NOT CONTAINS " + value2);
	            if (ExtentTestManager.getExtentTest() != null) {
	                ExtentReportManager.fail("Verify Contains: " + value1 + " NOT CONTAINS " + value2);
	                ExtentReportManager.addScreenShot(Status.FAIL, "");
	            }
	            AllureManager.saveTextLog("Verify Contains: " + value1 + " NOT CONTAINS " + value2);
	        
	            softAssert.assertEquals(value1, value2, value1 + " NOT CONTAINS " + value2);
	            
	           jsp = new JiraServiceProvider();
	            jsp.createJiraIssue("Bug", TestListener.currentMethodName, value1 + " NOT CONTAINS " + value2);
	            jsp.addAttachmentToJiraIssue(CaptureHelpers.getScreenshotAbsolutePath(TestListener.currentMethodName));
	            jsp.addAttachmentToJiraIssue("logs/applog.log");

	        }
	        return result;
	    }

	 
	   public static void clickElementForJira(By by) {
	       try {
	           WebUI.waitForElementVisible(by).click();
	           LogUtils.info("Clicked on the element " + by.toString());

	           if (ExtentTestManager.getExtentTest() != null) {
	               ExtentReportManager.pass("Clicked on the element " + by.toString());
	           }
	           AllureManager.saveTextLog("Clicked on the element " + by.toString());

//	           addScreenshotToReport(Thread.currentThread().getStackTrace()[1].getMethodName() + "_" +DateUtils.getCurrentDateTime());
	       } catch (Exception e) {
	           LogUtils.info("Failed to click on the element " + by.toString());
	           
	           if (ExtentTestManager.getExtentTest() != null) {
	               ExtentReportManager.fail("Failed to click on the element " + by.toString());
	               ExtentReportManager.addScreenShot(Status.FAIL, "");
	           }
	           AllureManager.saveTextLog("Failed to click on the element " + by.toString());

	           jsp = new JiraServiceProvider();
	           jsp.createJiraIssue("Bug", Thread.currentThread().getStackTrace()[1].getMethodName(), "Failed to click on the element " + by.toString());
	           jsp.addAttachmentToJiraIssue(CaptureHelpers.getScreenshotAbsolutePath(Thread.currentThread().getStackTrace()[1].getMethodName()));
	           jsp.addAttachmentToJiraIssue("logs/applog.log");

	           throw e;
	       }
	   }

}
