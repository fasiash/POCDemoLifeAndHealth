package com.codetru.project.cica.testcaseshealth;

import com.codetru.common.BaseTest;
import com.codetru.commonHealth.BaseTestHealth;
import com.codetru.constants.FrameworkConstants;
import com.codetru.helpers.ExcelHelpers;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Epic("Regression Test CMS")
@Feature("Login Test")
public class LoginTestHealth extends BaseTestHealth {

//    @Test(priority = 1)
//    public void TC_LoginFailWithEmailNull() {
//        getLoginPage1().loginFailWithEmailNull();
//    }
//
//    @Test(priority = 2)
//    public void TC_LoginFailWithEmailDoesNotExist() {
//        ExcelHelpers excel = new ExcelHelpers();
//        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPage1().loginFailWithEmailDoesNotExist(excel.getCellData(1, "email"), excel.getCellData(1, "password"));
//    }
//
//    @Test(priority = 3)
//    public void TC_LoginFailWithNullPassword() {
//        ExcelHelpers excel = new ExcelHelpers();
//        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPage1().loginFailWithNullPassword(excel.getCellData(2, "email"));
//    }
//
//    @Test(priority = 4)
//    public void TC_LoginFailWithIncorrectPassword() {
//        ExcelHelpers excel = new ExcelHelpers();
//        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPage1().loginFailWithIncorrectPassword(excel.getCellData(3, "email"), excel.getCellData(3, "password"));
//    }

    @Test(priority = 5)
    public void TC_LoginSuccessWithCustomerAccount() {
        ExcelHelpers excel = new ExcelHelpers();
        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
        getLoginPage1().loginSuccessWithCustomerAccount(excel.getCellData(4, "email"), excel.getCellData(4, "password"));
    }

//    @Test(priority = 6)
//    public void TC_LoginSuccessAdminPage() {
//        excel = new ExcelHelpers();
//        excel.setExcelFile(FrameworkConstants.EXCEL_CMS_LOGIN, "Login");
//        getLoginPageCMS().loginSuccessAdminPage(excel.getCellData(5, "email"), excel.getCellData(5, "password"));
//    }
}
