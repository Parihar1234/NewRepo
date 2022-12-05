import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MavenA {

	ExtentReports erep;
	ExtentTest ET;

	@Test
	public void Testlogin() throws IOException {

		erep = ExtentManger.GetInstance();
		ET = erep.startTest("project started here");
		ET.log(LogStatus.INFO, "Browser got launched");

		System.setProperty("webdriver.chrome.dri"
				+ "ver",
				"C:\\Users\\Owner\\eclipse-workspace\\MvnProj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		File screenshotFile = ((TakesScreenshot)
				driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshotFile, new File("Screenshot\\screenshot1.jpg"));
		
		
		driver.get("http://omayo.blogspot.com/");
		
		File screenshotFile1 = ((TakesScreenshot)
				driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshotFile1, new File("Screenshot\\screenshot1.jpg"));

		ET.log(LogStatus.INFO, "It open the application");

		String ExpectedText = "PracticeAutomationnHere";
		
		

		String ActualText = driver.findElement(By.id("pah")).getText();
		ET.log(LogStatus.INFO, "It finds the element");

		if (ExpectedText.equals(ActualText)) {
			// System.out.println("Both text got matched");
			ET.log(LogStatus.PASS, "Both text got matched");

		} else {
			// System.out.println("Both the text are mismatched");
			ET.log(LogStatus.PASS, "Both the text are mismatched");
		}
	}

	@AfterMethod()

	public void Testclouser() {
		erep.endTest(ET);
		erep.flush();

	}

}
