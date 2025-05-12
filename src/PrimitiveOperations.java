public class PrimitiveOperations {
    public static void main(String[] args) {
        int integerNumber = 5;              //declare and initialize first variable as an integer
        float floatNumber = 10;             //declare and initialize second variable as a float
        System.out.println(integerNumber);  //print first number
        System.out.println(floatNumber);    //print second number
        float multipliedNumber = integerNumber * floatNumber;   //multiply first and second number
        System.out.println(multipliedNumber);                   //print multiplied number
        float castFirstNumber = (float) integerNumber;
        System.out.println(castFirstNumber);
        int castSecondNumber = (int) floatNumber;
        System.out.println(castSecondNumber);
        char someChar = 74;
        System.out.println(someChar);
        char lowerSomeChar = (char)((int)someChar+32);
        System.out.println(lowerSomeChar);
    }
}
