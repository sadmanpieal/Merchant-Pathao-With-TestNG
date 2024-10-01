package pathao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class trackOrder {
	WebDriver driver;
	@Test(priority = 1)
	void openApp() {
		driver = new ChromeDriver();
		driver.get("https://merchant.pathao.com/");
		System.out.println(driver.getTitle());
	}
	@Test(priority = 2)
	void EnterTrackingID(){
		
	}
	@Test(priority = 3)
	void ExitApp() {
		
	}
}
