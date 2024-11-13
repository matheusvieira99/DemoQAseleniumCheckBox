package com.demoqa.tests;

import org.junit.Test;

public class MenuTest extends BaseTest {


	@Test
	public void test() throws Exception {
		menuPage.irParaWidgets();
		menuPdf.tirarScreenshot("Ir para widgets");
		menuPage.rolarBarraAteOMenu();
		menuPage.irParaOMenu();
		menuPdf.tirarScreenshot("Ir para o menu");
		menuPage.passarMouseEmMainItem2();
		menuPdf.tirarScreenshot("Passar o mouse em main item 2");
		menuPdf.gerarPdf("validacao");
	}

}
