import java.util.Scanner;
public class Q2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();

        if (X > 0) {
            if (Y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        }
        else{
            if (Y > 0){
                System.out.println("2");
            }
            else{
                System.out.println("3");
            }
        }
    }
}
