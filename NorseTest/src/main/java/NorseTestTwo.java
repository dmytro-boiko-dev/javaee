import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

public class NorseTestTwo {

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 8, 9};
        int[] b = {1, 2, 4, 5};

        int[] res = ArrayUtils.addAll(a, b);
        System.out.println("Raw: " + Arrays.toString(res));

        for (int i = 0; i < res.length; i++) {
            for (int j = i + 1; j < res.length; j++) {
                int cache;
                if (res[i] > res[j]) {
                    cache = res[i];
                    res[i] = res[j];
                    res[j] = cache;
                }
            }
        }
        System.out.println("Sorted: " + Arrays.toString(res));
    }
}
