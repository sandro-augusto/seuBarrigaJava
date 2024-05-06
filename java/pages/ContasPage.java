package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class ContasPage extends Actions {
    public ContasPage(WebDriver navegador) {
        driver = navegador;
    }

    HomePage homePage = new HomePage(driver);
    private By fieldNome = By.id("nome");
    private By btnSalvar = By.cssSelector("button[type=submit]");
    private By tableContas = By.id("table");
    private By message = By.className("alert");
    private By btnRemove = By.cssSelector("span[class='glyphicon glyphicon-remove-circle']");
    private By btnEdit = By.cssSelector("span[class='glyphicon glyphicon-edit']");

    public void addConta(String _message){
        homePage.clickBtnContas("Adicionar");
        set(fieldNome, _message);
        click(btnSalvar);
    }
    public void validaAddConta(String _message){
        get_text(message, _message);
    }
    public void editConta(String _message){
        homePage.clickBtnContas("Listar");
        click(btnEdit);
        clear(fieldNome);
        set(fieldNome, _message);
    }
    public void deleteConta(){
        homePage.clickBtnContas("Listar");
        click(btnRemove);
    }
}
