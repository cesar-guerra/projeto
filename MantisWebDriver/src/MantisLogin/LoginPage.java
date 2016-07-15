package MantisLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	WebDriver driver;
	
	By username = By.name("username");
	
	By password = By.name("password");
	
	By BtnLogin = By.cssSelector("input.button");
	
	By UserLogado = By.cssSelector("td.login-info-left");
	
	By InfoHomepage = By.cssSelector("td.login-info-middle");
	
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}

	public void LoginToMantis (String user, String pass) throws InterruptedException
	{
		driver.findElement(username).clear();
		Thread.sleep (2000);
		driver.findElement(username).sendKeys(user);
		
		driver.findElement(password).clear();
		Thread.sleep (2000);
		driver.findElement(password).sendKeys(pass);
		
		driver.findElement(BtnLogin).click();
		Thread.sleep (5000);	
					
		System.out.println("Login realizado com Sucesso.");
		
		System.out.println(driver.findElement(UserLogado).getText()); 
		
		System.out.println(driver.findElement(InfoHomepage).getText());
		System.out.println("-----------------------------------------");

	
		
		
	}
	
	
      
    
	
}

