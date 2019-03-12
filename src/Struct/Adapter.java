package Struct;

/**
 * DesignMould
 * Created on:      2019-03-12 21:01
 * Original author: Nocturne
 */


// 个人感觉就跟转接头差不多，把人家给的你不习惯的换成你的定义方式
// Clean-Code 中说的解决边界问题的方法，跟这个模式类似，也是在外部包和自身代码之间加一个缓冲层
// 保证无论外部包怎么变，这个抽象层对内的接口是不变的，变化的影响控制在了抽象层

public class Adapter {

    public static void main(String[] args) {
        Tiger tiger = new Adapetr();
        tiger.alreadyHavedFunc();
        // 之后 tiger 就可以跟之前一样正常使用，跟没有Adptee这回事一样，使外来者处于完全透明的状态
    }

}

class Tiger {
    public void alreadyHavedFunc() {

    }

}

class Adapetr extends Tiger {
    private Adaptee adaptee;

    public Adapetr() {
        adaptee = new Adaptee();
    }

    @Override
    public void alreadyHavedFunc() {
        adaptee.badName();
    }
}

class Adaptee {

    public void badName() {
        System.out.println("我的名字好烂啊");
    }
}
