package excavate.genericsExample;

public class Generics {
    public static void main(String[] args) {
        CustomArrayList<String> strings = new CustomArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add("someTwo");
        }


    }
}
