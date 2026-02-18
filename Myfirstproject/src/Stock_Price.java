public class Stock_Price {
    public static void main (String[] args){

    }
    public static double[] PredictStock(double[] P, int xdays) {
        if (P == null || P.length == 0){
            return new double[]{-1.0};
        }

        if (xdays < 1){
            return new double[]{-2.0};
        }

        for (int i = 0; i < P.length; i++){
            if (P[i] > 999999.99 || P[i] < 0.01){
                return new double[]{-3.0};
            }
        }
        
        double sum = 0;
        for (int i = 0; i < P.length; i++) {
            sum += (P[i] - P[i - 1]);
        }
        double change = sum / P.length - 1;

        double [] F = new double[xdays];
        for (int i = 0; i < xdays; i++) {
            F[i] = P[P.length - 1] + (change * (i + 1));
            
        }
        return F;
    }

}
