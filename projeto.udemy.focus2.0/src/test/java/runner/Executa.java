package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@Cadastrar",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/cucumber-report.html" },
		snippets = SnippetType.CAMELCASE
			
		)
public class Executa extends DriversFactory{
	

	public static void IniciarTeste() {
        
	String url = "https://www.udemy.com/join/signup-popup/?locale=pt_BR&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2Fpt%2F";
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	}
	
	public static void finalizarTeste() {
		driver.quit();
		
	}
}