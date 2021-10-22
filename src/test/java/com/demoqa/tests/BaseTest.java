package com.demoqa.tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.demoqa.paginas.BasePage;
import com.demoqa.paginas.FormularioPage;

public class BaseTest {
	WebDriver webDriver;
	FormularioPage formularioPage;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\webdriver\\msedgedriver.exe");
		webDriver = new EdgeDriver();
		formularioPage = new FormularioPage(webDriver);
		webDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		formularioPage.abrirPagina("https://demoqa.com/");
		formularioPage.maximizarPagina();
		formularioPage.rolarBarra();
	}

	@After
	public void tearDown() throws Exception {
		//webDriver.quit();
	}


}
