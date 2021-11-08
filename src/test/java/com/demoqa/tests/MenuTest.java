package com.demoqa.tests;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.itextpdf.text.Phrase;

public class MenuTest extends BaseTest {


	@Test
	public void test() throws Exception {
		//menuPdf.nomePasso = nomePasso;
		menuPage.irParaWidgets();
		menuPdf.tirarScreenshot("Ir para widgets");
		//menuPage.tirarScreenshot(String 1- Ir para menu 1.png, String nomePasso);
		menuPage.rolarBarraAteOMenu();
		menuPage.irParaOMenu();
		menuPdf.tirarScreenshot("Ir para o menu");
		menuPage.passarMouseEmMainItem2();
		//menuPage.passarMouseEmSubSubList();
		//menuPage.clicarEmSubSubItem2();
		menuPdf.tirarScreenshot("Passar o mouse em main item 2");
		menuPdf.gerarPdf("validacao");
	}

}
