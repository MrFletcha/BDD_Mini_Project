package com.sparta.jw.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    //http://automationpractice.com/index.php?controller=authentication&back=my-account

    private WebDriver webDriver;
    By email = new By.ById("email");
    By password = new By.ById("passwd");

    public SignInPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getUrl() {
        return webDriver.getCurrentUrl();
    }

    public MyAccountPage goToMyAccountPageFromSignInPage(){
        webDriver.findElement(email).sendKeys("greg.spratt@icloud.com");
        webDriver.findElement(password).sendKeys("honsoc-6Qekhi-hijqax", Keys.ENTER);
        return new MyAccountPage(webDriver);
    }
}
