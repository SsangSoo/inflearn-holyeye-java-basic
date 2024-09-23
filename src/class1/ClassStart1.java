package class1;

/**
 * 학생의 이름과, 나이, 성적을 출력하는 것을 변수를 이용해서 출력해보자.
 */
public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grace = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grace = 80;

        String student3Name = "학생3";
        int student3Age = 17;
        int student3Grace = 80;

        System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성정:" + student1Grace);
        System.out.println("이름: " + student2Name + " 나이: " + student2Age + " 성정:" + student2Grace);
        System.out.println("이름: " + student3Name + " 나이: " + student3Age + " 성정:" + student3Grace);

    }
}
