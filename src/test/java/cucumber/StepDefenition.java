package cucumber;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition {
	
	WebDriver driver=null;

	@Given("I open Web URL as {string}")
	public void i_open_web_url_as(String string) {
		
		//set property for chrome driver
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
						
		//driver initilization
		driver=new ChromeDriver();
						
		//open url
		driver.get("https://www.saucedemo.com/v1/");
						
		//maximize screen
		driver.manage().window().maximize();
				
	}
	@Given("I enter username as {string}")
	public void i_enter_username_as(String user) throws InterruptedException{
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys(user);
		
		Thread.sleep(2000);
		  	}
	 
	@Given("I enter password as {string}")
	public void i_enter_password_as(String pwd) {
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(pwd);
		
			}
	@When("I click on login button")
	public void i_click_on_login_button() {
	    
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
	}
	@Then("I verify error message as {string}")
	public void i_verify_error_message_as(String Experror) {
	    
		WebElement errorMsg= driver.findElement(By.xpath("//h3[@data-test='error']"));
		String actualerror=errorMsg.getText();
		
		
		assertEquals(actualerror, Experror);
		
	}
	
	@Then("I verify page title")
	public void i_verify_page_title() {
        WebElement title= driver.findElement(By.xpath("//div[@class='product_label']"));
		
		Boolean titledisplayed=title.isDisplayed();
		
		assertTrue(titledisplayed);
		
	}
	
	@Then("I close driver")
	public void i_close_driver() {
		//close driver
		driver.close();
			
	}

}
