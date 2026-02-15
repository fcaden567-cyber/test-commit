import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String [] foods;
        int amount;

        System.out.println("Enter a mount of food");
        amount = input.nextInt();
        input.nextLine();
        foods = new String[amount];

        for (int f = 0; f < foods.length; f++) {
            System.out.println("enter a food");
            foods[f] = input.nextLine();
        }
        for (int i = 0; i < foods.length; i++){
            System.out.println(foods[i]);

        }



    }
}




