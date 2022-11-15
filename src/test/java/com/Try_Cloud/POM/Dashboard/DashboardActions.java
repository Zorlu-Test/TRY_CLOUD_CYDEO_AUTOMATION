package com.Try_Cloud.POM.Dashboard;

import com.Try_Cloud.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardActions {
    public DashboardActions() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //This method clicks on an element of a list
    public void clickOnListElement (List<WebElement> list,String expectedElementText){
        for (WebElement element : list) {
            if (element.getText().contains(expectedElementText)) {
                element.click();
                break;
            }
        }
    }


}
