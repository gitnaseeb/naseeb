package project;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdf
{
public static void main(String[] args)
{
Document document = new Document();
try
{
	
	PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:/naxx.pdf"));
	document.open();
	document.add(new Paragraph("I will Break the Chain of Poverty !!!"));
	document.close();
	writer.close();
} 
catch (DocumentException e)
{
	e.printStackTrace();
}
catch (FileNotFoundException e)
{
	e.printStackTrace();
}
System.out.println("Done ");
}
}