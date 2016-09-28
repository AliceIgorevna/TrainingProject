import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Alisa_Demennikova on 8/30/2016.
 */
public interface BaseOperations {

    default void clickByeButton(WebDriver driver, String xpathExpression){
       driver.findElement(By.xpath(xpathExpression)).click();
    }

    void openPage();
}
