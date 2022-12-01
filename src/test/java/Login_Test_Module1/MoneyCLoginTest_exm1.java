package Login_Test_Module1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.Base_Class;
import LibraryFiles.Utility_Class;
import Login_Module1.MoneyC_HomePage;
import Login_Module1.MoneyC_Loginpage1;


public class MoneyCLoginTest_exm1 extends Base_Class
{

	//declare globally
	MoneyC_Loginpage1 Loginp;
	 MoneyC_HomePage home;
	 
	int TCID;
	 
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		
		 InitializeOpenBrowser();    // going to base class & call method to open browser
		 
	Loginp=new MoneyC_Loginpage1(driver);
	home=new  MoneyC_HomePage(driver);
	
	}
	@BeforeMethod
	public void LogToApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(2000);
		Loginp.NXclick();
		Thread.sleep(2000);
		Loginp.Lgclick();
		Thread.sleep(2000);
		Loginp.Loginclick();
		Thread.sleep(2000);
		Loginp.switchToFrame(driver);
		
	  Loginp.inpMoneyC_Loginpage1(Utility_Class.getPFdata("UN"));
	Loginp.inpMoneyC_Loginpage2(Utility_Class.getPFdata("PSW"));
	
	
	Loginp.clickMoneyC_Loginpage1LoginBtn();
	home.getMoneyCHomePageActPN();
		
	}
	
	@Test
	public void VerifyUserId() throws EncryptedDocumentException, IOException, InterruptedException
	{
          Thread.sleep(3000);
		TCID=101;
		String actPN = home.getMoneyCHomePageActPN();
		String expPN=Utility_Class.getTestData(0, 3); //wrong data pass for fail the test case to take screenshot
		
		Assert.assertEquals(actPN, expPN,"Failed: both results are diff");
	}
	
		@AfterMethod
		public void TakeScreenshot(ITestResult s1) throws InterruptedException, IOException 
		{
			
			Thread.sleep(2000);
			if(s1.getStatus()==ITestResult.FAILURE)
			{
				Utility_Class.captureScreenshot(driver, TCID);
			}
		
		}
	
		
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		driver.quit();
	}

}
