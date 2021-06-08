package com.nit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class pdfgenerate2 {
	public static void main(String[] args)  {
		Document document = new Document();
		try
		{
		    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(app.DisplayName()+".pdf"));
		    document.open();
		    document.add(new Paragraph("welcome to java application"));       
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	   }
	}


