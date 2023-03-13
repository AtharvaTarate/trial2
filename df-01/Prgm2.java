import java.util.*;

class Bravo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else if (num == 0) {
            System.out.println(num + " is equal to zero");
        }
    }

}
