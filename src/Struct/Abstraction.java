package Struct;

/**
 * DesignMould
 * Created on:      2019-03-12 22:34
 * Original author: Nocturne
 */

// 这个模式我不是很理解，所以在这里多写一些我仅有的认识
// 这个模式旨在当一个对象有多个可变因素的时候，可以将多个因素都分离出来，每个因素都单成一个类
// 然后每个类可以单独变化，只要保证对外接口不变，就不会影响其他类，保证了开闭原则
// 相比于通过继承，继承会将多个维度捆绑在一起，任何层次的变化都会影响整个父子类
// 而这种方式，每个维度都是自由变化的
// 感觉这个方式可能是我的默认习惯吧，所以觉不出什么特别的
public class Abstraction {

}

class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public void draw() {
        color.bepaint("shape");
    }
}


class Color {
    String string;

    public void bepaint(String shape) {
        System.out.println( shape + " be painted with" +  string);
    }
}
