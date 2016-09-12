/**
 * Created by Alisa_Demennikova on 9/12/2016.
 */
public interface PagesCreatorFactory<P extends BasePage> {
    P create();
}
