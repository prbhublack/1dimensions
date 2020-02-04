package stepdeff;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Stepdef {
	public static WebDriver driver;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhu\\eclipse-workspace\\1Dimensionwithheader\\driver");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

//	@When("Eneter the username and password.")
//	public void eneter_the_username_and_password(io.cucumber.datatable.DataTable d) {
//		Map<String, String> emp = d.asMap(String.class,String.class);
//		WebElement type=driver.findElement(By.id("u_0_m"));
//		type.sendKeys(emp.get("username"));
//		WebElement type1 = driver.findElement(By.id("u_0_r"));
//		type1.sendKeys(emp.get("password"));
//		WebElement type2 = driver.findElement(By.id("u_0_w"));
//		type2.sendKeys(emp.get("email"));
//		
//		
//	}

	@When("User clik the login button")
	public void user_clik_the_login_button() {
		
		System.out.println("prabhuuuuuuu");
	}

	@Then("user Exit the browser")
	public void user_Exit_the_browser() {
	}


}
