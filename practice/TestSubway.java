class Subway{
    int line;

    void setLine(int l){
        line = l;
    }

    void run(){
        System.out.println("Line " + line + " runs.");
    }
}
public class TestSubway {
        public static void main(String[] args) {
        Subway mySub = new Subway();
        mySub.setLine(3);
        mySub.run();
    }
}