package gluecode;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {
    private static WebDriver driver;
    private static DriverManager driverManager;

    @BeforeAll
    public static void startUp(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://fitideas.co/");
    }

    @AfterAll
    public static void tearDown(){
        //driverManager.closeDriver();
    }

    public static WebDriver getDriver(){return driver;}
}
