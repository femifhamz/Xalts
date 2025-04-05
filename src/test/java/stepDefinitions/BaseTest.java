package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class BaseTest {
     WebDriver driver;

    
    public void initializeDriver() {
        // Set up WebDriver (example: ChromeDriver)
        driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    // public void tearDown() {
    //     if (driver != null) {
    //         driver.quit();
    //     }
    // }
}
