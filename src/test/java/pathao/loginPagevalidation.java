package pathao;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginPagevalidation {

	WebDriver driver;
	@Test(priority = 1)
	void openapp() {
		driver=new ChromeDriver();
		driver.get("https://merchant.pathao.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(priority = 2)
	void testlogo() throws InterruptedException {
		Thread.sleep(2000);
	boolean status=	driver.findElement(By.xpath("//img[@alt='Logo']")).isDisplayed();
	System.out.println(status);
	}
	@Test(priority = 3)
	void login() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.className("pt-input-no-icon")).sendKeys("sadmanpieal@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("JB3KUW1Tt");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
	}
	@Test(priority = 4)
	void logout() {
		driver.findElement(By.xpath("//div[@class='username capitalize w-32 truncate items-center font-medium sm:hidden lg:block mr-2']")).click();
		driver.findElement(By.xpath("//div[@class='logout-link cursor-pointer w-full flex justify-between items-center text-black rounded-b']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='From all the devices']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
	}
	

}
