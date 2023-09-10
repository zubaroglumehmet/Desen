import java.util.Scanner;

 class Desen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int n = scan.nextInt();

        desen(n, n);
    }

    static void desen(int n, int original) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        desen(n - 5, original);

        if (n != original) {
            System.out.print(n + " ");
        }
    }
}
