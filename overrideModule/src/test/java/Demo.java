/**
 * Created by Alisa_Demennikova on 8/4/2016.
 */
public class Demo {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.doSomething();
        BasePage basePage = new BasePage() {
            @Override
            public void doSomething() {
                System.out.println("Inner class do something");
            }
        };
        basePage.doSomething();
        basePage.doSomethingBaseRealization();

    }
}
