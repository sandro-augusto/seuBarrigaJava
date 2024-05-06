# SeuBarrigaJava

Repositório criado para estudo de automação de testes com Java 11 - JDK (SE), Apache MAven (com variáveis de ambiente), IntelliJ, Selenium, JUnit e Cucumber.

O primeiro passo é configurar o arquivo **pom.xml**:
- 
1. Adicionar o selenium nas dependências
   <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>

2. Adicionar o WebDriver nas dependências
   <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.6.1</version>
        </dependency>
3. Adicionar o JUnit nas dependências
   <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>6.10.4</version>
        </dependency>
4. Adicionar o Cucumber para o java nas dependêcias
   <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>6.10.4</version>
        </dependency>
5. Adicionar o Cucumber para o JUnit nas dependêcias
   <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>6.10.4</version>
        </dependency>

         <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.8.2</version>
            <scope>test</scope>
        </dependency>

Entendendo a estrutura do projeto
-
1. O Chromedriver funciona como um driver para o browser;
2. Precisamos instanciar o Webdriver ou Webdrivermanager;
3. O Webdriver é implementado pela classe Chromedriver;
4. O Selenium já possui implementações para vários navegadores.
5. O Webdriver é responsável por fazer a comunicação com o navegador;

1ª Passo: Criar a classe BrowserFactory
-
Nesse projeto essa classe será criada na pasta src/test/java/**runner**;
Aqui será instanciada a classe para navegar, retornar as configurações do navegador e ser instanciada e chamada em outras classes.

1. Classe estática para método getnavegador();
2. Variáveis necessárias;
3. Instanciando o WebDriver Chrome;
4. Aplicando opções ao navegador para deixar mais leve;
5. Chamada ao navegador;
   a. navegador = new ChromeDrive(options);
   b. navegador.manage().window().maximize();
6. Retorno do navegador;

2ª Passo: Criar a classe Hooks
-
Esta classe da suporte ao teste

1. Utilização do Junit
   a. Pré condições (Ex.Abrir navegador);
   b. Pós condições (Ex. Fechar navegador);
   c. Steps (São os passos que serão executados após um comportamento;
   d. Validação;
2. Annotations
   a. Funciona com marcadores no código;
   b. Define o que será executado;
   c. Têm a Função de substituir o método main

3ª Passo: Criar a classe de Teste
-
1. Primeiro precisamos estender o hooks
2. @test (Executa o passo a passo dos testes)
3. @Displayname (Dizer qual o nome do teste que será executado. ex:Cenário)
4. teste() 
5. throws InterruptedException (Caso tenha Assertions)
6. uso do localizador By.cssSelector e By.xpath

