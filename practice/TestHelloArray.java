class Hello2{
    String toWhom = "world";
    Hello2() { }
    Hello2(String whom) {setWhom(whom);}
    void setWhom(String whom) {toWhom = whom;}
    void sayHello(){
        System.out.println("hello " + toWhom);
    }
}

public class TestHelloArray {
    public static void main(String[] args) {
        Hello2[] hArr = new Hello2[3];
        hArr[0] = new Hello2();
        hArr[1] = new Hello2("홍길동");
        hArr[2] = new Hello2("허균");

        hArr[0].sayHello();
        hArr[1].sayHello();
        hArr[2].sayHello();
    }
}
