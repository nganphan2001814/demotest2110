package Testcase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create_testcase {
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	 
	    WebDriver driver = new ChromeDriver();

	    //1 - Maximize browser của mình
        driver.manage().window().maximize();
    
        driver.navigate().to("https://anhtester.com");
        
        System.out.println(driver.getTitle());

        // Thoát hẳn Browser
        Thread.sleep(2000);

        driver.quit();
	}

}
