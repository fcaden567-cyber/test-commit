public class Energy_Use {
    public static void main(String[] args){

    }
    public static double[] PredictEnergy(double[] E, int xhours) {
        if(E == null || E.length == 0){
            return new double[]{-1.0};
        }
        if(xhours < 1){
            return new double[]{-2.0};
        }

        for (int i = 0; i < E.length; i++) {
            if (E[i] < 0 || E[i] > 100){
                return new double[]{-3.0};
            }
        }

        if (E.length < 2){
            return new double[]{-4.0};
        }


        double weightedSum = 0;
        double totalWeight = 0;
        for (int i = 1; i < E.length; i++) {
            double diff = E[i] - E[i - 1];
            int weight = i;  // weight goes 1, 2, 3, ...
            weightedSum += (weight * diff);
            totalWeight += weight;
        }
        double change = weightedSum / totalWeight;

        double[] P = new double[xhours];
        double lastReading = E[E.length - 1];
        for (int i = 0; i < xhours; i++) {
            P[i] = lastReading + (change * (i + 1));
        }

        return P;
    }
}
