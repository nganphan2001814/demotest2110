package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	 
	    WebDriver driver = new ChromeDriver();

	    driver.get("https://saleserpdemo.bdtask-demo.com/v10_demo/login");

        // Nhập thông tin đăng nhập
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));

        // Nhập email và mật khẩu
        emailField.sendKeys("admin@gmail.com");
        passwordField.sendKeys("123456");

        // Nhấn nút Login
        loginButton.click();

        // Kiểm tra kết quả (ví dụ, kiểm tra URL hoặc tiêu đề trang sau khi đăng nhập)
        String expectedUrl = "https://saleserpdemo.bdtask-demo.com/v10_demo/dashboard";
        String actualUrl = driver.getCurrentUrl();
        
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Login thành công!");
        } else {
            System.out.println("Login thất bại!");
        }
        driver.get("http://saleserpdemo.bdtask-demo.com/v10_demo/add_customer"); // This URL is based on the screenshot

        // Maximize browser window
        driver.manage().window().maximize();
        
        // Test Data
        String customerName = "John Doe";
        String email = "johndoe@example.com";
        String phone = "1234567890";
        String address1 = "123 Main St";
        String fax = "987654321";
        String state = "California";
        String country = "USA";
        String mobileNo = "0987654321";
        String vatNo = "VAT12345";
        String crNo = "CR67890";
        String address2 = "Apt 4B";
        String city = "Los Angeles";
        String zipCode = "90001";

        // Locate form fields and input data
        driver.findElement(By.name("customer_name")).sendKeys(customerName);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("phone")).sendKeys(phone);
        driver.findElement(By.name("address1")).sendKeys(address1);
        driver.findElement(By.name("fax")).sendKeys(fax);
        driver.findElement(By.name("state")).sendKeys(state);
        driver.findElement(By.name("country")).sendKeys(country);
        driver.findElement(By.name("mobile_no")).sendKeys(mobileNo);
        driver.findElement(By.name("vat_no")).sendKeys(vatNo);
        driver.findElement(By.name("cr_no")).sendKeys(crNo);
        driver.findElement(By.name("address2")).sendKeys(address2);
        driver.findElement(By.name("city")).sendKeys(city);
        driver.findElement(By.name("zip_code")).sendKeys(zipCode);
        // Submit the form
        driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();

        // Close the browser after the action (optional)
        Thread.sleep(50000);
        driver.quit();
    }
	}

