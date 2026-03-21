package static2.ex;

public class MathArrayUtils {
    //맴버변수없는건 생성자의미없다. 막아놓자(있다하더라도)
    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        double average = 0;

        average = (double) sum(values) /values.length;
        return average;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
