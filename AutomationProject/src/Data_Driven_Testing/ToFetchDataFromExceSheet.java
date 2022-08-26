package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExceSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestData/ExcelData.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet2");
//		Row row = sheet.getRow(1);
		for(int i=1;i<3;i++)
		{
			Row row = sheet.getRow(i);
			for (int j = 0; j <4; j++) 
			{
		String TestData=row.getCell(j).toString();
		System.out.println(TestData);
		}
		}
		/*String FirstName = cell.getStringCellValue();
		
		String LastName = row.getCell(1).getStringCellValue();
		String Email = row.getCell(2).getStringCellValue();
		String MobileNo=row.getCell(3).toString();
		
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(Email);
		System.out.println(MobileNo);
		*/
	}

}
