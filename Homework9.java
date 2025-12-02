import java.io.*;
import java.util.*;

public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> db = new HashMap<>();

        // 1. db.txt 파일 읽어서 HashMap에 저장
        try (Scanner fileScanner = new Scanner(new File("db.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+"); // 공백 구분
                if (parts.length == 2) {
                    String id = parts[0].trim();
                    String pw = parts[1].trim();
                    db.put(id, pw);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("db.txt 파일이 존재하지 않습니다.");
            return;
        }

        // 2. 로그인 기능
        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String inputId = sc.nextLine().trim();

            // id 존재 여부 확인
            if (!db.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String inputPw = sc.nextLine().trim();

            // 비밀번호 일치 확인
            if (!db.get(inputId).equals(inputPw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            // id + pw 일치 → 로그인 성공
            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }

        sc.close();
    }
}
