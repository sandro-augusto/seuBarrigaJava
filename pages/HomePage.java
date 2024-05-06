package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class HomePage extends Actions {

    public HomePage(WebDriver navegador) {
        driver = navegador;
    }

    private By validHome = By.className("alert");
    private By btnContas = By.cssSelector(".dropdown a[href='/']");
    private By btnAdicionar = By.cssSelector("a[href='/addConta']");
    private By btnListar = By.cssSelector("a[href='/contas']");
    private By btnCriarMovimentacao = By.cssSelector("a[href='/movimentacao']");
    private By btnResumoMensal = By.cssSelector("a[href='/extrato']");
    private By btnSair = By.cssSelector("a[href='/logout']");

    public void validaHome(String _message) {
        get_text(validHome, _message);
    }
    public void clickBtnContas(String option){
        click(btnContas);
        try {
            if (option == "Adicionar") {
                click(btnAdicionar);
            } else if (option == "Listar") {
                click(btnListar);
            }
        }
        catch(Exception msg){
                System.out.println(msg);
        }
    }
    public void clickBtnCriarMovimentacao(){
        click(btnCriarMovimentacao);
    }
    public void clickBtnResumoMensal(){
        click(btnResumoMensal);
    }
    public void clickBtnSair(){
        click(btnSair);
    }

}