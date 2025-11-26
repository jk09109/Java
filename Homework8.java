import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        // 1. HashMap 생성 및 데이터 저장
        HashMap<String, String> map = new HashMap<>();
        map.put("myId", "myPass");
        map.put("myId2", "myPass2");
        map.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            // 2. ID 입력 및 공백 제거
            System.out.print("id : ");
            String id = scanner.nextLine().trim();

            // 3. ID 존재 여부 확인
            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue; // 루프 처음으로 돌아감
            }

            // 4. Password 입력 및 공백 제거 (ID가 존재할 때만 실행됨)
            System.out.print("password : ");
            String password = scanner.nextLine().trim();

            // 5. 비밀번호 일치 여부 확인
            if (!map.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break; // 로그인 성공 시 반복문 종료
            }
        }

        scanner.close();
    }
}