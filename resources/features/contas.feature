#language: pt


  Funcionalidade: Ações dentro do Seu Barriga

  Contexto:
    Dado que o usuário esteja logado


#  Criar conta com sucesso
  Esquema do Cenário: Criar e validar uma Conta "<fluxo>"
    Dado que o usuário ao clicar em Contas e clicar em Adicionar
    Quando o usuário preencher o campo "<nome>" e clicar no botao salvar
    Então o sistema exibirá a "<mensagem>"

    Exemplos:
      | nome            | mensagem                           | fluxo                               |
      | teste-automacao | Conta adicionada com sucesso!      | Conta criada com sucesso            |
      | teste-automacao | Já existe uma conta com esse nome! | Tentar criar conta com o mesmo nome |
      |                 | Informe o nome da conta            | Criar conta com campo vazio         |