package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

    public static WebDriver getBrowser() {

        WebDriver navegador;
        ChromeOptions options;

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-crash-reporter");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-in-process-stack-traces");
        options.addArguments("--disable-logging");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-notifications");
        options.addArguments("--log-level=3");
        options.addArguments("--output=/dev/null");

        navegador = new ChromeDriver(options);
        navegador.manage().window().maximize();
        navegador.get("https://seubarriga.wcaquino.me/login");
        return navegador;
    }

}
