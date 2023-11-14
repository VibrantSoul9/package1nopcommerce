import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class nopcomtest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        //launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //open the URL into browser
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();

        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //Get the tittle of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get current URL
        System.out.println("The current url : " + driver.getCurrentUrl());

        //Get page source
        System.out.println(driver.getPageSource());

        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        driver.navigate().to(loginUrl);
        System.out.println("Get current Url " + driver.getCurrentUrl());

        //navigate backward
        driver.navigate().back();
        System.out.println("Get current Url " + driver.getCurrentUrl());

        //forward
        driver.navigate().forward();
        System.out.println("Get current Url " + driver.getCurrentUrl());

        //refresh
        driver.navigate().refresh();

        //find email field element and type the email
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("prime123");

        //find login link element and click on it
        WebElement loginlink =  driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //close
        driver.quit();
    }
}



