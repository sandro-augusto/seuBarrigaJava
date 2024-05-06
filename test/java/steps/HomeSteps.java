package steps;

import io.cucumber.java.pt.Entao;
import pages.HomePage;

import static steps.Hooks.driver;

public class HomeSteps{

    HomePage homePage = new HomePage(driver);

    @Entao("o sistema mostrara uma mensagem de sucesso {string}")
    public void o_sistema_mostrara_uma_mensagem_de_sucesso(String mensagem) {
        homePage.validaHome(mensagem);
    }
}
