package dataExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginApp {
	static WebDriver driver;
	@BeforeTest
	public void set() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();

	}

	@AfterTest
	public void after() {
		driver.quit();
	}

	@Test()
public void main() {

		driver.get("https://demo.smart-hospital.in/site/login#");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("king");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pass");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
}