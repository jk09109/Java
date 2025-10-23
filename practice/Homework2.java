import java.util.Scanner;

class Student{
    int id;
    String name;
    String major;
    int tel;

    void setID(int i) {this.id=i;}
    void setMajor(String m) {this.major=m;}
    void setName(String n){ this.name = n;}
    void setTel(int t) {this.tel = t;}

    int getID(){return id;}
    String getName() {return name;}
    String getMajor() {return major;}
    String getTel() {
        String strtel = "0" + Integer.toString(tel);
        return strtel.substring(0,3) + '-' + strtel.substring(3,7) + '-' + strtel.substring(7,11);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_STUDENT = 3;
        Student[] student = new Student[NUM_STUDENT];

        for (int i=0;i<NUM_STUDENT;i++){
            student[i] = new Student();

            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            student[i].setID(sc.nextInt());
            student[i].setName(sc.next());
            student[i].setMajor(sc.next());
            student[i].setTel(sc.nextInt());
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for(int i=0;i<NUM_STUDENT;i++){
            System.out.printf("%d번째 학생:", i+1);
            System.out.print(" " + student[i].getID());
            System.out.print(" " + student[i].getName());
            System.out.print(" " + student[i].getMajor());
            System.out.print(" " + student[i].getTel());
        }
    }
}
