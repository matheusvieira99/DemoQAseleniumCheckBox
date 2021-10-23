package com.demoqa.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.demoqa.paginas.MenuPage;

public class MenuTest extends BaseTest {
	//menuPage = new MenuPage(webDriver);


	@Test
	public void test() {
		menuPage.irParaWidgets();
		menuPage.rolarBarraAteOMenu();
		menuPage.irParaOMenu();
		menuPage.passarMouseEmMainItem2();
		menuPage.passarMouseEmSubSubList();
		menuPage.clicarEmSubSubItem2();
	}

}
