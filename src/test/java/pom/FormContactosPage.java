package pom;


import org.openqa.selenium.By;

public class FormContactosPage {

    private By respuesta = By.id("label_1_3_1");
    private By nombre = By.name("input_5.3");
    private By telefono = By.name("input_6");
    private By correo = By.name("input_7");
    private By asunto = By.name("input_8");
    private By mensaje = By.name("input_9");

    public By getRespuesta() {
        return respuesta;
    }

    public By getNombre() {
        return nombre;
    }

    public By getTelefono() {
        return telefono;
    }

    public By getCorreo() {
        return correo;
    }

    public By getAsunto() {
        return asunto;
    }

    public By getMensaje() {
        return mensaje;
    }
}
