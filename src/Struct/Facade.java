package Struct;

/**
 * DesignMould
 * Created on:      2019-03-13 10:26
 * Original author: Nocturne
 */
public class Facade {
    public static void main(String[] args) {
        // 如果常规操作
        A a = new A();
        B b = new B();
        int need = a.getFirstPart() + b.getSecondPart();
        // 客户端需要了解子系统的对象细节和配合关系
        Face face = new Face();
        need = face.aInfer();
        // 上面两行就完成了调用，完全屏蔽了子系统的细节和变化
    }

}

// 假设子系统由A B 两个类构成

class A {
    public int getFirstPart() {
        return 1;
    }
}

class B {
    public int getSecondPart() {
        return 2;
    }
}

class Face {
    private A a;
    private B b;

    Face() {
        a = new A();
        b = new B();
    }

    public int aInfer() {
        int one = a.getFirstPart();
        int two = b.getSecondPart();
        return one + two;
    }
}
