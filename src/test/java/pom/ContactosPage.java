package pom;

import org.openqa.selenium.By;

public class ContactosPage {

    private By buttonContactenos = By.xpath("/html/body/div/div[1]/div/div/section[1]/div/div/div[2]/div/div/div/div/nav[1]/ul/li[6]/a");
    private By titleContactecnos = By.xpath("/html/body/div/div[2]/div/div/main/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/h2");

    public By getButtonContactenos() {
        return buttonContactenos;
    }

    public By getTitleContactecnos() {
        return titleContactecnos;
    }
}
