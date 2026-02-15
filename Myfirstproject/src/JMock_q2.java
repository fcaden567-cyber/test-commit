public class JMock_q2 {
    public static void main(String[] args) {
        System.out.println(B(0,1.70));

    }
    public static double B(double w, double h){
        if (w <= 0 || h <= 0){
            return -1;
        }
        else{
            return w/Math.pow(h,2);
        }
    }
}
