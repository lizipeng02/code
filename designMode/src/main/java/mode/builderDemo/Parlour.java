package mode.builderDemo;

import mode.staticProxy.Image;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

//产品：客厅
class Parlour {
    private String wall;    //墙

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void show() {
        JFrame jf = new JFrame("建造者模式测试");
        Container contentPane = jf.getContentPane();
        JPanel p = new JPanel();
        JScrollPane sp = new JScrollPane(p);
        String parlour = wall;
        Icon image = new ImageIcon(this.getClass().getResource("/" + parlour + ".jpg"));
        JLabel l = new JLabel(image);
        p.setLayout(new GridLayout(1, 1));
        p.setBorder(BorderFactory.createTitledBorder("美女"));
        p.add(l);
        contentPane.add(sp, BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
