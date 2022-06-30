package gluecode;

import org.openqa.selenium.WebDriver;
import pom.ContactosPage;
import pom.FormContactosPage;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();

    protected ContactosPage contactosPage= new ContactosPage();
    protected FormContactosPage formContactosPage= new FormContactosPage();
}
