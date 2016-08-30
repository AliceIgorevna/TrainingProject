import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Alisa_Demennikova on 8/30/2016.
 */
public class DriverUtil {
    private static WebDriver driver;

    private DriverUtil(){}

    public static synchronized FirefoxDriver getInstance(){
        if(driver == null){
            driver = new FirefoxDriver();
        }
        return (FirefoxDriver) driver;
    }
}
