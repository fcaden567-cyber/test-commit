import java.util.ArrayList;

public class CodeRunner_w15_q3 {
    public static void main(String[] args) {




    }
    public static ArrayList<Double> CToF(ArrayList<String> c){
        ArrayList<Double> result = new ArrayList<>();

        for(int i = 0; i < c.size(); i++){
            if(c.get(i) == null || c.get(i).isEmpty()){
                return null;
            }
            try{
                double celsius = Double.parseDouble(c.get(i));
                double fahrenheit = (celsius * 9/5) + 32;
                result.add(fahrenheit);
            } catch (NumberFormatException e){
                return(new ArrayList<Double>());

            }

        }
        return result;
    }
}
