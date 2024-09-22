package seleniumM.ProjectSelenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Amz_Registra_DataDriven {
	
	String NameL;
	String MobileNum;
	String Password;
	
	public void RegisterDataFromExcel() throws EncryptedDocumentException, IOException
	{
		
	FileInputStream f1 = new FileInputStream("C:\\Users\\SwatiBodhale\\eclipse-workspace\\Selenium_Program\\Data Driven Test\\AmazonRegistration.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	 NameL= w1.getSheet("Register").getRow(1).getCell(0).getStringCellValue();
	 MobileNum=NumberToTextConverter.toText(w1.getSheet("Register").getRow(1).getCell(1).getNumericCellValue());
 Password=w1.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
	/*System.out.println(NameL);
	System.out.println(MobileNum);
	System.out.println(Password);*/
	}
	

}
