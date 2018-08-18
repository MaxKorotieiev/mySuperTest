package com.it.pages;

import com.it.griver.DriverFactory;
import com.it.griver.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected static MyDriver driver = MyDriver.getDriver();

      public BasePage() {
        PageFactory.initElements(driver, this);
    }

}
