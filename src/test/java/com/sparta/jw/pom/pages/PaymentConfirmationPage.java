package com.sparta.jw.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentConfirmationPage extends Page{

    //http://automationpractice.com/index.php?controller=order-confirmation&id_cart=2681509&id_module=3&id_order=283131&key=5a77c54c09b06b9c65c61b69814e8bbd

    //Added so the page could be created using a driver (JF)
    public PaymentConfirmationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getPageAsString() {
        return webDriver.getPageSource();
    }

}
