import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("prime, standard, economy 중 한 가지를 입력하세요: ");
        String zone = sc.next();

        if(zone.compareTo("prime")==0){
            System.out.println("프라임 존 표값은 11000원 입니다.");
        }
        else if(zone.compareTo("standard")==0){
            System.out.println("스탠다드 존 표값은 10000원 입니다.");
        }
        else if(zone.compareTo("economy")==0){
            System.out.println("이코노미 존 표값은 9000원 입니다.");
        }
        else{
            System.out.println("좌석 종류를 잘못 입력하셨습니다.");
        }
    }
}
