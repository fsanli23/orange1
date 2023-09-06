package com.orange.step_definitions;

import com.orange.utilities.Driver;
import io.cucumber.java.AfterAll;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHooks {

    @AfterAll
    public static void before_or_after_all(){
        Driver.getDriver().close();
    }
}
