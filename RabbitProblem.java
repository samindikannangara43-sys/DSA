import java.util.Scanner;

public class RabbitProblem {

    static int rabbitPairs(int n) {
        if (n == 0 || n == 1)
            return 1;
        return rabbitPairs(n - 1) + rabbitPairs(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int n = sc.nextInt();

        System.out.println("Number of rabbit pairs after " + n + " months: " + rabbitPairs(n));
    }
}