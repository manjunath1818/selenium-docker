package ExtentReport.ExtentReports;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Chrome {
	@Test()
	@Parameters("BrowserType")
	public static void sampleTest1() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dr = null;
		if (BrowserType.FIREFOX.equals("firefox")) {
			dr = DesiredCapabilities.firefox();
			dr.setBrowserName("firefox");
			dr.setPlatform(Platform.LINUX);

		} else if (BrowserType.CHROME.equals("chrome")) {
			dr = DesiredCapabilities.chrome();
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.LINUX);
		}
		// dc.setVersion("84.0.4147.135");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), dr);
		driver.get("http://google.com");
		driver.close();
	}

}
