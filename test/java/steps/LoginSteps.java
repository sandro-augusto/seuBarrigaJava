package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;

import static steps.Hooks.driver;

public class LoginSteps{

    LoginPage loginPage = new LoginPage(driver);


    @Dado("que o usuario esteja na tela de login")
    public void que_o_usuario_esteja_na_tela_de_login() {
        loginPage.validaPaginaLogin();
    }

    @Quando("preencher o campo email e senha com dados validos")
    public void preencher_o_campo_email_e_senha_com_dados_validos() {
        loginPage.preencherLogin("teste@teste.com", "123456");
    }

    @Quando("preencher o campo email {string} e o campo senha {string}")
    public void preencher_o_campo_email_e_o_campo_senha(String email, String senha) {
        loginPage.preencherLogin(email, senha);
    }
    @Quando("clicar no botao entrar")
    public void clicar_no_botao_entrar() {
        loginPage.clicarBtnLogin();
    }

    @Entao("o sistema mostrara uma mensagem {string} de erro")
    public void o_sistema_mostrara_uma_mensagem_de_erro(String mensagem) {
        loginPage.mensagemErro(mensagem);
    }
}
