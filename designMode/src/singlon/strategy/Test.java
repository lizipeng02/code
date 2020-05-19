package singlon.strategy;


public class Test {
    public static void main(String[] args) {
        Duck greenDuck = new GreenDuck() {
            @Override
            public void display() {
                System.out.println("我是绿色的鸭子");
            }
        };

        greenDuck.SetQuackBehavoir(new QuackBehor() {
            @Override
            public void quack() {
                System.out.println("我不会叫");
            }
        });

        greenDuck.fly(new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("我也不会飞");
            }
        });
        greenDuck.display();

    }
}
