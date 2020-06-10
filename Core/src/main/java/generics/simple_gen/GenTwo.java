package generics.simple_gen;

public class GenTwo<T, V> {
    T obj1;
    V obj2;

    public GenTwo(T obj1, V obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1(){
        return obj1;
    }

    public V getObj2(){
        return obj2;
    }

    public void showTypes(){
        System.out.println("Type of T is: " + obj1.getClass().getName());
        System.out.println("Type of V is: " + obj2.getClass().getName());
    }
}
