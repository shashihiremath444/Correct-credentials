package confirmtkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get("https://www.confirmtkt.com/rbooking-d/");
    }

    public void login(String mobileNumber) throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='LOGIN']")).click();
        // Simulate entering mobile number and waiting for OTP
        // You can add mobile number input code here if needed
        Thread.sleep(30000); // Wait for manual OTP entry
    }
}
