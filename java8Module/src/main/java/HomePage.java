import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Alisa_Demennikova on 8/30/2016.
 */
public class HomePage extends BasePage {
    public HomePage() {
        super();
    }

    @Override
    public void openPage() {
        getDriver().get("http://bt.rozetka.com.ua/washing_machines/c80124/filter/33119=40869/");
    }

}
