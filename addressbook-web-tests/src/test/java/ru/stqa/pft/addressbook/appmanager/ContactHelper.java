package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }

    public void submitContactForm() {
        click(By.cssSelector("input:nth-child(87)"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.firstname());
        type(By.name("middlename"), contactData.middlename());
        type(By.name("lastname"), contactData.lastname());
        type(By.name("nickname"), contactData.nickname());
        type(By.name("title"), contactData.title());
        type(By.name("company"), contactData.company());
        type(By.name("address"), contactData.address());
        type(By.name("mobile"), contactData.mobile());
        type(By.name("email"), contactData.email());
        type(By.name("address2"), contactData.address2());
    }

    public void acceptSelectContact() {
        driver.switchTo().alert().accept();
    }

    public void deleteSelectContact() {
        assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
    }

    public void inputDeleteContact() {
        click(By.cssSelector(".left:nth-child(8) > input"));
    }

    public void selectedContact() {
        click(By.name("selected[]"));
    }
}
