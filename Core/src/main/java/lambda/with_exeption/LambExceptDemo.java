package lambda.with_exeption;

public class LambExceptDemo {
    public static void main(String[] args) throws CustomException {

        Double[] dArray = {3.14, 14.88, 19.84, 36.6};

        DoubleFuncInter inter = (arr) -> {
            double result = 0;

            if (arr.length == 0){
                throw new CustomException();
            }

            for (int i = 0; i < arr.length; i++) {
                result = result + arr[i];
            }

            return result / arr.length;
        };

        System.out.println("Normal call:");
        System.out.println(inter.func(dArray));

        System.out.println("Exception call:");
        System.out.println(inter.func(new Double[0]));

    }
}
