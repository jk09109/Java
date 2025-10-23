class Coffee{
    String origin;
    int degreeOfRoast;
    String grade;

    Coffee(String o) {origin = o;}
    Coffee(String o, String g){
        origin = o;
        grade = g;
    }

    void roast(int d){
        System.out.println("roasting... " + origin);
        degreeOfRoast = d;
    }
    void grind(){
        System.out.println("grinding... degree of roast is " + degreeOfRoast);
    }
    void brew(){
        System.out.println("brewing...");
    }
}

public class TestCoffee {
    public static void main(String[] args) {
        Coffee brazilCoffee = new Coffee("Kenya", "AA");
        brazilCoffee.roast(1);
        brazilCoffee.grind();
        brazilCoffee.brew();
    }
}
