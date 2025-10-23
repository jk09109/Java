import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;

        for (int i=0;i<5;i++){
            System.out.print("정수를 입력하세요: ");
            int numin = sc.nextInt();
            sum = sum + numin;
            System.out.printf("이때까지 입력한 정수의 합: %d\n", sum);
        }
    }
}
