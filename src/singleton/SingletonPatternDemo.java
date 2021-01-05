package singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        System.out.println(object.getName());
    }

}
