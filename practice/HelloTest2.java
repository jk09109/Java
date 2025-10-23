class Hello1{
    void sayHello(){
        System.out.println("hello");
    }
}

public class HelloTest2 {
    public static void main(String[] args) {
        Hello1 h1=new Hello1();
        h1.sayHello();

        Hello1 h2=new Hello1();
        h2.sayHello();
    }
}
