import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = power(n, m);
        System.out.println(k);
    }
    private static int power(int number, int exponent){
        if(exponent<1) return 1;
        return number * power(number, exponent -1);
    }
}