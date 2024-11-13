package com.demoqa.paginas;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void abrirPagina(String url) {
		driver.get(url);
	}
	
	public void maximizarPagina() {
		driver.manage().window().maximize();
	}
	
	public void rolarBarra() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 500)");
	}
	
	
	


}
