package singlon.strategy;

import singlon.Strategy;

public class GreenDuck extends Duck {

    GreenDuck(){

    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }

}
