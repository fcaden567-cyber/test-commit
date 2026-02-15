import java.util.ArrayList;

public class CodeRunner_w8_q4 {
    public static void main(String[] args) {

        int[][] points = {
                {3, 2},
                {6, 5},
                {0, 0},
                {8, 2},
                {3, 7},
                {10, 10}
        };

        ArrayList<Integer> result = PointsInCircle(points);
        System.out.println(result); // Expected output: [0, 2, 2, 2, 1, 2]
    }
    public static ArrayList <Integer> PointsInCircle(int[][] points){
        int h = 3;
        int k = 2;
        int r = 5;

        ArrayList<Integer> output = new ArrayList<>();


        for (int i = 0; i < points.length; i++) {
            if (points[i].length != 2){
                output.add(-1);
                continue;
            }
            int x = points[i][0];
            int y = points[i][1];

            int distanceSq = (x - h) * (x - h) + (y - k) * (y - k);
            int rSq = r * r;
            if (distanceSq < rSq) {
                output.add(1);
            } else if (distanceSq == rSq) {
                output.add(0);
            } else {
                output.add(2);
            }
        }
        return output;


        
    }
}
