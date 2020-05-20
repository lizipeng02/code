package mode.builderDemo;

//具体建造者：具体装修工人2
class ConcreteDecorator2 extends Decorator
{
    public void buildWall()
    {
        product.setWall("w2");
    }
}
