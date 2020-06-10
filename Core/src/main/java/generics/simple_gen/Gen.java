package generics.simple_gen;

public class Gen<T> {
    T obj1;

    public Gen(T obj){
        this.obj1 = obj;
    }

    public T getObj1(){
        return obj1;
    }

    public void showType(){
        System.out.println("Type of T is: " + obj1.getClass().getName());
    }
}
