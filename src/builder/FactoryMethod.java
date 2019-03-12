package builder;

/**
 * DesignMould
 * Created on:      2019-03-12 17:13
 * Original author: Nocturne
 */
public class FactoryMethod {
    public static void main(String[] args) {
        String type = "balabala";
        // 通过配置文件 + 反射 我们可以根据type得到一个Factory
        CarFactory factory = new BusFactory();
        Car car = factory.getCar();
    }

}

abstract class CarFactory {
    public abstract Car getCar();
}

class JeepFactory extends CarFactory {
    @Override
    public Car getCar() {
        return new Jeep();
    }
}

class BusFactory extends CarFactory {
    @Override
    public Car getCar() {
        return new Bus();
    }
}
