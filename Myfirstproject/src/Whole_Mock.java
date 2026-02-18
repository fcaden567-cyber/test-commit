import java.util.Arrays;

public class Whole_Mock {
    public static void main(String[] args){

        System.out.println(ClassifyTemp(9));
        System.out.println(countEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(MakeCubes(2,5));
        System.out.println(validCoordinates(-200,0,-110,0));
        System.out.println(Arrays.toString(PredictionPopulation(new double[]{1000,1200,1500,1800},3)));


    }
    static double distance(double x, double y){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    static String ClassifyTemp(double t){
        if (t <= 0){
            return "FREEZING";
        }
        else if ((t > 0) && (t <= 10)) {
            return "COLD";
        }
        else if (t > 10 && t <= 25) {
            return "WARM";
        }
        else{
            return "HOT";
        }

    }
    public static int countEven(int[] arr) {
        if (arr == null) {
            return -1;
        }

        if (arr.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }


        }
        return count;
    }
    static String MakeCubes(int S, int N){
        if (S <= 0 || N <= 0){
            return "ERROR#1";
        }

        if (N < S){
            return "ERROR#2";
        }

        String result = "";
        for (int i = S; i <= N; i++) {
            result += (i * i * i);
            if (i < N) {
                result += " ";  // Add space between numbers, but not at the end
            }
        }
        result.trim();
        return result;
    }
    static int validCoordinates(int x1, int y1, int x2, int y2){
        boolean point1Valid = (x1 >= -100 && x1 <= 100) && (y1 >= -100 && y1 <= 100);
        boolean point2Valid = (x2 >= -100 && x2 <= 100) && (y2 >= -100 && y2 <= 100);

        if (point1Valid && point2Valid){
            return 1;
        }
        else if (point1Valid) {
            return 2;
        }
        else if (point2Valid) {
            return 3;

        }
        else{
            return 4;
        }

    }
    static double[] PredictionPopulation(double[] P, int years){
        if (P == null || P.length < 2){
            return new double[]{-1.0};
        }
        if (years < 1){
            return new double[]{-2.0};
        }

        for (int i = 0; i < P.length; i++) {
            if (P[i] < 0){
                return new double[]{-3.0};
            }
        }

        double sum = 0;
        for (int i = 1; i < P.length; i++) {
            sum += (P[i] - P[i - 1]);
        }
        double change = sum / (P.length - 1);

        double [] R = new double[years];
        double lastpopulation =  P[P.length - 1];

        for (int i = 0; i < years; i++) {
            R[i] = lastpopulation + change * (i + 1);

        }
        return R;
    }

}
