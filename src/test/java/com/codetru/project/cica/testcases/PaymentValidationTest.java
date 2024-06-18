package com.codetru.project.cica.testcases;
 
import org.testng.annotations.Test;
 
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;
import com.codetru.common.BaseTest;
 
public class PaymentValidationTest extends BaseTest {
	 @Test
    public void TC_Verify_Payment() throws Exception {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
        getPaymentValidationPage().Verify_Payment();
    }
}