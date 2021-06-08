package com.nit;





import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.itextpdf.text.Element;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.nit.app.app;

public class PdfGenerateTest extends AbstractPdfView {
	
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document,
			PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setHeader("Content-Disposition",
				  "attachement;filename=whUserType"+app.DisplayName()+".pdf");
				 
				  //Font font= new Font(Font.BOLDITALIC, 30, Font.BOLD); 
	Paragraph par= new  Paragraph("WEL COME TO APPLICATION");
				 
				  par.setAlignment(Element.ALIGN_CENTER); 
				  document.add(par);
				  
		
	}

		
	


	
	}
