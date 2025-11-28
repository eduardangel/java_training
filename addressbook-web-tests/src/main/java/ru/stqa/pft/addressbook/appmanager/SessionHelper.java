package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {
        super(driver);
    }

    protected void login(String username, String password) {
      driver.manage().window().setSize(new Dimension(2147, 1180));
      type(By.name("user"), username);
      type(By.name("pass"), password);
      click(By.cssSelector("input:nth-child(7)"));
    }
}
