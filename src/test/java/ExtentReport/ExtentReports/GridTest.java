package ExtentReport.ExtentReports;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.Platform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities dc = new DesiredCapabilities();
		// WebDriver driver;
		//Thread.sleep(20000);
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.LINUX);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), dc);
		//Thread.sleep(20000);
		driver.manage().window().maximize();
		driver.get("http://google.com");

		//Thread.sleep(20000);
		driver.close();
	}

}