import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class MS08 {
	public static void main(String[] args) {
       // Excel -> POI
	   try {
		FileOutputStream fos=new FileOutputStream("excel.xls");
		Workbook wb=new HSSFWorkbook();
		Sheet sheet=wb.createSheet();
		Row row=null;Cell cell=null;
	    row=sheet.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("¹øÈ£");
			
			cell=row.createCell(1);
			cell.setCellValue("Á¦¸ñ");
			
			cell=row.createCell(2);
			cell.setCellValue("³»¿ë");
			
			cell=row.createCell(3);
			cell.setCellValue("ÀÛ¼ºÀÚ");
			//row=sheet.createRow(1);
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		while(true){
	        System.out.print("Á¾·á(exit)/ÀÔ·Â(enter):");
	        String sw=br.readLine();
	        if(sw.equals("exit")) break;
	        
	        int currRow=sheet.getLastRowNum();
			row=sheet.createRow(currRow+1);
			cell=row.createCell(0);
			System.out.print("¹øÈ£:");
			cell.setCellValue(br.readLine());
			
			cell=row.createCell(1);
			System.out.print("Á¦¸ñ:");
			cell.setCellValue(br.readLine());
			
			cell=row.createCell(2);
			System.out.print("³»¿ë:");
			cell.setCellValue(br.readLine());
			
			cell=row.createCell(3);
			System.out.print("ÀÛ¼ºÀÚ:");
			cell.setCellValue(br.readLine());
		}
		
		wb.write(fos);
		fos.close();
		System.out.println("EXCEL CREATE");
		
	  } catch (Exception e) {
		e.printStackTrace();
	  }
	}
}
