package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ContasPage;
import pages.HomePage;
import pages.LoginPage;

import static steps.Hooks.driver;

public class ContasSteps {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ContasPage contasPage = new ContasPage(driver);

    @Dado("que o usuário esteja logado")
    public void que_o_usuário_esteja_logado() {
        loginPage.validaPaginaLogin();
        loginPage.preencherLogin("teste@teste.com", "123456");
        loginPage.clicarBtnLogin();
        homePage.validaHome("Bem vindo, thiago!");
    }

    @Dado("que o usuário ao clicar em Contas e clicar em Adicionar")
    public void que_o_usuário_ao_clicar_em_contas_e_clicar_em_adicionar() {
        homePage.clickBtnContas("Adicionar");
    }
    @Quando("o usuário preencher o campo {string} e clicar no botao salvar")
    public void o_usuário_preencher_o_campo_e_clicar_no_botao_salvar(String _conta) {
        contasPage.addConta(_conta);
    }

    @Então("o sistema exibirá a {string}")
    public void o_sistema_exibirá_a(String _mensagem) {
        contasPage.validaAddConta(_mensagem);
    }

}
