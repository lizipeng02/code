package thread.demo2;


/**
 * 和尚
 */
class Monk extends Thread{
    private String monkName ;
    private Basket basket ;

    //最少一个馒头
    public static int MIN = 1 ;
    //最多4个馒头
    public static int MAX = 4 ;

    //吃的馒头数
    public int count ;


    public Monk(Basket basket , String monkName){
        this.basket = basket ;
        this.monkName = monkName ;
    }

    public void run() {
        while(true){
            int no = basket.getBread(this);
            if(no == -1){
                break ;
            } else{
                count ++ ;
                System.out.println(monkName + "吃了编号为[" + no + "]的馒头");
            }
        }
        System.out.println(monkName + "吃了" + count + "个馒头");
    }
}
