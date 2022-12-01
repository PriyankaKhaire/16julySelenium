package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class {

	//1)this method use to get data from excel sheet
	//2)need to pass two parameters rowIndex & cellIndex
	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{

		FileInputStream file=new FileInputStream("C:\\Users\\Pritesh Pawale\\eclipse-workspace\\ForLoop\\16JulyA_SeleniumMaven\\TestData\\Book 15.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	public static void captureScreenshot(WebDriver driver,int TCID ) throws IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Pritesh Pawale\\eclipse-workspace\\ForLoop\\16JulyA_SeleniumMaven\\FailedTestCase_Screenshots\\TestCaseID"+TCID+".jpg");
	
	
	
	FileHandler.copy(src, dest);
	}
	
	public static String getPFdata(String key) throws IOException
	{
 FileInputStream file=new FileInputStream("C:\\Users\\Pritesh Pawale\\eclipse-workspace\\ForLoop\\16JulyA_SeleniumMaven\\PropertyFile.properties");
	
	Properties p=new Properties();
	
	p.load(file);
	String value=p.getProperty(key);
	return value;
	
  }
	
}
