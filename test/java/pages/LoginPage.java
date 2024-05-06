package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;



public class LoginPage extends Actions {
    public LoginPage(WebDriver navegador) {
        driver = navegador;
    }
    private By fieldEmail = By.id("email");
    private By fieldPassword = By.id("senha");
    private By btnEntrar = By.cssSelector("button[type=submit]");
    private By message = By.className("alert");

    public void preencherLogin(String email, String password) {
        set(fieldEmail, email);
        set(fieldPassword, password);
    }

    public void clicarBtnLogin() {
        click(btnEntrar);
    }
    public void validaPaginaLogin() {
        driver.get("https://seubarriga.wcaquino.me/login");
    }
    public void mensagemErro(String _message){
        get_text(message, _message);
    }
}

