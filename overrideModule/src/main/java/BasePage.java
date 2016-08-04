/**
 * Created by Alisa_Demennikova on 8/4/2016.
 */
public abstract class BasePage {
    public abstract void doSomething();

    public static void doStaticSomething(){
        System.out.println("Base page static doStaticSomething()");
    }
    public void doSomethingBaseRealization(){
        System.out.println("Base page realization of doSomethingBaseRealization()");
    }
}
