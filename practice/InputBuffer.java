import java.util.Scanner;

public class InputBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println("첫 번째 문자열 " + s);

        int n = sc.nextInt();
        System.out.println("출력 정수: " + n);

        String s1 = sc.nextLine();
        System.out.println("나머지 문자열: " + s1);
    }
}
