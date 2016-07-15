package EditarBug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditaBug {
	WebDriver driver;
	
	By ListaBugs = By.linkText("View Issues");
	
	By SelecionaBug = By.name("bug_arr[]");
	
	By Editar = By.xpath("//img[@title='Edit']");
	
	By EditaCampoResumo = By.name("summary");
	
	By EditaCampoDescricao = By.name("description");
	
	By BtnUpdate = By.cssSelector("input.button");
	
	
	public EditaBug (WebDriver driver)
	{
		this.driver = driver;
			
	}
		
	public void Edit() throws InterruptedException
	{
	driver.findElement(ListaBugs).click();
	Thread.sleep(2000);
	
	driver.findElement(SelecionaBug).click();	
	Thread.sleep(2000);
	
	driver.findElement(Editar).click();
	Thread.sleep(2000);
	
	driver.findElement(EditaCampoResumo).clear();
	Thread.sleep(2000);
	
	driver.findElement(EditaCampoResumo).sendKeys("Editando o campo de Resumo");
	
	driver.findElement(EditaCampoDescricao).clear();
	Thread.sleep(2000);
	
	driver.findElement(EditaCampoDescricao).sendKeys("Editando o campo de descrição");
	Thread.sleep(2000);

	driver.findElement(BtnUpdate).click();
	Thread.sleep (5000);
	
	System.out.println("Bug Atualizado com Sucesso.");
	System.out.println("-----------------------------------------");
	}
	
	
	
	
	
	

}
