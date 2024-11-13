package com.demoqa.tests;

import org.junit.Test;

public class FormularioTest extends BaseTest {


	@Test
	public void test() {
		formularioPage.irParaFormulario();
		formularioPage.abrirDropElements();
		formularioPage.abrirCheckbox();
		formularioPage.abrirPastas();
		formularioPage.selecionarWorkspace();
		formularioPage.rolarBarra();
		formularioPage.resultadoEsperado();
		
	}

}
