import java.util.Arrays;

public class JMock_q6 {
    public static void main(String[] args){

        System.out.println(Arrays.toString(PredictWeather(new double[]{1,2,3,4,5},-1)));

    }
    public static double[] PredictWeather(double[] T, int xdays) {
        // Test 1: Check if T is null or empty
        if (T == null || T.length == 0) {
            return new double[]{-1.0};
        }

        // Test 2: Check if xdays < 1
        if (xdays < 1) {
            return new double[]{-2.0};
        }

        // Test 3: Check for invalid temperature values
        for (int i = 0; i < T.length; i++) {
            if (T[i] < -89.2 || T[i] > 56.7) {
                return new double[]{-3.0};
            }
        }

        // Step 1: Calculate average daily change
        double sum = 0;
        for (int i = 1; i < T.length; i++) {
            sum += (T[i] - T[i - 1]);
        }
        double change = sum / (T.length - 1);

        // Step 2: Predict future temperatures
        double[] P = new double[xdays];
        double lastTemp = T[T.length - 1];
        for (int i = 0; i < xdays; i++) {
            P[i] = lastTemp + (change * (i + 1));
        }

        return P;
    }
}
