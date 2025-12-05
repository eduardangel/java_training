package ru.stqa.pft.addressbook.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.Browser;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(Browser.FIREFOX);

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
