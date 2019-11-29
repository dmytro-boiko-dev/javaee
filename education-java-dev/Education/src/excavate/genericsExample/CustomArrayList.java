package excavate.genericsExample;

public class CustomArrayList<T> {
    private Object[] data = new Object[10];
    //private int length = 0;

    public void add(T element){
        data[0] = "";
        data[0] = "someOne";
    }

    public T get(int index){
        if(data.length < 0){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (T) data[index];
    }




}
