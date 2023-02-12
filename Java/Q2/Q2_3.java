import java.util.Scanner;
public class Q2_3 {
    public static void main(String[] args) {
        Scanner gogo = new Scanner(System.in);

        System.out.printf("연도를 입력하시오. --> ");

        int year = gogo.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("1");
        }
        else if (year % 400 == 0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }
}

