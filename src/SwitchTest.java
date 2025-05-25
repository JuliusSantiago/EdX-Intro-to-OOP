/*
    switch (expression) {
        case value1:
            statement(s)
            break;
        case value2:
            statement(s)
            break;
        default:
            statement(s)
    }
 */

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //instantiate input variable
        System.out.print("Please enter your selection: "); //prompt user for input
        int selection = input.nextInt(); //get user input

        String menuOption; //the switch statement will assign a value to menuOption based on the user's input value

        //based on user input, the value will be passed through the switch statement to choose a case
        //default will be chosen if the value doesn't match of the case values
        switch(selection){
            case 0:
                menuOption = "Operator";
                break;
            case 1:
                menuOption = "Customer Service";
                break;
            case 2:
                menuOption = "Technical Support";
                break;
            case 3:
                menuOption = "Billing";
                break;
            case 4:
                menuOption = "Repeat Menu";
                break;
            case 5:
                menuOption = "Hang Up";
                break;
            default:
                menuOption = "Retry Selection";
                break;
        }
        System.out.println(menuOption);
    }
}
