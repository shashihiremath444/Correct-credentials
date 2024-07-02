package confirmtkt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {
    private WebDriver driver;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTrainAndClass() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");

        driver.findElement(By.xpath("//div[contains(@class, 'train-block')][.//div[contains(text(), '11302 -') and contains(text(), 'udyan exp')]]/following-sibling::div[@style='padding-bottom: 50px;']//div[@class='availability-cache']//div[@class='avail-block']//div[@class='avail-cls']//span[text()='3A']")).click();
        driver.findElement(By.xpath("//*[@id='3A']/div[1]/div/div[3]/div")).click();
        Thread.sleep(10000); // Wait for manual IRCTC ID entry
    }

    public void enterPassengerDetails() {
        driver.findElement(By.xpath("//span[text()='Male']")).click();
        driver.findElement(By.id("passengerName")).sendKeys("Shashidhar");
        driver.findElement(By.id("passengerAge")).sendKeys("24");

        Select ddown = new Select(driver.findElement(By.id("berth-pref")));
        ddown.selectByVisibleText("Lower Berth");

        driver.findElement(By.xpath("//span[text()='Save']")).click();
    }

    public void proceedToPayment() {
        driver.findElement(By.id("email")).sendKeys("shashihiremath444@gmail.com");
        driver.findElement(By.xpath("//div[text()='Pay no charges when ticket is cancelled']")).click();
        driver.findElement(By.xpath("//div[text()='PROCEED']")).click();
    }
}
