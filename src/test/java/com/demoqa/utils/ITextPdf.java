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
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.itextpdf.text.Document;
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

	public void tirarScreenshot(String nomePasso) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss-SSS");
		
		FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\prints\\", 
				LocalDateTime.now().format(formatter).toString()+".png"));
		
		this.nomePasso.add(nomePasso);
		
		
	}

	public void gerarPdf(String nomePdf) throws Exception {
		
		String file = System.getProperty("user.dir") + "\\target\\" + nomePdf
				+ ".pdf";
		Document doc = new Document();
		PdfWriter.getInstance(doc, new FileOutputStream(file));
		
		doc.open();
		
		String textDir = System.getProperty("user.dir") + "\\prints\\";
		Path dir = Paths.get(textDir);
		
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
		    int i = 0;
			for (Path file1: stream) {

		    	System.out.println(file1.getFileName());
		    	Image image = Image.getInstance(textDir + file1.getFileName().toString());
		    	image.scaleToFit(595, 1100);
		    			
		    	doc.add(new Paragraph (nomePasso.get(i)));
		    	i++;
		    	
		    	doc.add(image);

		    }
		}
		
		catch (IOException | DirectoryIteratorException e) {
		    
		    System.err.println(e);
		    
		}
		
		finally {
			
			doc.close();
		}
		
	}

}
