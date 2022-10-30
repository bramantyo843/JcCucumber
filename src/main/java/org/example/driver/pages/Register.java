package org.example.driver.pages;

import org.example.driver.DriverSingleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Register {
    private WebDriver driver;

    public Register() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")
    WebElement btnLogin;

    //@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")
    //WebElement txtEmployeeInformation;

//    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
//    WebElement txtInvalidCredentials;

//    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
//    WebElement txtRequired;

    public void registervalid(String username,String Email, String password){
        this.username.sendKeys(username);
        this.username.sendKeys(Email);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin()
    {
        btnLogin.click();
    }

//   public String getTxtEmployeeInformation(){
//       return txtEmployeeInformation.getText();
//    }

//    public String getTxtInvalidCredentials(){
//        return txtInvalidCredentials.getText();
//    }

//    public String getTxtRequired(){
//        return txtRequired.getText();
//    }
}
