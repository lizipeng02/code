package mode.Prototype;

public class Main {
/*
*   浅copy无法copy对象里面其它对象的引用
* */
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*',new OtherObj("李紫鹏",18));
        MessageBox sbox = new MessageBox('/',new OtherObj("李紫鹏",18));
        manager.register("Strong message", underlinePen);
        manager.create("Strong message",false);
        manager.register("Waring Box", mbox);
        manager.create("Waring Box",true);
        manager.register("Slash Box", sbox);
    }

}
