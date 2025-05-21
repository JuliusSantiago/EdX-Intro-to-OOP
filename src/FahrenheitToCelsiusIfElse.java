import java.util.Scanner;

public class FahrenheitToCelsiusIfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fahrenheit value:");
        int fahrenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        String day = input.next();
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.printf("%s %.1f \n", day + " Celsius: ", celsius);

        if (fahrenheit >= 70){
            System.out.println("Touch grass.");
        }
        else{
            System.out.println("Doom scroll inside the house.");
        }
    }
}
