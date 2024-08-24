import java.util.*;

public class IsPrimeNum {

    public static boolean isPrime() {
        System.out.println("enter the Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 2) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        sc.close();
        return true;
    }

    public static boolean isPrime2(int number) {

        if (number == 2) {
            return true;
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}