package singlon.strategy;

import singlon.Strategy;

public class StoneDuck implements Strategy.FlyBehavior, Strategy.QuackBehor {

    @Override
    public void fly(){
        System.out.println("我不会飞");
    }

    @Override
    public void quack() {
        System.out.println("我不会叫");
    }

}
