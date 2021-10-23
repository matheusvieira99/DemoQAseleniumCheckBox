package com.demoqa.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuPage extends BasePage{

	public MenuPage(WebDriver driver) {
		super(driver);
	}
	
	public void irParaWidgets() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]")).click();
	}
	
	public void rolarBarraAteOMenu() {
		WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[8]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", element);
		jse.executeScript("scrollBy(0, 150)");
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element);
//		actions.perform();
		
	}
	
	public void irParaOMenu() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[8]")).click();
	}
	
	public void passarMouseEmMainItem2() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[2]/a"));
		action.moveToElement(we).build().perform();
	}
	
	public void passarMouseEmSubSubList() {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[2]/ul/li[3]/a"));
		action.moveToElement(we).build().perform();
	}
	
	public void clicarEmSubSubItem2() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[2]/ul/li[3]/ul/li[2]/a")).click();
	}
	

}
