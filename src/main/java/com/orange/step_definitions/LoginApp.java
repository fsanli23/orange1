package com.orange.step_definitions;

import com.orange.pages.Login;
import com.orange.utilities.ConfigurationReader;
import com.orange.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LoginApp {
    WebDriver driver = Driver.getDriver();
    Login login = new Login();

    @Given("User is on the unAuht home page")
    public void user_is_on_the_un_auht_home_page() {
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @Then("User login into App {string} and {string}")
    public void user_login_into_app_and(String userName, String password) {

        login.enterUserName(userName);
        login.enterUserPassword(password);
        login.clickSubmit();
    }


}
