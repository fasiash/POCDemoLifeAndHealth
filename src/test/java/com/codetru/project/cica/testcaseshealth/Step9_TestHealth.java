package com.codetru.project.cica.testcaseshealth;

import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.commonHealth.BaseTestHealth;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class Step9_TestHealth extends BaseTestHealth {
	
	 @Test
    public void TC_Make_a_Payment() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
//        getHomePage().Open_Application_Module();
//        getStep_1Page().Product_Information();
//        getStep_2Page().Proposed_Insured_Information();
//        getStep_3Page().Policy_Owner_Information();
//        getStep_4Page().Beneficiary_Information();
//        getStep_5Page().Existing_Insurance();
//        getStep_6Page().Predetermination_Questions();
//        getStep_7Page().Remarks();
//        getStep_8Page().Disclosure_and_Signature();
//        getStep_9Page().Edit_Submit();
        	getStep_9HealthPage().Make_a_Payment();
        
        
    }
}
