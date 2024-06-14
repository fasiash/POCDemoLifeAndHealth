package com.codetru.project.cica.testcaseshealth;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.commonHealth.BaseTestHealth;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class Step1_TestHealth extends BaseTestHealth {
	
	 @Test
	 @Parameters("statex")
    public void TC_Product_Information() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
//        getHomePage().Open_Application_Module()
//        	getStep_1HealthPage().Product_InformationHealth();
        	getStep_1HealthPage().Product_InformationHealth();
         
    }
}
