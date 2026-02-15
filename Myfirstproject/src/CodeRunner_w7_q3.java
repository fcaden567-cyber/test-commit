public class CodeRunner_w7_q3 {
    public static void main(String[] args) {

    }
    public static String CalculatedGradeLetter(String strGrade, String strBonus) {
        if (strGrade == null || strBonus == null) {
            return ("-1");
        } else if (strGrade == " " || strBonus == " ") {
            return ("-2");
        } else {
            try {
                double grade = Double.parseDouble(strGrade);
                double bonus = Double.parseDouble(strBonus);
                double total = grade + bonus;

                if (total >= 70) {
                    System.out.println("yes");
                    return ("A");
                } else if (total >= 60) {
                    return ("B");
                } else if (total >= 50) {
                    return ("C");
                } else if (total >= 40) {
                    return ("D");
                } else {
                    return ("F");

                }
            } catch (Exception e) {
                return ("-4");
            }
        }
    }
}
