package excavate.reflectionExample;

public class Rabbit {

    @Deprecated
    @RabbitAnnotation
    private String rabbitAge;

    @Deprecated
    private String rabbitName;

    public String getRabbitAge() {
        return rabbitAge;
    }

    public String getRabbitName() {
        return rabbitName;
    }

    public void jumpMove(String jump){

        System.out.println("some text");;

    }
}
