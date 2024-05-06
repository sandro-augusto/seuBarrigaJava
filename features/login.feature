#language: pt

Funcionalidade: Login
  Realizar suite de teste de login

  @LoginSucesso
  Cenario: Login com sucesso
    Dado que o usuario esteja na tela de login
    Quando preencher o campo email e senha com dados validos
    E clicar no botao entrar
    Entao o sistema mostrara uma mensagem de sucesso "Bem vindo, thiago!"

  Esquema do Cenario: Realizar os teste de "<fluxo>" de excecao de login
    Dado que o usuario esteja na tela de login
    Quando preencher o campo email "<email>" e o campo senha "<senha>"
    E clicar no botao entrar
    Entao o sistema mostrara uma mensagem "<mensagem>" de erro

    Exemplos:
      | email           | senha  | mensagem                         | fluxo                       |
      |                 | 123456 | Email é um campo obrigatório     | Login campo email em branco |
      | 123@a.com       | 123456 | Problemas com o login do usuário | Login com email incorreto   |
      | teste@teste.com |        | Senha é um campo obrigatório     | Login campo senha em branco |
      | teste@teste.com | 12345  | Problemas com o login do usuário | Login com senha incorreta   |