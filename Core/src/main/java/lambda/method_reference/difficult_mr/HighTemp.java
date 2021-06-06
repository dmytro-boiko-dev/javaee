package lambda.method_reference.difficult_mr;

public class HighTemp {
    int highTemp;

    HighTemp(int ht){
        highTemp = ht;
    }

    boolean sameTemp(HighTemp ht2){
        return highTemp == ht2.highTemp;
    }

    boolean lessThenTemp(HighTemp ht2){
        return highTemp < ht2.highTemp;
    }
}
