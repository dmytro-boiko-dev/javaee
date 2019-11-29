package excavate.reflectionExample;

public class ReflectionExample {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        ReflectionChecker checker = new ReflectionChecker();
        Rabbit rabbit = new Rabbit();

//      checker.showClassName(rabbit);
//      checker.showClassFields(rabbit);
//      checker.showClassMethods(rabbit);

//      checker.showFieldsAnnotations(rabbit);

//        checker.fillPrivateFields(rabbit);

        Object clone = checker.createNewObject(rabbit);
        checker.showClassName(clone);


//        System.out.println(rabbit.getRabbitName());
//        System.out.println(rabbit.getRabbitAge());

    }
}