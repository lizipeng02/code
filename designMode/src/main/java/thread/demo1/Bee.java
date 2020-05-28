package thread.demo1;


import java.util.Random;

/*
 * 蜜蜂
 * */
public class Bee extends Thread {
    private String beeName;
    private Box box;

    public Bee(String name, Box box) {
        this.beeName = name;
        this.box = box;
    }

    public void run() {
        Random r = new Random();
        while (true) {
            int production = r.nextInt(5) + 1;
            box.add(production);
        }
    }

}

