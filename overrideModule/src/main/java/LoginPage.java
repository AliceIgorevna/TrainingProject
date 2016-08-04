import java.io.IOException;

/**
 * Created by Alisa_Demennikova on 8/4/2016.
 */
public class LoginPage extends BasePage {
    public void doSomething() {
        System.out.println("LoginPage realization of abstact doSomething() of BasePage");
    }

    @Override
    public Integer doSomethingBaseRealization() throws IOException {
        System.out.println("Login page realization of doSomethingBaseRealization()");
        return 1;
    }
    // unable to override static methods

    void doSomething(String s) {
        System.out.println(s + "LoginPage realization of doSomething()  with input parameters");
    }
}
