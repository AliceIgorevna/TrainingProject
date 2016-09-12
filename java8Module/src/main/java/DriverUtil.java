import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Alisa_Demennikova on 8/30/2016.
 */
public class DriverUtil {
    private static WebDriver driver;

    private DriverUtil(){}

    public static synchronized ChromeDriver getInstance(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "C:/Users/Alisa_Demennikova/IdeaProjects/Reminding/java8Module/src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return (ChromeDriver) driver;
    }
}
