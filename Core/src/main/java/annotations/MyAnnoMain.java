package annotations;

import java.lang.reflect.Method;

public class MyAnnoMain {
    public static void main(String[] args) {
        myMethod();
    }

    @MyAnnotation(str = "my annotation", value = 50)
    public static void myMethod(){
        MyAnnoMain object = new MyAnnoMain();

        try{
            Class<?> c = object.getClass();
            Method m = c.getMethod("myMethod");
            MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);

            System.out.println(myAnnotation.str() + "; " + myAnnotation.value());

        } catch (NoSuchMethodException e){
            System.out.println(e);
        }
    }

}
