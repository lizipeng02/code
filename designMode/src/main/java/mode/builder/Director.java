package mode.builder;
/*
* 指挥者：调用建造者中的方法完成复杂对象的创建
* 一个产品可能会有多种建造方式，协调是哪个构造者以哪种方式来构造参评
* */
class Director
{
    private Builder builder;
    public Director(Builder builder)
    {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct()
    {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
