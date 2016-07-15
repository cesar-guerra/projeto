package DeletaBug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DeletarBug {
WebDriver driver;

    By ListaBugs = By.linkText("View Issues"); 
    
    By SelecionaBugs = By.name("all_bugs");
    
    By Opcao = By.name("action");
    
    By BtnOk = By.cssSelector("input.button");
    
    By BtnDelete = By.cssSelector("input.button");
    
    
public DeletarBug (WebDriver driver)
{
	this.driver=driver;
}

public void DeletaAllBugs () throws InterruptedException
{
	driver.findElement(ListaBugs).click();
	Thread.sleep(2000);
	
	driver.findElement(SelecionaBugs).click();
	Thread.sleep(2000);

	//Seleciona um dos valores do comboBox
	Select opcao = new Select(driver.findElement(Opcao));
	opcao.selectByValue("DELETE");
	Thread.sleep(2000);
	
	driver.findElement(BtnOk).click();
	Thread.sleep(3000);

	driver.findElement(BtnDelete).click();	
	Thread.sleep(5000);
	
	System.out.println("Todos os Bugs Foram Excluídos com Sucesso.");
}



}
