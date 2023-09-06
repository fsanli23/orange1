package com.orange.utilities;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CommonSteps {
    static WebDriver driver = Driver.getDriver();


    @Then("user verifies title of page {string}")
    public void user_verifies_of_the_home_page(String string) {
        Assert.assertEquals(driver.getTitle(), string);

    }

    public static boolean isChecked(WebElement element) {

        return element.isSelected();

    }

    @Then("user verifies waits for {string} second")
    public void user_verifies_of_the_home_paged(String string) {
        Wait<WebDriver> wait = new FluentWait<>(driver);
        wait.until(driver->driver.getTitle()=="sdfsdf");



    }
    public static void waitFor(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }










}