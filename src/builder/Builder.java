package builder;

/**
 * DesignMould
 * Created on:      2019-03-12 19:38
 * Original author: Nocturne
 */
public class Builder {

    // 1. 选择Builder 实现类
    // 2. 构建Guider
    // 3. contract
}

abstract class AbsBuilder {
    public abstract void buildePartOne();
    public abstract void buildePartTwo();
    public abstract void buildAll();
    public abstract void getResult();
}

class ConBuilder extends AbsBuilder {
    @Override
    public void buildePartOne() {
        System.out.println("1");
    }

    @Override
    public void buildePartTwo() {
        System.out.println("2");
    }

    @Override
    public void buildAll() {
        System.out.println("all");
    }

    @Override
    public void getResult() {
        System.out.println("result");
    }
}

class Guider {
    private AbsBuilder builder;

    public Guider(AbsBuilder builde) {
        builder = builde;
    }
    public void contract() {
        builder.buildePartOne();
        builder.buildePartTwo();
        builder.buildAll();
        builder.getResult();
    }

}
