package stepDefs;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
	}
	@When("User enter login credentials")
	public void user_enter_login_credentials() {
		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector(".radius")).click();
	}
	@Then("Should display success msg")
	public void should_display_success_msg() {
		boolean isDisp = driver.findElement(By.className("success")).isDisplayed();
		Assert.assertTrue(isDisp);
		//To make it fail
//		Assert.assertFalse(isDisp);
	
	}




}
