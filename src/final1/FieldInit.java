package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;

    // 인스턴스가 생성될 때마다 모든 인스턴스의 value는 10이다. 메모리 낭비와 같은 값만 계속 생성된다.
    // 차라리 static 영역에 두는 게 낫다 따라서 static을 붙이자.
    // final과 static을 붙여서 사용하는 것이 효과적이다.
    static final int value = 10;


    // 초기값이 있는 경우 생성자로도 할당 불가
//    public FieldInit(int value) {
//        this.value = value;
//
//    }


}
