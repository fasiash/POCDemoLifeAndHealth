package com.codetru.project.cica.testcaseshealth;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.commonHealth.BaseTestHealth;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class HomeTestHealth extends BaseTestHealth {

/*	 @Test
    public void TC_Open_Application_Module() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
        getHomePage1().Open_Application_Module1();
    }*/
	
	
	 @Parameters({"USERID", "PASSWORD"})
	 @Test
	 public void TC_Open_Application_Module1(String userName, String pwd) throws Exception {
		 
         getLoginPage1().loginSuccessWithCustomerAccount(userName, pwd);
		 getHomePage1().Open_Application_Module1();
	 }
	 
}
