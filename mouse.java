import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\pathchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement moveto=driver.findElement(By.xpath("//div[@class='chHeaderContainer']/nav/ul/li[1]/a/span[2]"));
		WebElement	movet=driver.findElement(By.name("q"));
		Thread.sleep(2000);
		Actions over=new Actions(driver);
		over.moveToElement(moveto).click().build().perform();
		over.moveToElement(movet).click().keyDown(Keys.SHIFT).sendKeys("mobile").keyDown(Keys.ENTER);
		
		over.moveByOffset(0, 500);
	}
	
	//div[@class='chHeaderContainer']/nav/ul/li[5]/a/span[2]
}//div[@class='chHeaderContainer']/nav/ul/li[1]/a/span[2]
