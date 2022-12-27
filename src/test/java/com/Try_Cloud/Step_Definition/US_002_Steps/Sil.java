package com.Try_Cloud.Step_Definition.US_002_Steps;

import com.Try_Cloud.Utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class Sil {

    @Test
    public void dnm(){

        List<WebElement> dnm = Driver.getDriver().findElements(By.xpath(""));

        Actions actions=new Actions(Driver.getDriver());

        WebElement db=Driver.getDriver().findElement(By.xpath(""));
        actions.click(db);

    }



}
