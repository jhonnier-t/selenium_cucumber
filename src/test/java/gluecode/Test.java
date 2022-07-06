package gluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public  class Test extends TestBase{
    @Given("the user find on the page {string}")
    public void the_user_find_on_the_page_fit_ideas(String titleExpected) {
        Assert.assertEquals(titleExpected, driver.getTitle());
    }
    @When("the user click on the button Contactenos")
    public void the_user_click_on_the_button() {
        WebElement buttonContactenos = driver.findElement(contactosPage.getButtonContactenos());
        buttonContactenos.click();
    }
    @Then("verify the title {string}")
    public void verify_the_title(String titleExpected) {
        WebElement titleContactenos = driver.findElement(contactosPage.getTitleContactecnos());
        Assert.assertTrue("No se redirecciono correctamente la pagina", titleContactenos.isDisplayed());
        Assert.assertEquals(titleExpected, titleContactenos.getText());
    }
    // -----------------Start second Scenario------------------
    @Given("the user on site {string}")
    public void the_user_on_site(String titleExpected) {
        Assert.assertEquals(titleExpected, driver.getTitle());
    }
    @When("click on the checkbox of ask in {string}")
    public void click_on_the_checkbox_of_ask(String response) {
        WebElement checkBox = driver.findElement(By.id("label_1_3_1"));
        checkBox.click();
        Assert.assertEquals(response, checkBox.getText());
    }
    @When("^cick on the name and fill (\\w*)$")
    public void cick_on_the_name_and_fill(String Name) {
        WebElement nombre = driver.findElement(formContactosPage.getNombre());
        nombre.sendKeys(Name);
    }
    @When("^cick on the Telefono and fill (.*)$")
    public void cick_on_the_telefono_and_fill(String cel) {
        WebElement telefono = driver.findElement(formContactosPage.getTelefono());
        telefono.sendKeys(cel);
    }
    @When("^cick on the Email and fill (.*)$")
    public void cick_on_the_email_and_fill(String email) {
        WebElement correo = driver.findElement(formContactosPage.getCorreo());
        correo.sendKeys(email);
    }
    @When("^cick on the Asunto and fill (.*)$")
    public void cick_on_the_subject_and_fill(String asunto) {
        WebElement Asunto = driver.findElement(formContactosPage.getAsunto());
        Asunto.sendKeys(asunto);
    }
    @When("^cick on the Mensaje and fill (.*)$")
    public void cick_on_the_message_and_fill(String message) {
        WebElement mensaje = driver.findElement(formContactosPage.getMensaje());
        mensaje.sendKeys(message);
    }
    @Then("check fields arent empty")
    public void check_fields_arent_empty() {

    }

}
