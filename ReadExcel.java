package FileHandling;

import java.io.*;
import org.apache.poi.hssf.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.*;
//import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream i = new FileInputStream(new File("D:\\SWARAJ\\workspace\\DAY-6\\profile.xls"));
		HSSFWorkbook j = new HSSFWorkbook(i);
		HSSFSheet k = j.getSheetAt(0);
		//FormulaEvaluator l = j.getCreationHelper().createFormulaEvaluator();
		
		for(Row row:k)
		{	
		    for(Cell cell:row)
		    {
			    switch(cell.getCellType())
			    {
			
		       	case NUMERIC:
		            System.out.print(cell.getNumericCellValue()+"\t");
		            break;
		        
			    case STRING:
				    System.out.print(cell.getStringCellValue()+"\t");
				    break;
			}
		}
		System.out.println();
	}
  }
}
