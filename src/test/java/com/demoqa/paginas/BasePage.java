package com.demoqa.paginas;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	
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
		//((JavascriptExecutor)driver).executeScript("scroll(0,10000)");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 500)");
		//jse.executeScript("arguments[0].scrollIntoView(true);", elemento);
	}

}
