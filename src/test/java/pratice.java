import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.dri"
				+ "ver",
				"C:\\Users\\Owner\\eclipse-workspace\\MvnProj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("compendiumdev")).click();
	}

}
