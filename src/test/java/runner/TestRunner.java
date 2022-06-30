package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
                glue = {"gluecode"},
                plugin = {"json:cucumber-report/cucumber-reporting.json"}
)

public class TestRunner {

    @AfterClass
    public static void execution(){
        try {
            System.out.println("...:::::: Generating report... ::::::...");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("...:::::: Report successfully ::::::...");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}