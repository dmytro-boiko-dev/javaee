package arrays;

public class TwoDimArrayForEach {
    public static void main(String[] args) {
        int[][] grades = {
                {57,68,92},
                {34,62,72},
                {90,63,69},
                {65,68,45},
                {56,93,95},
                {76,84,73}
        };

        System.out.println("Minimal value: " + getMinimal(grades));
    }

    public static int getMinimal(int[][] grades){
        int min = 100;
        for (int[] raw : grades){
            for (int i : raw){
                if (i < min){
                    min = i;
                }
            }
        }
        return min;
    }
}
