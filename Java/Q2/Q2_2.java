import java.util.Scanner;
public class Q2_2 {
    public static void main(String[] args){
        Scanner good = new Scanner(System.in);

        System.out.printf("점수를 입력하시오.--> ");
        int point = good.nextInt();

        if (point >= 90 && point <= 100){
            System.out.println("A");
        }
        else if (point >= 80 && point <= 89) {
            System.out.println("B");
        }
        else if (point >= 70 && point <= 79) {
            System.out.println("C");
        }
        else if (point >= 60 && point <= 69) {
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
