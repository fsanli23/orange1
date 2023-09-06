package com.orange.pages;

import com.orange.utilities.Driver;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;
import java.time.Duration;

public class DirectoryPage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    public DirectoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input)[2]")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[starts-with(@class, 'oxd')])[5]")
    public WebElement searchButton;


    @FindBy(xpath = "(//*[starts-with(@class, 'oxd-grid-item oxd-grid-item--gutters')])[4]")
    public WebElement firstEmployeeDisplayed;


    public void clickOnSearchBox() {
        try {
            wait.until(ExpectedConditions.visibilityOf(searchBox));
            searchBox.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void EnterEmployeeNameIntoSearchBox(String employeeName) {
        try {
            wait.until(ExpectedConditions.visibilityOf(searchBox));
            if (employeeName == "") {

                throw new RuntimeException("Pls enter employeeName");


            } else {
                searchBox.sendKeys(employeeName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void clickOnSearchButton() {
        try {
            wait.until(ExpectedConditions.visibilityOf(searchButton));
            searchButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void clickOnfirstEmplyeeDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOf(firstEmployeeDisplayed));
            firstEmployeeDisplayed.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
