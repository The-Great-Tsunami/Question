import java.util.Scanner;
public class Q2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int min = (A * 60) + B;
        min += C;

        int H = (min / 60);
        int M = (min % 60);

        if (H >= 24) {
            H %= 24;
            System.out.printf("%d %d", H, M);
        } else {
            System.out.printf("%d %d", H, M);
        }
    }
}