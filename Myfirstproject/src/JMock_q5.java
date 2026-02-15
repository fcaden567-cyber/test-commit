public class JMock_q5 {
    public static void main(String[] args){

        System.out.println(MakeSequence(5,9));

    }
    public static String MakeSequence(int S, int N){
        if(S <= 0 || N <= 0){
            return "ERROR#1";
        }
        if (N < S){
            return "ERROR#2";
        }

        String result = "";
        for (int i = S; i <= N; i++) {
            result += (i * i);
            if (i < N) {
                result += " ";  // Add space between numbers, but not at the end
            }
        }
        return result;


    }
}
