package semester1.practice07;

import java.util.Arrays;

public class ArrayFilter {
    public int[] filter(int[] arr, int threshold) {
        int[] output = new int[0];
        for (int i : arr) {
            if (i > threshold) {
                output[output.length - 1] = i;
                output = Arrays.copyOf(output, output.length + 1);
            }
        }
        return Arrays.copyOf(output, output.length - 1);
    }

    public int[] filter(int[] arr, int min, int max) {
        int[] output = new int[0];
        for (int i : arr) {
            if ((i > min) && (i < max)) {
                output[output.length - 1] = i;
                output = Arrays.copyOf(output, output.length + 1);
            }
        }
        return Arrays.copyOf(output, output.length - 1);
    }

    public int[] filter(int[] arr, boolean keepEvens) {
        int[] output = new int[0];
        for (int i : arr) {
            if (i % 2 == 0 == keepEvens) {
                output[output.length - 1] = i;
                output = Arrays.copyOf(output, output.length + 1);
            }
        }
        return Arrays.copyOf(output, output.length - 1);
    }
}
