package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    public static int sum(int[] values) {
        int total = 0;
        for(int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
//        int result = 0;
//        for(int i=0; i<array.length; i++) {
//            result += array[i];
//        }
//        return (double)result / array.length;

        return (double) sum(values) / values.length;

    }

    public static int min(int[] values) {
        int minValue = values[0];
        for(int value : values) {
            if(value < minValue) {
                minValue = value;
            }
        }
        return minValue;

    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for(int value : values) {
            if(value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
