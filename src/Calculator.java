import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("List of operations: add subtract multiply divide alphabetize");
        Scanner input = new Scanner (System.in);   //create Scanner object
        System.out.println("Enter an operation: ");
        String selection = input.next();   //get user input for operation to perform
        String error = "Invalid input entered. Terminating..."; //error message

        switch(selection.toLowerCase()){
            case "add":
                System.out.println("Enter two integers: ");
                //check for valid input, looking for two integers
                if(input.hasNextInt()){
                    int input1 = input.nextInt();
                    if(input.hasNextInt()){
                        int input2 = input.nextInt();
                        System.out.println("Answer: " + (input1 + input2));
                    } else{
                        System.out.println(error);
                    }
                } else{
                    System.out.println(error);
                }
                break;
            case "subtract":
                System.out.println("Enter two integers: ");
                //check for valid input, looking for two integers
                if(input.hasNextInt()){
                    int input1 = input.nextInt();
                    if(input.hasNextInt()){
                        int input2 = input.nextInt();
                        System.out.println("Answer: " + (input1 - input2));
                    } else{
                        System.out.println(error);
                    }
                } else{
                    System.out.println(error);
                }
                break;
            case "multiply":
                System.out.println("Enter two doubles: ");
                //check for valid input, looking for two integers
                if(input.hasNextDouble()){
                    double input1 = input.nextDouble();
                    if(input.hasNextDouble()){
                        double input2 = input.nextDouble();
                        System.out.printf("Answer: %.2f\n" + (input1 * input2));
                    } else{
                        System.out.println(error);
                    }
                } else{
                    System.out.println(error);
                }
                break;
            case "divide":
                System.out.println("Enter two doubles: ");
                //check for valid input, looking for two integers
                if(input.hasNextDouble()){
                    double input1 = input.nextDouble();
                    if(input.hasNextDouble()){
                        double input2 = input.nextDouble();
                        //check that divisor is not zero
                        if(input2 != 0){
                            System.out.printf("Answer: %.2f\n" + (input1 * input2));
                        } else{
                            System.out.println(error);
                        }
                    } else{
                        System.out.println(error);
                    }
                } else{
                    System.out.println(error);
                }
                break;
            case "alphabetize":
            
                break;
            default:
                break;
        }
    }
}
