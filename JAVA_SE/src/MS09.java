import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import kr.co.bit.BoardVO;

public class MS09 {
	public static void main(String[] args) {
        try {
		  	FileInputStream fis=new FileInputStream("excel.xls");
		  	Workbook wb=new HSSFWorkbook(fis);
		  	Sheet sheet=wb.getSheetAt(0);
		  	List<BoardVO> list=new ArrayList<BoardVO>();
		  	if(sheet !=null){
		  		 int srow=sheet.getFirstRowNum();
		  		 int erow=sheet.getLastRowNum();
		  		 System.out.println(srow+":"+erow); // 0:4
		  		 Row row=sheet.getRow(0);
		  		 int scell=row.getFirstCellNum();
		  		 int  ecell=row.getLastCellNum();
		  		 System.out.println(scell+":"+ecell);//0:4
		  		 String[] tmp=new String[4];
		  		 for(int i=srow+1;i<=erow;i++){
		  			 row=sheet.getRow(i);
		  			 for(int j=scell;j<ecell;j++){
		  			        Cell cell=row.getCell(j);
		  			        int type=cell.getCellType();
		  			        if(type==0){
		  			          System.out.print(cell.getNumericCellValue()+"\t");
		  			          tmp[j]=cell.getNumericCellValue()+""; 
		  			        }else if(type==1){
		  			          System.out.print(cell.getStringCellValue()+"\t");	
		  			          tmp[j]=cell.getStringCellValue()+"";
		  			        }
		  			 }
		  			 System.out.println();
		  			 BoardVO vo=new BoardVO(Integer.parseInt(tmp[0]),
		  					                tmp[1],tmp[2],tmp[3]);
		  			 list.add(vo);
		  		 }		  		 
		  	}
		  	print(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void print(List<BoardVO> list) {
		for(BoardVO vo : list){
			System.out.println(vo);
		}		
	}
}





