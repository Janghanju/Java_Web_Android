import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
public class MS07 {
	public static void main(String[] args) {
       // PDF ÆÄÀÏ ¸¸µé±â - iText API
		try {
			FileOutputStream fos=new FileOutputStream("member.pdf");
			// ÆùÆ®
			String font="H2GTRM.TTF";
			BaseFont bf=BaseFont.createFont(font, 
					BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
			
			Font tf=new Font(bf, 16);
			Font df=new Font(bf, 12);
			
			Document doc=new Document();
			PdfWriter.getInstance(doc, fos);
			doc.open();			
			Paragraph title=new Paragraph("--È¸¿ø¸ñ·Ï--", tf);
			title.setAlignment("center");
			doc.add(title);			
			
			PdfPTable table=new PdfPTable(4);
			table.setHorizontalAlignment(PdfPTable.ALIGN_CENTER);
			Phrase name=new Phrase("ÀÌ¸§", tf);
			table.addCell(name);			
			Phrase age=new Phrase("³ªÀÌ", tf);
			table.addCell(age);			
			Phrase addr=new Phrase("ÁÖ¼Ò", tf);
			table.addCell(addr);
			Phrase image=new Phrase("ÀÌ¹ÌÁö", tf);
			table.addCell(image);
			
			//----------------------------------------
			BufferedReader br=new BufferedReader(
					new InputStreamReader(System.in));
			while(true){
				System.out.print("Á¾·á(exit)/ÀÔ·Â(enter):");
				String sw=br.readLine();
				if(sw.equals("exit")) break;
				System.out.print("ÀÌ¸§:");
				Phrase name1=new Phrase(br.readLine(), df);
				table.addCell(name1);	
				System.out.print("³ªÀÌ:");
				Phrase age1=new Phrase(br.readLine(), df);
				table.addCell(age1);
				System.out.print("ÁÖ¼Ò:");
				Phrase addr1=new Phrase(br.readLine(), df);
				table.addCell(addr1);
				System.out.print("»çÁøÀÌ¸§:");
				Image img=Image.getInstance("image/"+br.readLine()+".jpg");
			    img.scaleAbsolute(50, 50);
			    table.addCell(img);
			}			
			doc.add(table);			
			doc.close();
			fos.close();
			
			System.out.println("PDF »ý¼º¿Ï·á");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
