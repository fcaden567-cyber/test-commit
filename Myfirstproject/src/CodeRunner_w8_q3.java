public class CodeRunner_w8_q3 {
    public static void main(String[] args) {

        System.out.println(CalculateAngle(5,6,7));

    }
    public static double CalculateAngle(double a, double b, double c){
        if(((a + b) > c) && ((a + c) > b) && ((b + c) > a)){
            double result = (b*b + c*c - a*a) / (2*b*c);
            double CosResult = Math.cos(result);
            return Math.toDegrees(CosResult);
        }
        else{
            return -1.0;
        }



    }
}
