public class JMock_q3 {
    public static void main(String[] args){
        System.out.println(KineticEnergy(-1,8));
    }
    public static double KineticEnergy(double m, double v){
        if(m < 0 || v < 0){
            return -1;
        }
        else{
            return 0.5 * m * Math.pow(v,2);
        }
    }
}
