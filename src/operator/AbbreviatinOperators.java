package operator;

public class AbbreviatinOperators {
    public static void main(String[] args) {

        int a = 10;

        a += 5;   // a = a + 5
        System.out.println("After += : " + a);

        a -= 3;   // a = a - 3
        System.out.println("After -= : " + a);

        a *= 2;   // a = a * 2
        System.out.println("After *= : " + a);

        a /= 4;   // a = a / 4
        System.out.println("After /= : " + a);

        a %= 3;   // a = a % 3
        System.out.println("After %= : " + a);
    }
}
