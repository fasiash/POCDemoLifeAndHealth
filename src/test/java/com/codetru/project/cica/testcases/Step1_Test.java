package com.codetru.project.cica.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class Step1_Test extends BaseTest {
	
	 @Test
	 @Parameters("state")
    public void TC_Product_Information(String state) throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
//        getHomePage().Open_Application_Module();
        getStep_1Page().Product_Information(state);
    }
}
