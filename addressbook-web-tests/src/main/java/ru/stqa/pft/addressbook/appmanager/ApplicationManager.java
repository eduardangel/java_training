package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    private final GroupHelper groupHelper = new GroupHelper();
    JavascriptExecutor js;
    private Map<String, Object> vars;

    public void init() {
        groupHelper.driver = new FirefoxDriver();
        js = (JavascriptExecutor) groupHelper.driver;
        vars = new HashMap<String, Object>();
        groupHelper.driver.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
      groupHelper.driver.manage().window().setSize(new Dimension(2147, 1180));
      groupHelper.driver.findElement(By.name("user")).click();
      groupHelper.driver.findElement(By.name("user")).sendKeys(username);
      groupHelper.driver.findElement(By.name("pass")).click();
      groupHelper.driver.findElement(By.name("pass")).sendKeys(password);
      groupHelper.driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    public void gotoGroupPage() {
      groupHelper.driver.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        groupHelper.driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
