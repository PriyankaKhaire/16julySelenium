package Login_Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoneyC_Loginpage1 
{

	//variable declaration
	@FindBy(xpath="//button[@class=\"No thanks\"]") private WebElement Nclick;
	@FindBy(xpath="//a[@title=\"Hello, Login\"]") private WebElement click;
	@FindBy(xpath="//a[@title=\"Log In\"]") private WebElement login;
	
	@FindBy(xpath="(//input[@class=\"textfield\"])[6]")private WebElement UN;
	 @FindBy(xpath="(//input[@type=\"password\"])[4]")  private WebElement PSW;
	 
	 @FindBy(xpath="//button[text()=\"Login\"]") private WebElement loginbtn;
	 
	 //step2: variable initialization
		public  MoneyC_Loginpage1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//step3: VARIABLE USAGE
		

		public void NXclick()
		{
			Nclick.click();
		}
		public void Lgclick()
		{
			click.click();
		}
		public void Loginclick()
		{
			login.click();
		}
		public void switchToFrame(WebDriver driver)
		{
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"myframe\"]")));
		}
		
		
		public void inpMoneyC_Loginpage1(String Username) 
		{
			UN.sendKeys(Username);
		}
		
		public void inpMoneyC_Loginpage2(String Passowrd) 
		{
			PSW.sendKeys(Passowrd);
		}
		
		public void clickMoneyC_Loginpage1LoginBtn()  
		{
			
			loginbtn.click();
		}


}
