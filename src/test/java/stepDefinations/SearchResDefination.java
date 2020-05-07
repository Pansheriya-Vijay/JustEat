package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class SearchResDefination {

	WebDriver driver;

	@Given("^I want food in \"AR51 1AA\"$")
	public void I_want_food_in_AR511AA() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aarna\\eclipse-workspace\\JustEatRestaurentProject\\ChromeDriver_81V\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.just-eat.co.uk/");
	}

	@When("^I search for restaurants$")
	public void I_search_for_restaurants() throws Throwable {
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("AR51 1AA");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/div/div/div/form/div/button/span")).click();
		

	}

	@Then("^I should see some restaurants in \"AR51 1AA\"$")
	public void I_should_see_some_restaurants_in_AR511AA() throws Throwable {
		String title = driver.getTitle();
		System.out.println("Page title ::" + title);
		Assert.assertEquals("Restaurants and takeaways in Area51, AR51 | Just Eat", title);
		System.out.println("I should see some restaurants in \"AR51 1AA\"");

	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
}
