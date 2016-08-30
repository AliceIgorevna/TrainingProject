import org.openqa.selenium.WebDriver;

/**
 * Created by Alisa_Demennikova on 8/30/2016.
 */
public abstract class BasePage implements BaseOperations {
    public WebDriver driver;
    public BasePage() {
        driver = DriverUtil.getInstance();
    }
}
