class Student1{
    String name;
    double gpa;
    int incomeLevel;

    Student1(String name, double gpa, int incomeLevel){
        this.name=name;
        this.gpa=gpa;
        this.incomeLevel=incomeLevel;
    }

    String getName() {return name;}
    double getGPA() {return gpa;}
    int getIncomeLevel() {return incomeLevel;}
}

public class TestStudent {
    public static void main(String[] args) {
        Student1 s1 = new Student1("김규상", 4.1, 3);
        Student1 s2 = new Student1("김민재", 3.71, 5);
        Student1 s3 = new Student1("김용하", 3.93, 7);

        if(s1.getGPA() >= 3.5 && s1.getIncomeLevel() <=5){
            System.out.printf("%s학생은 장학생 후보입니다.\n", s1.getName());
        }
        if(s2.getGPA() >= 3.5 && s2.getIncomeLevel() <=5){
            System.out.printf("%s학생은 장학생 후보입니다.\n", s2.getName());
        }
        if(s3.getGPA() >= 3.5 && s3.getIncomeLevel() <=5){
            System.out.printf("%s학생은 장학생 후보입니다.\n", s3.getName());
        }
    }
}
