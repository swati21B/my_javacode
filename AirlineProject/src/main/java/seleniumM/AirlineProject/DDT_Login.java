package seleniumM.AirlineProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Login {
	String UN;
	String PWD;

	public void loginfromExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\SwatiBodhale\\eclipse-workspace\\AirlineProject\\DatafromExcel\\LoginAmazon.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		UN=w1.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
		PWD=w1.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
	}
}
