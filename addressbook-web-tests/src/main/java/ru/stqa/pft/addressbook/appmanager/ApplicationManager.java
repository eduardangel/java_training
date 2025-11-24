package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {

    private final NavigationHelper navigationHelper = new NavigationHelper();
    private GroupHelper groupHelper;
    JavascriptExecutor js;
    private Map<String, Object> vars;

    public void init() {
        navigationHelper.driver = new FirefoxDriver();
        js = (JavascriptExecutor) navigationHelper.driver;
        vars = new HashMap<String, Object>();
        navigationHelper.driver.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(navigationHelper.driver);
        login("admin", "secret");
    }

    private void login(String username, String password) {
      navigationHelper.driver.manage().window().setSize(new Dimension(2147, 1180));
      navigationHelper.driver.findElement(By.name("user")).click();
      navigationHelper.driver.findElement(By.name("user")).sendKeys(username);
      navigationHelper.driver.findElement(By.name("pass")).click();
      navigationHelper.driver.findElement(By.name("pass")).sendKeys(password);
      navigationHelper.driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    public void stop() {
        navigationHelper.driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
