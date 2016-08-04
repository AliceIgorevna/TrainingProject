import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Alisa_Demennikova on 8/4/2016.
 */
public class Demo {
    public static void main(String[] args) {
        // Demonstrate that mutable class is not always good practice by usage as key in Set collection.
        // Because, after writing as a key, it can change its state  mutableClass.setString("moo")
        // so then contains() and next() would pass wrong results
        MutableClass mutableClass = new MutableClass("Alisa");
        Set<MutableClass> hashSet = new HashSet<>();
        hashSet.add(mutableClass);
        mutableClass.setString("moo");
        System.out.println(hashSet.contains(mutableClass));
        System.out.println(hashSet.size());
        System.out.println(hashSet.iterator().next());

        int[] array = {2, 3, 4, 5, 2, 1};
        int[] array1 = {23, 32, 45, 52, 29, 13};
        ImmutableClass immutableClass = new ImmutableClass(array, 12);
        System.out.println(immutableClass.toString());
        System.out.println(immutableClass.getArrayLength());
        System.out.println(immutableClass.getValueByNum(3));

        try {
            Class c = Class.forName("ImmutableClass");
            Constructor constructor = ImmutableClass.class.getConstructor(int[].class, Integer.class);
            ImmutableClass myObject = (ImmutableClass) constructor.newInstance(array1, 17);
            Method method = c.getDeclaredMethod("toString");
            System.out.println(method.invoke(myObject, null));

        } catch (ClassNotFoundException e) {
            System.out.println("ОПАЧКИ!!!!!!");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
