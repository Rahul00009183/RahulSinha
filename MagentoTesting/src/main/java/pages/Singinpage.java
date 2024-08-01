package pages;
import io.cucumber.java.en.*;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Singinpage {
	 WebDriver driver;

	    @Given("Magento homepage")
	    public void i_am_on_the_magento_homepage() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://magento.softwaretestingboard.com/");
	    }

	    @When("Navigate to the sign-up page")
	    public void i_navigate_to_the_sign_up_page() {
	        WebElement accountLink = driver.findElement(By.xpath("//a[@title='Account']"));
	        accountLink.click();
	        WebElement createAccountLink = driver.findElement(By.xpath("//a[@title='Create an Account']"));
	        createAccountLink.click();
	    }

	    @When("New account with username {string} and password {string}")
	    public void i_create_a_new_account_with_username_and_password(String username, String password) {
	        WebElement firstNameInput = driver.findElement(By.id("firstname"));
	        WebElement lastNameInput = driver.findElement(By.id("lastname"));
	        WebElement emailInput = driver.findElement(By.id("email_address"));
	        WebElement passwordInput = driver.findElement(By.id("password"));
	        WebElement confirmPasswordInput = driver.findElement(By.id("password-confirmation"));
	        WebElement createAccountButton = driver.findElement(By.xpath("//button[@title='Create an Account']"));

	        firstNameInput.sendKeys("Test");
	        lastNameInput.sendKeys("User");
	        emailInput.sendKeys(username + "@example.com");
	        passwordInput.sendKeys(password);
	        confirmPasswordInput.sendKeys(password);
	        createAccountButton.click();
	    }

	    @Then("Sign in with the username {string} and password {string}")
	    public void i_should_be_able_to_sign_in_with_the_username_and_password(String username, String password) {
	        WebElement accountLink = driver.findElement(By.xpath("//a[@title='Account']"));
	        accountLink.click();
	        WebElement emailInput = driver.findElement(By.id("email"));
	        WebElement passwordInput = driver.findElement(By.id("pass"));
	        WebElement signInButton = driver.findElement(By.id("send2"));

	        emailInput.sendKeys(username + "@example.com");
	        passwordInput.sendKeys(password);
	        signInButton.click();

	        
	        WebElement accountDropdown = driver.findElement(By.xpath("//a[@title='Account']"));
	        assertTrue(accountDropdown.isDisplayed());

	        driver.quit();
	    }
	}

