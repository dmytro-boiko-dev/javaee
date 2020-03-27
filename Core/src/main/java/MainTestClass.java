public class MainTestClass {
    public static void main(String... args) {


        int[] origin = {3, 0, 8, 0, 5, 9, 9, 0};
        int[] buffer = {-1, -1, -1, -1, -1, -1, -1, -1};

        int counter = 0;
        int repeat = -1;

        for (int i = 0; i < origin.length - 1; i++) {

            if (repeat == origin[i]) {
                repeat = -1;
                continue;
            }

            counter = 0;

            for (int j = 0; j < origin.length - 1; j++) {

                if (origin[i] == origin[j]) {
                    buffer[i] = origin[i];
                    counter++;
                }

                if (counter == 2) {
                    repeat = origin[i];
                }
            }

        }

        System.out.println("Origin:");
        for (int el : origin) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("Buffer:");
        for (int el : buffer) {
            System.out.print(el + " ");
        }

    }
}