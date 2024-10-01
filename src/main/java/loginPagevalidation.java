

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPagevalidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://merchant.pathao.com/");
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("pt-input-no-icon")).sendKeys("sadmanpieal@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("JB3KUW1Tt");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='username capitalize w-32 truncate items-center font-medium sm:hidden lg:block mr-2']")).click();
		driver.findElement(By.xpath("//div[@class='logout-link cursor-pointer w-full flex justify-between items-center text-black rounded-b']")).click();
	}

}
