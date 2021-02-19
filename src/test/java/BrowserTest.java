import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void myFirstTest() {
        WebDriver driver = new ChromeDriver();
    }

}
