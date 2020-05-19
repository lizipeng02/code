package mode.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehor quackBeahavior;

    public Duck() {//子类avi的构造函数中可以定义行为

    }
    //在本抽象类中已经自己实现了
    public void Quack() {
        System.out.println("~~嘎嘎嘎~~");
    }

    //由子类去实现
    public abstract void display();

    //在本抽象类中已经自己实现了
    public void swim() {
        System.out.println("~~我会游泳~~");
    }

    public void fly(FlyBehavior flyBehavior){

        this.flyBehavior = flyBehavior;
        flyBehavior.fly();
    }

    public void SetQuackBehavoir(QuackBehor quackBeahavior){
        this.quackBeahavior = quackBeahavior;
        quackBeahavior.quack();
    }


}
