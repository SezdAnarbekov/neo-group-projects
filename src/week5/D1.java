package week5;

/**
 * Created by syezdsultanov on 3/4/17.
 */
public interface D1 {
    void test();
    default void setColor(){
        System.out.println("fhj");

    }
    static void setka(){
        System.out.println("set");
    }


}
