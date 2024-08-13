package loginapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebAppLoginAutomation {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
       
    	driver = new ChromeDriver();
		driver.get("https://sta-web.qa.xseeddigital.info/"); 
    }

    @Test
    public void testLogin() {
        
    	WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

       
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("automation@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("hiring@123");

        
        
        try {
            Thread.sleep(3000);  // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        WebElement dashboardTitle = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]"));
        assert dashboardTitle.isDisplayed() : "Login unsuccessful";  
    }

   
    }
