package singleton;

public class SingleObject {

    private static final SingleObject instance = new SingleObject();

    private final String name;

    // 생성자는 내부에서만 호출되게 한다.
    private SingleObject(){
        this.name = "test";
    }

    public String getName() {
        return name;
    }

    // 외부에서 객체를 받아갈 수 있는 방법은 getInstance() 가 유일하다.
    public static SingleObject getInstance() {
        return instance;
    }
}
