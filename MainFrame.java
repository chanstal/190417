import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    int x=30,y=30;
    private Container cp;
    private JButton jbtnup = new JButton("上");
    private JButton jbtndown = new JButton("下");
    private JButton jbtnr = new JButton("左");
    private JButton jbtnl = new JButton("右");
    private JButton jbtnb = new JButton("放大");
    private JButton jbtns = new JButton("縮小");
    private JButton jbbbb = new JButton("離開");
    private JLabel  jlb=new JLabel();

    public MainFrame(){
        init();
        cp=this.getContentPane();
        cp.setLayout(null);
        jlb.setBackground(Color.cyan);
        jlb.setOpaque(true);
    }
    public void init(){
        cp = this.getContentPane();
        this.setSize(1000,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlb.setBounds(10,10,x,y);
        jbtnup.setBounds(200,300,80,25);
        jbtndown.setBounds(285,300,80,25);
        jbtnr.setBounds(370,300,80,25);
        jbtnl.setBounds(455,300,80,25);
        jbtnb.setBounds(540,300,80,25);
        jbtns.setBounds(625,300,80,25);
        jbbbb.setBounds(710,300,80,25);

        jbtnup.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlb.getX()-5+jlb.getWidth()<cp.getWidth()){
                    jlb.setLocation(jlb.getX(),jlb.getY()-5);
                }
            }
        });
        jbtndown.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlb.getX()-5+jlb.getWidth()<cp.getWidth()) {
                    jlb.setLocation(jlb.getX(), jlb.getY() + 5);
                }

            }
        });
        jbtnl.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlb.getX()+5+jlb.getWidth()<cp.getWidth()){
                    jlb.setLocation(jlb.getX()+5,jlb.getY());
                }
            }
        });
        jbtnr.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlb.getX()-5+jlb.getWidth()<cp.getWidth()){
                    jlb.setLocation(jlb.getX()-5,jlb.getY());
                }
            }
        });
        jbtnb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x+10;
                y=y+10;
                jlb.setBounds(jlb.getX(),jlb.getY(),x,y);

            }
        });
        jbtns.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x-10;
                y=y-10;
                jlb.setBounds(jlb.getX(),jlb.getY(),x,y);

            }
        });
        jbbbb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        cp.add(jlb);
        cp.add(jbtnup);
        cp.add(jbtndown);
        cp.add(jbtnl);
        cp.add(jbtnr);
        cp.add(jbtnb);
        cp.add(jbtns);
        cp.add(jbbbb);

    }
}
