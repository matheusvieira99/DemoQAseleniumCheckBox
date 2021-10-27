package com.demoqa.utils;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ITextPdf {
	
	public void iTextPdf() throws Exception {
		
		String file = "C:\\Users\\Matheus\\Desktop\\projects\\DemoQA\\target\\pdf.pdf";
		Document doc = new Document();
		PdfWriter.getInstance(doc, new FileOutputStream(file));
		
		doc.open();
		
		doc.add(new Paragraph ("Ir para widgets:\n"));
		Image image = Image.getInstance("menu1.png");
		image.scaleToFit(595, 1100);
		doc.add(image);
		
		doc.add(new Paragraph ("Ir para o menu:\n"));
//		Image image2 = Image.getInstance("menu2.png");
//		image2.scaleToFit(826, 1100);
//		doc.add(image2);
		
		doc.add(new Paragraph ("Passar o mouse em main item 2"));
		doc.add(new Paragraph ("Passar o mouse em sub sub list"));
		doc.add(new Paragraph ("Acionar sub sub item 2:\n"));
		Image image3 = Image.getInstance("menu3.png");
		image3.scaleToFit(595, 1100);
		doc.add(image3);
		
		doc.close();
	}

}
