package mode.Prototype;

import java.util.HashMap;

/*
 * Manager类（Client）
 * Manager类使用Product接口来复制实例
 * */
public class Manager {
    //保存实例的“名字”和“实例”之间的对应关系
    private HashMap<String, Product> showcase = new HashMap<String, Product>();

    //register方法将接收到的一组“名字”和“Product接口”注册到showcase中。这里Product是实现Product接口的实例，具体还未确定
    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String productname,Boolean deep) {
        Product p = showcase.get(productname);
        return p.creatClone(deep);
    }
}
