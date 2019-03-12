package builder;

/**
 * DesignMould
 * Created on:      2019-03-12 20:33
 * Original author: Nocturne
 */
public class Singleton {
    public static void main(String[] args) {
        Sing sing = Sing.getSing();
    }
}


class Sing {
    private static Sing sing; // 静态变量，使得静态方法可以访问

    private Sing() {}  // 防止用户通过 new 获得多个对象

    public static Sing getSing() {  //  提供自己的一个工厂方法来向全局提供仅有的一个对象
        if (sing == null) {
            sing = new Sing();
        }
        return sing;
    }

}