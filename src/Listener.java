import java.util.Observable;
import java.util.Observer;


/**
 * DesignMould
 * Created on:      2019-03-18 18:48
 * Original author: Nocturne
 */
public class Listener {
    public static void main(String[] args) {
        FruitSender sender = new FruitSender();
        Ming shishenming = new Ming(sender);
        Uzi jianzihao = new Uzi(sender);
        sender.sendFruit();
    }
}

class FruitSender extends Observable{

    public void sendFruit() {
        setChanged();
        notifyObservers("HHH");
    }

}

class Ming implements Observer {
    private Observable observable;

    public Ming(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我是Ming");
        System.out.println("我收到了" + arg);
    }
}

class Uzi implements Observer {
    private Observable observable;

    public Uzi(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我是Uzi");
        System.out.println("我收到了" + arg);
    }
}

