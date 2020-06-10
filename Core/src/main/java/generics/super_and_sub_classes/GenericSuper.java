package generics.super_and_sub_classes;

public class GenericSuper<T> {

    T obj;

    GenericSuper(T ob){
        obj = ob;
    }

    T getObj(){
        return obj;
    }
}
