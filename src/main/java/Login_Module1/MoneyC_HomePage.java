package Login_Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoneyC_HomePage 
{
@FindBy(xpath="//span[@class=\"usr_nm\"]")  private WebElement PN;
	
	public MoneyC_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String getMoneyCHomePageActPN() 
	{
		String text = PN.getText();
		return text;
		
	}

}
