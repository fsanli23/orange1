package com.orange.step_definitions;

import com.orange.pages.AdminPage;
import com.orange.pages.HomePage;
import com.orange.utilities.CommonSteps;
import com.orange.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Admin {

    HomePage homePage = new HomePage();
    AdminPage adminPage = new AdminPage();

    @Then("User click on the admin on the left bar")
    public void user_click_on_the_admin_on_the_left_bar() throws InterruptedException {
         Thread.sleep(5000);
         homePage.clickAdmin();
    }

    @Then("User click all the check boxes")
    public void user_click_all_the_check_boxes() throws InterruptedException {


        adminPage.clickAllCheckBoxes();


    }


}
