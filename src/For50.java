//infinite loop since i = i - (-10) would add to i
//therefore i > 0 will always be true

public class For50 {
    public static void main(String[] args) {
        for (int i = 50; i > 0; i -= -10){
            System.out.print(i);
        }
    }
}
