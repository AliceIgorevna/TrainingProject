import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Alisa_Demennikova on 8/30/2016.
 */
public interface BaseOperations {
    default void clickBueButton(WebDriver driver, By elementXpath){
       driver.findElement(elementXpath).click();
    }
    void openPage();
}
