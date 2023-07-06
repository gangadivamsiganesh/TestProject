package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleClass 
{

    @Given("^Open browser$")
	public void open_browser()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Gangadi Vamsiganesh/Downloads/chromedriver_win32 (12)/chromedriver.exe");
		// Instantiate a ChromeDriver class.
	    WebDriver driver = new ChromeDriver();
	    System.out.println("Browser2 Opened2");
		
		// Maximize the browser
	    driver.manage().window().maximize();
    }
	@Then("^Google dashboard page must open$")
	public void google_dashboard_page_must_open() 
	{
		WebDriver driver = new ChromeDriver();
		   // Launch Website
        driver.get("https://www.google.com/");
        System.out.println("Google page opened");
        driver.quit();
	}
}
