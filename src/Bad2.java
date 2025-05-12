public class Bad2 {
    public static void main(String[] args) {
        int a = 1331;
        int b = 1; //runtime error, changed 0 to 1 so we don't get a / by zero error
        System.out.println("Welcome to \nCS 1331!");
        int c = a / b;
        System.out.println("c is equal to: " + c);
    }
}