package Struct;

import sun.rmi.rmic.iiop.InterfaceType;

import java.util.HashMap;

/**
 * DesignMould
 * Created on:      2019-03-13 09:20
 * Original author: Nocturne
 */

// 有点感觉了，这个东西叫做装饰者感觉更合适，就类似构建者
// 就是我有一个装饰器，你把你的东西给我，我的装饰器就给你一个强化的版本
// 比如有个装饰器叫"上漆"，你给我个毛坯房，经过我这个"上漆"装饰器，给你的就是上好漆的房子了

/*
再回到这个例子中，我们看到的仅仅是一个ConcreteComponent类。在复杂的大型项目中，同一级下的兄弟类通常有很多。
当你有五个甚至十个ConcreteComponent时，再想要为每个类都加上“ready？go！”的效果，就要写出五个子类了。
毫无疑问这是不合理的。装饰器模式在不影响各个ConcreteComponent核心价值的同时，添加了他特有的装饰效果，具备非常好的通用性，这也是他存在的最大价值。
 */
public class Decorator {
    public static void main(String[] args) {
        People worker = new Programmer();
        worker.work();
        worker = new Happy(worker);
        worker.work();
    }

}

interface People {
    public void work();
}

class Programmer implements People{
    public void work() {
        System.out.println("Programmer is coding");
    }
}

class Feel implements People {
    protected People people;

    public Feel(People people) {
        this.people = people;
    }

    @Override
    public void work() {
        people.work();
    }
}

class Happy extends Feel {
    public Happy(People people) {
        super(people);
    }

    @Override
    public void work() {
        System.out.println("Happily");
        super.work();
    }
}

// class Sad extends ...
