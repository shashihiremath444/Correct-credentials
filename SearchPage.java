package confirmtkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDestinations() {
        driver.findElement(By.xpath("//label[text()='From']")).click();
        driver.findElement(By.xpath("//a[text()='SBC  - Bangalore City Junction']")).click();
        driver.findElement(By.xpath("//label[text()='To']")).click();
        driver.findElement(By.xpath("//a[text()='MMCT  - Mumbai Central']")).click();
        driver.findElement(By.xpath("//span[text()='SEARCH']")).click();
    }
}
