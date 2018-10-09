import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

public class NorseTestTwo {

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 8, 9};
        int[] b = {1, 2, 4, 5};

        int[] res = ArrayUtils.addAll(a, b);
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}
