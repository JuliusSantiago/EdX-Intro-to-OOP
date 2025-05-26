//if stuck in an infinite loop, use ctrl + c to terminate the code

public class HelloWorldLoop{
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10){
            System.out.println("Hello World!\nCounter: " + counter);
            counter++;
        }
    }
}