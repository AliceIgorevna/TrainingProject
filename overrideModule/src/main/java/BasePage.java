
/**
 * Created by Alisa_Demennikova on 8/4/2016.
 */
public abstract class BasePage {
    public abstract void doSomething();

    public static void doStaticSomething(){
        System.out.println("Base page static doStaticSomething()");
    }
    protected Object doSomethingBaseRealization() throws Exception{
        System.out.println("Base page realization of doSomethingBaseRealization()");
        return 1;
    }
}
