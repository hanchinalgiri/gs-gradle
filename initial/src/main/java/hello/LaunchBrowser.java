package hello;

import org.joda.time.LocalTime;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LaunchBrowser {
    public static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException {

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        System.setProperty("webdriver.chrome.driver", "initial/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //Open the webPage
        driver.navigate().to("https://amazon.in");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.close();



    }
}