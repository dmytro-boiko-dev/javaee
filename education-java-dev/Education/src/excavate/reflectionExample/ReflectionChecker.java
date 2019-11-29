package excavate.reflectionExample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionChecker {
    public void showClassName(Object object){
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassFields(Object object){
        Class clazz = object.getClass();
        Field [] fields = clazz.getDeclaredFields(); //<-- return array of objects (type Field)
        for(Field field : fields){
            System.out.println(field.getName());
        }
    }

    public void showClassMethods(Object object){
        Class clazz = object.getClass();
        Method [] methods = clazz.getMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }
    }

    public void showFieldsAnnotations(Object object){
        Class clazz = object.getClass();
        Field [] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            Annotation [] annotations = field.getAnnotations();
            for(Annotation annotation : annotations){
                System.out.println(field.getName() + " : " + annotation.toString());
            }
        }
    }

    public void fillPrivateFields(Object object) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field [] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            Annotation annotation = field.getAnnotation(RabbitAnnotation.class);
            if(annotation == null){
                continue;
            }

            field.setAccessible(true); // make private -> public
            field.set(object, "Field");
            field.setAccessible(false);


        }
    }

    //this for creation of object of unknown class
    public Object createNewObject(Object object) throws IllegalAccessException, InstantiationException {
        Class clazz = object.getClass();
        return clazz.newInstance();
    }

}
