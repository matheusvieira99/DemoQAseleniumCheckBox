package com.demoqa.paginas;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;
	//public ArrayList<String> nomePasso = new ArrayList<>();

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
