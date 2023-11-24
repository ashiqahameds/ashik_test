import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openchrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium jars&drivers\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
