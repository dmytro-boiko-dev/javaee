package excavate.HashCodeAndEquals;

public class HashClass {
    private int number;

    public HashClass(int number) {
        this.number = number;
    }

    public int hashCodeGetMethod(){
        return number;
    }
}
