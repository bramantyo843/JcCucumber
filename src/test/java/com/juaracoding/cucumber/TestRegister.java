package com.juaracoding.cucumber;

import org.example.driver.pages.Login;
import org.example.driver.pages.Register;

import org.example.driver.util.Constants;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestRegister {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private Register register = new Register();

    public TestRegister() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case One
    @When("User go to Web HRM")
    public void user_go_to_Web_HRM() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web HRM");

    }

//    @And("User enter username password invalid")
//    public void user_enter_username_password_invalid() {
//        loginPage.login("Admin", "admin1234");
//        extentTest.log(LogStatus.PASS, "User enter username password invalid");
//    }

//    @And("User click button login")
//    public void user_click_button_login() {
//        loginPage.clickBtnLogin();
//        extentTest.log(LogStatus.PASS, "User click button login");
//    }

//    @Then("User invalid credentials")
//    public void user_invalid_credentials() {
//        Assert.assertEquals(loginPage.getTxtInvalidCredentials(), "Invalid credentials");
//        extentTest.log(LogStatus.PASS, "User invalid credentials");
//    }

    // Test Case Two
    @When("User enter register valid")
    public void user_register_valid() {
        register.registervalid("bram", "bram@gmail.com", "Bram123456!");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("User click button login valid")
    public void user_click_button_login_valid() {
        register.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }

//    @Then("User valid credentials")
//    public void user_valid_credentials() {
//        Assert.assertEquals(loginPage.getTxtEmployeeInformation(), "Employee Information");
////        Assert.assertTrue(loginPage.getTxtEmployeeInformation().contains("Employee"));
//        extentTest.log(LogStatus.PASS, "User valid credentials");
//    }
}
