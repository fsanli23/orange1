package com.orange.step_definitions;

import com.orange.pages.DirectoryPage;
import com.orange.pages.HomePage;
import io.cucumber.java.en.Then;

public class Directory {

    HomePage homePage = new HomePage();
    DirectoryPage directoryPage = new DirectoryPage();

    @Then("user click on directory")
    public void user_click_on_directory() {
        homePage.clickOnDirectoryLeftBar();
    }

    @Then("user searches for employee {string} and click on the employee")
    public void user_searches_for_employee_and_click_on_the_employee(String string) {

        directoryPage.clickOnSearchBox();
        directoryPage.EnterEmployeeNameIntoSearchBox(string);


    }

    @Then("user verifies that user details is displayed")
    public void user_verifies_that_user_details_is_displayed() {

        directoryPage.clickOnfirstEmplyeeDisplayed();


    }


}
