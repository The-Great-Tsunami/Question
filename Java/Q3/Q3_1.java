import java.util.Scanner;
public class Q2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("A를 입력하시오.");
        int A = input.nextInt();
        System.out.printf("B를 입력하시오.");
        int B = input.nextInt();
        System.out.printf("A는 %d, B는 %d\n", A, B);


        if (A > B) {
            System.out.println(">");
        }
        else if (A < B){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
    }

}

