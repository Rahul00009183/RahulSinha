package TestingBaba;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingBaba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys("Rohit");
		driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys("rohitkumar@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys("House.No-472,Saraswati Vihar,Martui Housing Board,Chakarpur,Secotr-28");
		driver.findElement(By.xpath("//*[@id=\"paddresh1\"]")).sendKeys("Darbhanga,Bihar");
		driver.findElement(By.xpath("//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")).click();
		   List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"col-md-6 mt-5\"]/label"));
        for(WebElement ele: list)
        {
        	String valu = ele.getText();
        	System.out.println(valu);
        }
	
	}

}
