import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) { //단축키 psvm
        Scanner sc=new Scanner(System.in);
        int num=0, sum=0;

        for(int i=0; i<5; i++){
            System.out.printf("정수를 입력하세요: ");
            num=sc.nextInt();
            sum=sum+num;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
        }
    }
}
