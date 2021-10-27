package com.demoqa.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.demoqa.paginas.MenuPage;

public class MenuTest extends BaseTest {


	@Test
	public void test() throws Exception {
		menuPage.irParaWidgets();
		menuPage.tirarScreenshotMenu1();
		menuPage.rolarBarraAteOMenu();
		menuPage.irParaOMenu();
		menuPage.tirarScreenshotMenu2();
		menuPage.passarMouseEmMainItem2();
		//menuPage.passarMouseEmSubSubList();
		//menuPage.clicarEmSubSubItem2();
		menuPage.tirarScreenshotMenu3();
		menuPage.gerarPdf();
	}

}
