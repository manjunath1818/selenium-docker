package ExtentReport.ExtentReports;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLogout1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver","D:\\UPC\\Selenium\\Repository\\Project1\\drivers\\chromedriver1.exe");
        
		String downloadPath=System.getProperty("user.dir");
		WebDriverManager.chromedriver().setup();
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);
		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Choose File')]")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\UPC\\Selenium\\AutoIt\\fileUpload.exe");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='g-btn g-btn--primary g-btn--medium']")));
		
		
		//Actions actions = new Actions(driver);
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@class='g-btn g-btn--primary g-btn--medium']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
		js.executeScript("arguments[0].click();", driver.findElement(By.linkText("Download Now")));
		//WebElement mainMenu = driver.findElement(By.xpath("//button[@class='g-btn g-btn--primary g-btn--medium']"));
		//actions.moveToElement(mainMenu).click();
		//actions.click().build().perform();
		
		//driver.findElement(By.xpath("//button[@class='g-btn g-btn--primary g-btn--medium']")).click();
		//js.executeScript("window.scrollBy(0,1000)");
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
		
		//WebElement mainMenu1 = driver.findElement(By.linkText("Download Now"));
		//actions.moveToElement(mainMenu1).click();
	
		
		//driver.findElement(By.linkText("Download Now")).click();
		Thread.sleep(5000);
		File f = new File(downloadPath+"/converted.zip");
		if(f.exists()) {
			Assert.assertTrue(f.exists());
			System.out.println("file found");
			if(f.delete()) {
				System.out.println("file deleted");
			}
		}
		

		/*System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='userName']")).clear();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("k.manjunath1818@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("selenium@123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//tr//td[@class='mouseOut']//a[contains(text(),'SIGN-OFF')]")).click();*/
		/*
		 * Assert.assertEquals(
		 * driver.findElement(By.xpath("//span[contains(text(),'India')]")) .getText(),
		 * "India");
		 */
		
	}
}