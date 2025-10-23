import java.util.Scanner;

public class Project1 {

    //i로 입력하면 문자열을 저장할 공간
    static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        showMenu();

        while (true) {
            System.out.print("선택: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "i":
                case "I":
                    inputString(scanner); break;
                case "o":
                case "O":
                    showInfo(); break;
                case "s":
                case "S":
                    searchString(scanner); break;
                case "r":
                case "R":
                    replaceString(scanner); break;
                case "h":
                case "H":
                    showMenu(); break;
                case "e":
                case "E":
                    System.out.println("프로그램을 종료합니다."); return;
                default:
                    System.out.println("잘못된 선택입니다."); break;
            }
            System.out.println();
        }
    }

    //기능별로 함수 분리 --> static 써주기
    //시작할 때, h 입력할 때: 메뉴 보여주기
    static void showMenu() {
        System.out.println("===메뉴===");
        System.out.println("i: 문자열 입력");
        System.out.println("o: 문자열 출력 (글자수, 단어수 포함)");
        System.out.println("s: 문자열 찾기");
        System.out.println("r: 문자열 바꾸기");
        System.out.println("h: 도움말");
        System.out.println("e: 종료");
    }

    //i: 문자열 입력
    static void inputString(Scanner scanner) {
        System.out.print("문자열을 입력하세요: ");
        text = scanner.nextLine();
    }

    //o: 문자열 출력(글자수, 단어수 포함)
    static void showInfo() {
        System.out.println("현재 문자열: " + text);
        System.out.println("글자 수: " + text.length());

        //단어 분리
        String delimiters = "\\s|,\\s*|\\.\\s*";
        String[] words = text.split(delimiters);
        System.out.println("단어 수: " + words.length);
    }

    //s: 문자열 찾기
    static void searchString(Scanner scanner) {
        System.out.print("찾을 문자열을 입력하세요: ");
        String search = scanner.nextLine();

        int count = 0;
        int index = 0;

        while (true) {
            //무한루프 방지용
            if (search.isEmpty()) break;

            index = text.indexOf(search, index);
            if (index == -1) break;

            count++;
            index += search.length();
        }

        if (count > 0) {
            System.out.println("'" + search + "'이(가) " + count + "회 존재합니다.");
        } else {
            System.out.println("문자열을 찾을 수 없습니다.");
        }
    }

    //r: 문자열 바꾸기
    static void replaceString(Scanner scanner) {
        System.out.print("바꿀 문자열을 입력하세요: ");
        String oldStr = scanner.nextLine();
        System.out.print("새 문자열을 입력하세요: ");
        String newStr = scanner.nextLine();

        //예외처리
        if (oldStr.isEmpty()) return;

        int count=0;
        int index=0;

        String changedText = text;

        //이 부분 수정하기 --> 반복문 돌면서 더 이상 수정할 게 없을 때까지 수정하고, 수정할 때마다 count 증가. indexOf 값이 -1 되면 종료.
        while (true) {
            index=changedText.indexOf(oldStr, index);
            if(index== -1) break;

            //바꿀 위치로 가서 새 문자열 넣고 뒷부분 이어붙이기
            changedText = changedText.substring(0, index) + newStr + changedText.substring(index + oldStr.length());
            count++;

            index += newStr.length(); // 교체된 문자열 길이만큼 인덱스를 이동
        }

        if (count > 0) {
            text = changedText;
            System.out.println("변경된 문자열: " + text);
            System.out.println("'" + oldStr + "'이(가) " + count + "번 바뀌었습니다.");
        } else {
            System.out.println("바뀐 게 없습니다.");
        }
    }
}