package mode.bridge2;

public class Client {

    public static void main(String[] args) {
        HandsetBrand ab;
        //使用A品牌手机
        ab = new HandsetBrandA();
        System.out.println("A品牌手机：");
        ab.setHandsetSoft(new HandsetGame());
        ab.run();
        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
        //分隔符
        System.out.println("---------------");
        //使用B品牌手机
        ab = new HandsetBrandB();
        System.out.println("B品牌手机：");
        ab.setHandsetSoft(new HandsetGame());
        ab.run();
        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
    }

}
