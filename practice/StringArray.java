public class StringArray {
    public static void main(String[] args) {
        String[] browser1 = {"Google Chrome", "Microsoft Edge", "Mozilla Firefox", "Naver Whale"};
        String[] browser2 = new String[4];
        browser2[0] = "Google Chrome";
        browser2[1] = "Microsoft Edge";
        browser2[2] = "Mozilla Firefox";
        browser2[3] = "Naver Whale";

        System.out.println("browser1");
        System.out.printf("브라우저 이름: %s, 길이: %d\n", browser1[0], browser1[0].length());
        System.out.printf("브라우저 이름: %s, 길이: %d\n", browser1[1], browser1[1].length());
        System.out.printf("브라우저 이름: %s, 길이: %d\n", browser1[2], browser1[2].length());
        System.out.printf("브라우저 이름: %s, 길이: %d\n", browser1[3], browser1[3].length());

        System.out.println("browser2");
        System.out.printf("브라우저 이름: %s, 길이: %d\n", browser2[0], browser2[0].length());
        System.out.printf("브라우저 이름: %s, 길이: %d\n", browser2[1], browser2[1].length());
        System.out.printf("브라우저 이름: %s, 길이: %d\n", browser2[2], browser2[2].length());
        System.out.printf("브라우저 이름: %s, 길이: %d\n", browser2[3], browser2[3].length());
    }
}
