public class ComparisonTest {
    public static void main(String[] args) {
        String x = "park";
        String y = "p4rk";

        //x.compareTo(y) performs a boolean operation
        //Return Value          Meaning
        //  0                   x and y are equal
        //  -1                  x is less than y
        //  1                   x is greater than y
        if (x.compareTo(y) > 0){
            System.out.println("x is greater y");
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }
}
