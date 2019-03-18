/**
 * DesignMould
 * Created on:      2019-03-18 19:02
 * Original author: Nocturne
 */
public class DecoraterMoudle {
    public static void main(String[] args) {
        Drink coffee = new Coffee(DrinkSize.GRANDE);
        coffee = new SugerAdder(coffee);
        coffee = new SugerAdder(coffee);
        coffee = new SalaAdder(coffee);
        coffee.introduce();
        System.out.println(coffee.cost());
    }
}

enum DrinkSize {
    VENTI, GRANDE, TALL
}

abstract class Drink {
    String info = "I know Nothing!";

    DrinkSize size;

    public abstract double cost();

    public void introduce() {
        System.out.println(info);
    }
}

abstract class Decorater extends Drink {
    Drink drink;

    Decorater(Drink drink) {
        this.drink = drink;
    }

    public abstract double cost();

    public void introduce() {
        drink.introduce();
    }
}

class Coffee extends Drink {

    Coffee(DrinkSize size) {
        info = "I'm Coffee!";
        this.size = size;
    }

    @Override
    public double cost() {
        return 5.5;
    }
}

class Juice extends Drink{

    public Juice(DrinkSize size) {
        info = "I'm Juice!";
        this.size = size;
    }

    @Override
    public double cost() {
        return 3.5;
    }

}

class SugerAdder extends Decorater {

    SugerAdder(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return 0.5 + drink.cost();
    }
}

class SalaAdder extends Decorater {

    SalaAdder(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return 1 + drink.cost();
    }
}

