package AbrindoBug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NovoBug {

WebDriver driver;

By ReportIssue = By.linkText("Report Issue");

By Categoria = By.name("category_id");

By Resumo = By.name("summary");

By Descricao = By.name("description");

By BtnReportar = By.cssSelector("input.button");

public NovoBug (WebDriver driver)
{
	this.driver = driver;
	
}
	
public void ReportBug () throws InterruptedException
{
	
driver.findElement(ReportIssue).click();

//Seleciona um dos valores do comboBox
Select categoria = new Select(driver.findElement(Categoria));
categoria.selectByValue("33");

driver.findElement(Resumo).sendKeys("Resumo do Bug");
Thread.sleep(2000);

driver.findElement(Descricao).sendKeys("Descrição do Bug");
Thread.sleep(2000);

driver.findElement(BtnReportar).click();
Thread.sleep (5000);

System.out.println("Bug cadastrado com sucesso.");
System.out.println("-----------------------------------------");

}	
	
	
	
	
	
}
