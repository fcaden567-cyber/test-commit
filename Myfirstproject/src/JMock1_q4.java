public class JMock1_q4 {
    public static void main(String[] args){

        System.out.println(ValidPoints(0,0,101,0));

    }
    public static int ValidPoints(int x1,int y1, int x2,int y2){
        boolean point1Valid = (x1 >= -100 && x1 <= 100) && (y1 >= -100 && y1 <= 100);
        boolean point2Valid = (x2 >= -100 && x2 <= 100) && (y2 >= -100 && y2 <= 100);

        if(point1Valid && point2Valid){
            return 1;
        }
        else if (point1Valid) {
            return 2;
        }
        else if (point2Valid) {
            return 3;
        }
        else{
            return 4;
        }
    }
}
