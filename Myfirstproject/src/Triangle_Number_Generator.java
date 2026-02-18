public class Triangle_Number_Generator {
    public static void main(String[] args){
        System.out.println(MakeTriangle(5,9));

    }
    public static String MakeTriangle(int S, int N) {

        if(S < 0 || N < 0){
            return "ERROR#1";
        }

        if(N < S){
            return "ERROR#2";
        }

        String T = "";
        for (int i = S; i <= N; i++) {
            T += i * (i + 1) / 2;
            if (i < N){
                T += " ";
            }

        }
        return T;
    }
}
