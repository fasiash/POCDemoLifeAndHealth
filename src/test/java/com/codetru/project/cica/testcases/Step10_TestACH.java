package com.codetru.project.cica.testcases;

import org.testng.annotations.Test;

import com.codetru.common.BaseTest;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

public class Step10_TestACH extends BaseTest {
	
	 @Test
    public void TC_Make_a_Payment() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");

        getStep_10PageACH().Make_a_Payment();
        
        
    }
}
