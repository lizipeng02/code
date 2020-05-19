package mode.strategy;

public class StoneDuck implements FlyBehavior, QuackBehor {

    @Override
    public void fly(){
        System.out.println("我不会飞");
    }

    @Override
    public void quack() {
        System.out.println("我不会叫");
    }

}
