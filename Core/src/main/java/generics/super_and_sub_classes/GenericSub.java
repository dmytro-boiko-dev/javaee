package generics.super_and_sub_classes;

public class GenericSub<T, V> extends GenericSuper<T> {
    V obj2;

    GenericSub(T objT, V objV){
        super(objT);
        obj2 = objV;
    }

    V getObj2(){
        return obj2;
    }
}
