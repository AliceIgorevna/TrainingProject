/**
 * Created by Alisa_Demennikova on 8/5/2016.
 */
public class Demo {
    public static void main(String[] args) {
        ClassWithConstructor instance = new ClassWithConstructor(25);
        System.out.println(String.valueOf(instance.getField()));

        ClassWithConstructor copeOfInstance = new ClassWithConstructor(instance);
        System.out.println(String.valueOf(copeOfInstance.getField()));
    }
}
