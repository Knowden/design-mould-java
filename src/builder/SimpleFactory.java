package builder;

/**
 * DesignMould
 * Created on:      2019-03-12 16:53
 * Original author: Nocturne
 */

public class SimpleFactory {
    public Car getCar(String factor) {
        if (factor.equals("我要带人")) {
            return new Bus();
        }
        else if (factor.equals("我要越野")) {
            return new Jeep();
        }
        return null;
    }
}

abstract class Car {
    public abstract void say();
}

class Bus extends Car {
    @Override
    public void say() {
        System.out.println("I am Bus");
    }
}

class Jeep extends Car {
    @Override
    public void say() {
        System.out.println("I am Jeep");
    }
}

// And So on ...
