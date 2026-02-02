package operator;

public class CompoundAssignmentDemo {
    public static void main(String[] args) {

        int x = 20;
        int y = 5;

        x += y;  //  x = x + y;   //  20 + 5
        System.out.println("x += y : " + x);

        x -= y;  // x = x - y;    // 25 - 5
        System.out.println("x -= y : " + x);

        x *= y;  // x = x * y;    // 20 * 5 
        System.out.println("x *= y : " + x);

        x /= y;  // x = x / y;    // 100 / 5
        System.out.println("x /= y : " + x);
    }
}

