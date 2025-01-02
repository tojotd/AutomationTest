package seleniumLearning;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingDataFromEscel {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Details.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int totalrows = sheet.getLastRowNum();		
		int totalcolomns =sheet.getRow(1).getLastCellNum();
		
		for (int r=0; r<=totalrows; r++)
		{			
			XSSFRow currentrow = sheet.getRow(r);
			for (int c=0; c<totalcolomns; c++)
			{
				XSSFCell cell = currentrow.getCell(c);
				System.out.print(cell+"\t");				
			}
			System.out.println();	
		}		
		workbook.close();
	}
}
