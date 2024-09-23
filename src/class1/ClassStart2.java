package class1;

/**
 * classStart1의 중복되는 내용을 배열로 합쳐보자.
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15,16,17,20};
        int[] studentGraces = {90, 80, 80, 60};
        for(int i=0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성정:" + studentGraces[i]);
        }
    }
}
