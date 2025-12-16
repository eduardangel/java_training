package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ContactHelper {

    private final WebDriver driver;

    public ContactHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void returnToHomePage() {
      driver.findElement(By.linkText("home page")).click();
    }

    public void submitContactForm() {
      driver.findElement(By.cssSelector("input:nth-child(87)")).click();
    }

    public void fillContactForm(ContactData contactData) {
      driver.findElement(By.name("firstname")).click();
      driver.findElement(By.name("firstname")).sendKeys(contactData.firstname());
      driver.findElement(By.name("middlename")).click();
      driver.findElement(By.name("middlename")).sendKeys(contactData.middlename());
      driver.findElement(By.name("lastname")).click();
      driver.findElement(By.name("lastname")).sendKeys(contactData.lastname());
      driver.findElement(By.name("nickname")).click();
      driver.findElement(By.name("nickname")).sendKeys(contactData.nickname());
      driver.findElement(By.name("title")).click();
      driver.findElement(By.name("title")).sendKeys(contactData.title());
      driver.findElement(By.name("company")).click();
      driver.findElement(By.name("company")).sendKeys(contactData.company());
      driver.findElement(By.name("address")).click();
      driver.findElement(By.name("address")).sendKeys(contactData.address());
      driver.findElement(By.name("mobile")).click();
      driver.findElement(By.name("mobile")).sendKeys(contactData.mobile());
      driver.findElement(By.name("email")).click();
      driver.findElement(By.name("email")).sendKeys(contactData.email());
      driver.findElement(By.name("address2")).click();
      driver.findElement(By.name("address2")).sendKeys(contactData.address2());
    }

    public void acceptSelectContact() {
        driver.switchTo().alert().accept();
    }

    public void deleteSelectContact() {
        assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
    }

    public void inputDeleteContact() {
        driver.findElement(By.cssSelector(".left:nth-child(8) > input")).click();
    }

    public void selectedContact() {
        driver.findElement(By.name("selected[]")).click();
    }
}
