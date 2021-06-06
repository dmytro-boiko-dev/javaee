package arrays;

public class MatrixExample {
    public static void main(String[] args) {

        // 2 x 2
        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
// ===================================================================================================
        // 3 x 3
        int[][] arrs = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arrs[i][j] + " ");
//            }
//            System.out.println();
//        }


        // 7 x 6
        int[][] bigArray = {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, 32, 33, 34, 35},
                {36, 37, 38, 39, 40, 41, 42}
        };

//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print(bigArray[i][j] + " ");
//            }
//            System.out.println();
//        }

        // empty array
        int[][] empty = new int[5][5];

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(empty[i][j] + " ");
//            }
//            System.out.println();
//        }

        // length
        int[][] twoDimArray = {
                {5, 7, 3, 17},
                {7, 0, 1, 12, 5},
                {8, 1, 2, 3, 3, 1, 5, 6}};

        // wrong
//        System.out.println("rows " + twoDimArray.length);

        // correct
//        System.out.println("length #1: " + twoDimArray[0].length );
//        System.out.println("length #2: " + twoDimArray[1].length );
//        System.out.println("length #3: " + twoDimArray[2].length );

// ===================================================================================================
        // chess board
        char[][] chessBoard = new char[8][8];

//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//
//                if ((i + j) % 2 == 0){
//                    chessBoard[i][j] = 'W';
//                } else {
//                    chessBoard[i][j] = 'B';
//                }
//
//                System.out.print( chessBoard[i][j] + " ");
//            }
//            System.out.println();
//        }

// ===================================================================================================
        // three dim
        boolean[][][] parking = new boolean[3][3][5];

//        parking[0][0][3] = true;
//        parking[0][1][0] = true;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Floor #" + i);
//            for (int j = 0; j < 2; j++) {
//                for (int k = 0; k < 5; k++) {
//                    System.out.print("array[" + i + "][" + j + "][" + k + "] = " + parking[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//        }

// ===================================================================================================
        // task
        /*
           1 0 0
           0 1 0
           0 0 1
         */

        int[][] slash = new int[10][10];

        // input
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (slash[i] == slash[j]){
//                    slash[i][j] = 1;
//                }
//            }
//        }

        // output
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(slash[i][j] + " ");
//            }
//            System.out.println();
//        }

// ===================================================================================================
        // transparent array

        // 2x2
//        int[][] input = {
//                {2, 3},
//                {4, 5}
//        };

//        System.out.println("normal output 2x2:");
//        for (int i = 0; i < input.length; i++) {
//            for (int j = 0; j < input[0].length; j++) {
//                System.out.print(input[i][j] + " ");
//            }
//            System.out.println();
//        }

        // transfer 2x2
//        for (int i = 0; i < input[0].length; i++) {
//            for (int j = 0; j < input[0].length; j++) {
//
//                if (!(input[i] == input[j])) {
//                    int buffer = input[0][i];
//                    input[0][i] = input[i][0];
//                    input[i][0] = buffer;
//                }
//            }
//        }

//        System.out.println("transferred 2x2 output:");
//        for (int i = 0; i < input.length; i++) {
//            for (int j = 0; j < input[0].length; j++) {
//                System.out.print(input[i][j] + " ");
//            }
//            System.out.println();
//        }


// ===================================================================================================
        // 5x2
//        int[][] input = {
//                {0, 1},
//                {2, 3},
//                {4, 5},
//                {6, 7},
//                {8, 9}
//        };
//
//        int[][] turned = new int[2][5];
//
//        System.out.println("normal output 5x2:");
//        for (int i = 0; i < input.length; i++) {
//            for (int j = 0; j < input[0].length; j++) {
//                System.out.print(input[i][j] + " ");
//            }
//            System.out.println();
//        }

        // transfer 5x2 to 2x5
//        for (int i = 0; i < turned.length; i++) {
//            for (int j = 0; j < turned[0].length; j++) {
//                turned[i][j] = input[j][i];
//            }
//        }
//
//        System.out.println("transferred 5x2 to 2x5 output:");
//        for (int i = 0; i < turned.length; i++) {
//            for (int j = 0; j < turned[0].length; j++) {
//                System.out.print(turned[i][j] + " ");
//            }
//            System.out.println();
//        }


// ===================================================================================================

        // M x N

        int n = 9;
        int m = 2;

        int[][] original = new int[n][m];
        int[][] changed = new int[m][n];

        // fill original
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                original[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("normal output 5x2:");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

        // transfer NxM to MxN
        for (int i = 0; i < changed.length; i++) {
            for (int j = 0; j < changed[0].length; j++) {
                changed[i][j] = original[j][i];
            }
        }

        System.out.println("Transferred NxM to MxN output:");
        for (int i = 0; i < changed.length; i++) {
            for (int j = 0; j < changed[0].length; j++) {
                System.out.print(changed[i][j] + " ");
            }
            System.out.println();
        }

    }
}
