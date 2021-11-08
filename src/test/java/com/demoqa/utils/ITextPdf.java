package com.demoqa.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.demoqa.paginas.MenuPage;
import com.demoqa.tests.MenuTest;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ITextPdf {
	WebDriver driver;
	public List<String> nomePasso = new ArrayList<String>();
	
	public ITextPdf(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//MenuPage menuPage = new MenuPage(driver);
	//MenuTest menuTest = new MenuTest();

	//public List<String> list=new ArrayList<String>(3);

	public void tirarScreenshot(String nomePasso) throws IOException {
		File batatinha = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss-SSS");
		
		FileUtils.copyFile(batatinha, new File(System.getProperty("user.dir") + "\\prints\\", 
				LocalDateTime.now().format(formatter).toString()+".png"));
		
		this.nomePasso.add(nomePasso);
		
		//System.out.println(nomePasso);
		
	}

	public void gerarPdf(String nomePdf) throws Exception {
		
		String file = System.getProperty("user.dir") + "\\target\\" + nomePdf
				+ ".pdf";
		Document doc = new Document();
		PdfWriter.getInstance(doc, new FileOutputStream(file));
//		System.out.println(nomePasso.get(0));
//		System.out.println(nomePasso.get(1));
//		System.out.println(nomePasso.get(2));
		
		doc.open();
		
//		for (tamanhoDaPastaDeImagens) {
//			novoparagrafo();
//			addImagem();
//		}
		
//		Iterable<Path> colchao = FileSystems.getDefault().getRootDirectories();
//		for (Path nome: colchao) {
//		    System.err.println(nome);
//		}
		
		String textDir = System.getProperty("user.dir") + "\\prints\\";
		Path dir = Paths.get(textDir);
		Font bold = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 20, BaseColor.BLACK);
		
		//String passo = menuPage.getPassos();
		

		//Chunk passoChunk = new Chunk( );
		
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
		    int i = 0;
			for (Path file1: stream) {
		    	
		    	//doc.add(new Paragraph (nomePasso + "\n"));

		    	//nomePasso.get(0);

		    	System.out.println(file1.getFileName());
		    	Image image = Image.getInstance(textDir + file1.getFileName().toString());
		    	//System.out.println("to aqui");
		    	image.scaleToFit(595, 1100);
		    			
		    	doc.add(new Paragraph (nomePasso.get(i)));
		    	i++;
		    	//doc.add(new Paragraph (nomePasso.toString()));
		    	
		    	doc.add(image);

		    }
		}
		
		catch (IOException | DirectoryIteratorException e) {
		    
		    System.err.println(e);
		    
		}
		
		finally {
			
			doc.close();
		}
		
		
		
		
		
//		doc.add(new Paragraph ("Passar o mouse em sub sub list"));
//		doc.add(new Paragraph ("Acionar sub sub item 2:\n"));
		
		//doc.close();
	}

}
