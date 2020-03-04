package loops;

public class BreakForBlocks {
    public static void main(String[] args) {

//        boolean bool = true;
//
//        first: {
//            second: {
//                third: {
//                    System.out.println("hello ");
//
//                    if(bool) break second;
//                    System.out.println("world");
//                }
//                System.out.println("another unreachable string");
//            }
//            System.out.println("end of first example");
//        }

        // another example:

        mark:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println(i + " " + j + " inside inner cycle");
                if(j == 10) break mark; // out of both cycles
            }
        }



    }
}
