package com.orange.pages;

import com.orange.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.orange.utilities.Driver;

import java.security.PublicKey;


public class Login {


    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name ='username']")
    public  WebElement userName;


    @FindBy(xpath = "//input[@name ='password']")
    public  WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement submit;

   public void enterUserName(String key){
       userName.sendKeys(key);
   }
    public void enterUserPassword(String key){
        password.sendKeys(key);
    }
    public void clickSubmit(){
        submit.click();

    }



}
