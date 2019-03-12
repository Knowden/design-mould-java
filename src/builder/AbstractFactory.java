package builder;

/**
 * DesignMould
 * Created on:      2019-03-12 19:05
 * Original author: Nocturne
 */

/* 简单说一下我对这个名字的理解，我认为，这个名字表达的意思就是，工厂是抽象多态的，
* 以为抽象工厂的设计模式，每个工厂实现类都会提供一个大礼包，
* 意思就是一给一套，也是借用人家的用户界面的例子
* 所以从这个层面，客户代码在使用工厂的时候，就屏蔽了工厂本身的类型
* 不同于工厂方法需要考虑用哪个工厂，这里的每个工厂都是等价的，
* 只是提供了不同的套装
*/

public class AbstractFactory {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = new AppleFactory();
        deviceFactory.getPC();
        deviceFactory.getPhone();

        //我们可以任意切换套装
        deviceFactory = new HuaweiFactory();
        deviceFactory.getPhone();
        deviceFactory.getPC();
    }
}


abstract class DeviceFactory {
    public abstract void getPhone();
    public abstract void getPC();
}

class AppleFactory extends DeviceFactory {
    @Override
    public void getPhone() {
        System.out.println("iPhone");
    }

    @Override
    public void getPC() {
        System.out.println("MacBook");
    }
}

class HuaweiFactory extends DeviceFactory {
    @Override
    public void getPhone() {
        System.out.println("华为手机");
    }

    @Override
    public void getPC() {
        System.out.println("华为电脑");
    }
}