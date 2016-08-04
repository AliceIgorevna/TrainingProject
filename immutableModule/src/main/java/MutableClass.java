/**
 * Created by Alisa_Demennikova on 8/4/2016.
 */
public class MutableClass {
    private String string;

    public MutableClass(String s) {
        this.string = s;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        else if (o == null || !(o instanceof MutableClass))
            return false;
        else {
            final MutableClass other = (MutableClass) o;
            if (string == null)
                return (other.string == null);
            else
                return (string == other.string);
        }
    }

    public int hashCode() {
        return (string != null ? string.hashCode() : 0);
    }

    public String toString() {
        return string;
    }
}
