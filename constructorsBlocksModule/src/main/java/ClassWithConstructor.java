/**
 * Created by Alisa_Demennikova on 8/5/2016.
 */
public class ClassWithConstructor {
    private int field;

    public ClassWithConstructor() {
        this.field = 15;
    }

    public ClassWithConstructor(int field) {
        this.field = field;
    }

    public ClassWithConstructor(ClassWithConstructor classInstance) {
        this.field = classInstance.getField();
    }

    public int getField() {
        return field;
    }
}
