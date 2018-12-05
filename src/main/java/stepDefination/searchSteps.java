package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class searchSteps {

	WebDriver driver;

	@Given("^user is on searching page$")

	public void userOnPage() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hanza\\eclipse-workspace\\CucemberLearning\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

	}

	@When("^title of page is Google$")

	public void getTitle() {

		String title = driver.getTitle();
		System.out.println("The title of this website is::::" + title);

		Assert.assertEquals("Google", title);

	}

	@Then("^user enter information they want to search$")
	public void enterInfo() {

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphoneX");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		

	}

	@And("^close browser$")

	public void closeBrowser() {
		driver.close();
		driver.quit();

	}

}
