public class CodeRunner_w8_q2 {
    public static void main(String[] args) {
        System.out.println(PMT(50000,6,10));

    }
    public static double PMT (double P, double r, double n){
        double newR = r/100;
        double newN = n * 12;
        double result = (P * newR * Math.pow(1+newR,newN)) / Math.pow(1+newR,newN) - 1;
        return result;
    }
}