package com.demoqa.paginas;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	public void tirarScreenshotMenu1() throws IOException {
		//String path;
		File batatinha = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//path = "C:\\Users\\Matheus\\Downloads\\" + batatinha.getName();
        FileUtils.copyFile(batatinha, new File("menu1.png"));
//		FileUtils.copyFile(scrFile, new File("C:\\Users\\mathe\\Downloads"));
	}
	
	public void tirarScreenshotMenu2() throws IOException {
		//String path;
		File batatinha = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//path = "C:\\Users\\Matheus\\Downloads\\" + batatinha.getName();
        FileUtils.copyFile(batatinha, new File("menu2.png"));
//		FileUtils.copyFile(scrFile, new File("C:\\Users\\mathe\\Downloads"));
	}
	
	public void tirarScreenshotMenu3() throws IOException {
		//String path;
		File batatinha = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//path = "C:\\Users\\Matheus\\Downloads\\" + batatinha.getName();
        FileUtils.copyFile(batatinha, new File("menu3.png"));
//		FileUtils.copyFile(scrFile, new File("C:\\Users\\mathe\\Downloads"));
	}

}
