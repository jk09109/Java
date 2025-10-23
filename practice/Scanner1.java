import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        System.out.println("입력한 문자열: " + line);

        int num = sc.nextInt();
        System.out.println("입력한 정수: " + num);
    }
}
