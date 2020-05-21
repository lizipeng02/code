package mode.Prototype;

/*
 * UnderlinePen类（ConcreteProtorype）
 * */
public class UnderlinePen implements Product {

    private char ulchar;
    private OtherObj otherObj;


    public OtherObj getOtherObj() {
        return otherObj;
    }

    public void setOtherObj(OtherObj otherObj) {
        this.otherObj = otherObj;
    }

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length + 2; i++) {
            System.out.print(ulchar);

        }
        System.out.println("");
    }

    //该方法用于复制自己
    @Override
    public Product creatClone(Boolean deep) {
        Product p = null;
        try {
            UnderlinePen u = (UnderlinePen) clone();
            if (!deep) {
                p = (Product) u;
            } else {
                OtherObj oo = (OtherObj) otherObj.clone();
                u.setOtherObj(oo);
            }
            System.out.println(u == this);
            System.out.println(u.otherObj == otherObj);
            System.out.println(this.otherObj);
            System.out.println(u.otherObj);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}

