import java.util.Scanner
public class Q2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int M = input.nextInt();

        if (M >= 45){
            System.out.printf("%d %d",H, (M-45));
        }
        else{
            if (H == 0){
                System.out.printf("%d %d",((H+24)-1), ((M+60) - 45));
            }
            else {
                System.out.printf("%d %d", (H - 1), ((M + 60) - 45));
            }
        }
    }
}
