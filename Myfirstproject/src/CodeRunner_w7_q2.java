public class CodeRunner_w7_q2 {
    public static void main(String[] args) {

        System.out.print(MakeSequence(5));

    }
    public static String MakeSequence(int N){
        if (N < 1) {
            return "";
        }
        String result = "";
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <=N - i + 1; j++){
                result += i;
            }

        }

        return result;
    }

}
