import java.util.Scanner;

public class InputInt7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;

        do{
            System.out.print("정수 한 개를 입력하세요: ");
            num=sc.nextInt();
            if(num == 0){
                continue;
            }
            else{
                System.out.println(num);
            }
        }while(num<100);
    }
}
