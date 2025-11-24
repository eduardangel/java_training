package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    protected WebDriver driver;

    public void gotoGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }
}
