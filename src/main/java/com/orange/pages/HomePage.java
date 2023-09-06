package com.orange.pages;

import com.orange.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[.='Admin'])[2]")
    public WebElement adminLeftBar;

    @FindBy(xpath = "(//*[.='Directory'])[2]")
    public WebElement directoryLeftBar;


    public void clickAdmin()  {
        wait.until(ExpectedConditions.visibilityOf(adminLeftBar));
        adminLeftBar.click();

    }

    public void clickOnDirectoryLeftBar()  {
        wait.until(ExpectedConditions.visibilityOf(directoryLeftBar));
        adminLeftBar.click();
    }
}














