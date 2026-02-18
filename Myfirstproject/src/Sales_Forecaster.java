public class Sales_Forecaster {
    public static void main(String[] args) {

    }
    public static double[] PredictSales(double[] S, int xdays) {
        if (S == null || S.length == 0){
            return new double[]{-1};
        }
        if(xdays < 1){
            return new double[]{-2.0};
        }

        for (int i = 0; i < S.length; i++){
            if (S[i] < 0 || S[i] > 50000){
                return new double[]{-3.0};
            }
        }

        double sum = 0;
        for (int i = 0; i < S.length; i++){
            sum += (S[i] - S[i-1]);
        }

        double change = sum / (S.length - 1);

        double P [] = new double[xdays];
        for (int i = 0; i < xdays; i++){
            P[i] = S[S.length -1] + (change * (i + 1));

        }
        return P;
    }
}
