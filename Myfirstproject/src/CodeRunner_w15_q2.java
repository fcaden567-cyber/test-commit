public class CodeRunner_w15_q2 {
    public static void main(String[] args) {
        Quadrant("1","2");
    }
    public static int Quadrant(String x, String y){
        if((x == null || y == null) && (x.isEmpty() || y.isEmpty()) && (x.contains(" ") || x.contains(" "))){
            return -1;
        }
        int x1;
        int y1;

        try {
            x1 = Integer.parseInt(x);
            y1 = Integer.parseInt(y);
        }
        catch (Exception e){
            return -2;
        }
        if (x1 == 0 && y1 == 0){
            return 0;
        }
        if (x1 > 0 && y1 > 0){
            return 1;
        }
        else if (x1 < 0 && y1 > 0){
            return 2;
        }
        else if (x1 < 0 && y1 < 0){
            return 3;
        }
        else {
            return 4;
        }
    }
}
