package LibraryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{
	public WebDriver driver;
    public void InitializeOpenBrowser() throws IOException
    {
	//System.setProperty("webdriver.chrome.driver",
			//"C:\\Users\\Pritesh Pawale\\Documents\\Selenium16 Jul\\chromedriver_win32 (1)\\chromedriver.exe");
	
driver=new ChromeDriver();
driver.get(Utility_Class.getPFdata("URL"));

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

}
