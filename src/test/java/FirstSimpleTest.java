import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Artmac on 13.04.2018.
 */
public class FirstSimpleTest {
    @Test
     public void openWebPage()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://yandex.ru");
        Thread thread = Thread.currentThread();
        thread.sleep(10000);
        driver.close();

    }

}
