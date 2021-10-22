package com.demoqa.paginas;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioPage extends BasePage{

	
	public FormularioPage(WebDriver driver) {
		super(driver);

	}

	public void irParaFormulario() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]")).click();
	}
	
	public void abrirDropElements() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]")).click();
	}
	
	public void abrirCheckbox() {
		driver.findElement(By.xpath("//*[@id=\"item-1\"]")).click();
	}
	
//	public void abrirPastaHome() {
//		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button/svg/path")).click();
//	}
//	
//	public void abrirPastaDocumentos() {
//		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button/svg")).click();
//	}
	
	public void abrirPastas() {
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[1]")).click();
	}
	
	public void selecionarWorkspace() {
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label")).click();
	}
	
	public void resultadoEsperado() {
		Assert.assertEquals("You have selected :\n"
				+ "workspace\n"
				+ "react\n"
				+ "angular\n"
				+ "veu", driver.findElement(By.xpath("//*[@id=\"result\"]")).getText() );
	}

}
