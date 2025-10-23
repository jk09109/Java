import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("화씨온도를 입력하시오: ");
        float fahr = sc.nextFloat();

        float cels = ((float)5/9) * (fahr - 32);
        System.out.printf("화씨온도: %.1f는 섭씨온도: %.1f 입니다.", fahr, cels);
    }
}
