package BaseLibrary;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class baselibrary {
	
	
	WebDriver driver=null;
	@Test
	public void test1()
	{
		driver = new ChromeDriver();
		driver.get(" https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}
}