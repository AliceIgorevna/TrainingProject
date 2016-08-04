import java.util.Arrays;

/**
 * Created by Alisa_Demennikova on 8/4/2016.
 */
public final class ImmutableClass {
    private final int []theArray;
    private final Integer value;

    public ImmutableClass(int[] array, Integer value) {
        this.theArray = array.clone();
        this.value = value;
    }

    /*public static ImmutableClass createInstance(int[] array, Integer value){
        return new ImmutableClass(array, value);
    }*/

    public int[] getArray() {
        return theArray.clone();
    }

    public int getArrayLength(){
        return theArray.length;
    }

    public int getValueByNum(int number){
        return theArray[number];
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "theArray=" + Arrays.toString(theArray) + '\n' +
                ", value=" + value +
                '}';
    }
}
