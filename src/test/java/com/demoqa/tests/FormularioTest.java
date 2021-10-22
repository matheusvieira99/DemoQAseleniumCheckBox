package com.demoqa.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.demoqa.paginas.FormularioPage;

public class FormularioTest extends BaseTest {
	//FormularioPage formularioPage = new FormularioPage(webDriver);


	@Test
	public void test() {
		formularioPage.irParaFormulario();
		formularioPage.abrirDropElements();
		formularioPage.abrirCheckbox();
		formularioPage.abrirPastas();
//		formularioPage.abrirPastaHome();
//		formularioPage.abrirPastaDocumentos();
		formularioPage.selecionarWorkspace();
		formularioPage.rolarBarra();
		formularioPage.resultadoEsperado();
		
	}

}
