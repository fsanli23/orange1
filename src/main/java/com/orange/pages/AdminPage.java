package com.orange.pages;

import com.orange.utilities.CommonSteps;
import com.orange.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AdminPage {

    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    @FindAll(@FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"))
    public List<WebElement> checkBoxes;

    public void clickAllCheckBoxes() throws InterruptedException {
        Thread.sleep(10000);
//        for (WebElement each : checkBoxes) {
//            if (!CommonSteps.isChecked(each)) {
//                each.click();
//            } else {
//                System.out.println(each.getText() + "is already selected and skipping");
//            }
//
//
//        }

        for (int i = 1; i < checkBoxes.size(); i++) {
            WebElement each = checkBoxes.get(i);
            if (!CommonSteps.isChecked(each) && !each.getText().trim().contains("Russel ")) {
                each.click();
            } else {
                System.out.println(each.getText().toUpperCase() + "has been already licked and skipping!");
            }


        }


    }


}
