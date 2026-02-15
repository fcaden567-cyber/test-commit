public class CodeRunner_w15_q1 {
    public static void main(String[] args) {

        System.out.println(JoulesToWattHours(30));
    }
    static double JoulesToWattHours(double j){
        double joules = 0;
        if(j <= 0){
            return -1;
        }
        else if (j > 1000) {
            return -2;
        }
        else{
            joules = j/3600;

        }
        return joules;

    }

}
