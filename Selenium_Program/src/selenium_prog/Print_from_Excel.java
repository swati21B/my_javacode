package selenium_prog;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Print_from_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//FileInputStream:Opens the Excel file located at the specified path.
		FileInputStream f1=new FileInputStream ("C:\\Users\\SwatiBodhale\\eclipse-workspace\\Selenium_Program\\Data Driven Test\\UN_PW.xlsx");
//WorkbookFactory.create: Creates a Workbook instance from the file.		
		Workbook w1=WorkbookFactory.create(f1);
		/*
//getSheet(“Login”): Accesses the sheet named “Login”.
		 Sheet s1= w1.getSheet("Login");
		Row r1=s1.getRow(1);
		Cell c1=r1.getCell(0);
		String username=c1.getStringCellValue();
		System.out.println(username);
		Row r2=s1.getRow(1);
		Cell c2=r2.getCell(1);
		String password=c2.getStringCellValue();
		System.out.println(password); */
		//Retrieves the string value from the first cell (
		String username= w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		//String password= w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		//to get numeric value from the cell
		String password= NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(1).getNumericCellValue());
		System.out.println("Username: " +username);
		System.out.println("Password: "+password);
	}

}
