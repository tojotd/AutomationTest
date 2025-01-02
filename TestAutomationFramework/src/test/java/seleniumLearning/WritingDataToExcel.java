package seleniumLearning;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WritingDataToExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue("2450/-");
		row1.createCell(2).setCellValue("10 days");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Paython");
		row2.createCell(1).setCellValue("3450/-");
		row2.createCell(2).setCellValue("15 days");
		
		workbook.write(fos);
		workbook.close();
		fos.close();
		
		System.out.println("File is Created ...");
		

	}
}
