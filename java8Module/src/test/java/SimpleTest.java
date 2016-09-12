import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Alisa_Demennikova on 8/30/2016.
 */
public class SimpleTest {
    private PagesCreatorFactory<HomePage> pagesCreator;
    //Supplier<HomePage> pagesCreator;
    //Supplier is a build-in interface that produces object of given generic type. Has method get() -> this method produces new instance of concrete class.
    // Custom analog is PagesCreatorFactory interface.
    private HomePage homePage;
    @BeforeTest
    public void setup(){
        pagesCreator = HomePage::new;
        homePage = pagesCreator.create();
        homePage.openPage();
    }
    @Test
    public void clickBueButton(){
        homePage.clickByeButton(homePage.getDriver(), ".//button[contains(text(), 'Купить')]");
    }
    @AfterTest
    public void tearDown(){
        homePage.getDriver().close();
    }
}
