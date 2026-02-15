public class CodeRunner_w8_q1 {
    public static void main(String[] args) {

        System.out.println(CalculateExpression(1,2,3,4));

    }
    public static double CalculateExpression(double n, double x, double y, double z){
        return 7.2 * n * (Math.pow(x,2) + Math.pow(z,2) + Math.pow(y,2));

    }
}
