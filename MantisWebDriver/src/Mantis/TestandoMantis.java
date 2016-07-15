package Mantis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import AbrindoBug.NovoBug;
import DeletaBug.DeletarBug;
import EditarBug.EditaBug;
import MantisLogin.LoginPage;

public class TestandoMantis {


		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		//Para Executar os testes no Google Chrome basta comentar o driver do Firefox acima e descomentar o driver do chrome abaixo
		
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\Documents and Settings\\EXTREME\\Desktop\\WEBDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		*/
		
		driver.manage().window().maximize();
		
	 	// Abre a página do Mantis
	   driver.get("http://mantis-prova.base2.com.br/");
	   
		// Loga na pagina do Mantis   
	   LoginPage Login = new LoginPage(driver);
	   			      
	   Login.LoginToMantis("cesar.guerra", "36242488");
	   
	    // Cadastra novo Bug 
	   NovoBug NovoBug = new NovoBug(driver);
	   
	   NovoBug.ReportBug();
	   
	   //  Edita o Bug
	   
	   EditaBug EditaBug = new EditaBug(driver);
	   
	   EditaBug.Edit();	
   	   	   
	   // Deleta Bugs	   
	
	   DeletarBug DeletarBug = new DeletarBug (driver);
	   DeletarBug.DeletaAllBugs();
	 
	   driver.close();
	}
	

}
