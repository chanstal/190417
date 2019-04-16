import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class MainFrame extends JFrame {
  int a,b,c,d,g,f;
    private Container cp;
    private JButton jbtnA = new JButton("結束");
    private JButton jbtnB = new JButton("重新產生");
    private JLabel jlbb=new JLabel();
    private JLabel jlbb1=new JLabel();
    private JLabel jlbb2=new JLabel();
    private JLabel jlbb3=new JLabel();
    private JLabel jlbb4=new JLabel();
    private JLabel jlbb5=new JLabel();
    private Random rand=new Random();



    public MainFrame() {
        init();
        cp = this.getContentPane();
        cp.setLayout(null);
    }

    private void init() {
        cp = this.getContentPane();
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbtnA.setBounds(360, 250, 80, 25);
        jbtnB.setBounds(250, 250, 80, 25);
        jlbb.setBounds(400, 200, 80, 25);
        jlbb1.setBounds(485, 200, 80, 25);
        jlbb2.setBounds(570, 200, 80, 25);
        jlbb3.setBounds(655, 200, 80, 25);
        jlbb4.setBounds(740, 200, 80, 25);
        jlbb5.setBounds(825, 200, 80, 25);


        jbtnB.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=rand.nextInt(42);
                b=rand.nextInt(42);
                c=rand.nextInt(42);
                d=rand.nextInt(42);
                g=rand.nextInt(42);
                f=rand.nextInt(42);
                jlbb.setText(Integer.toString(a));
                jlbb1.setText(Integer.toString(b));
                jlbb2.setText(Integer.toString(c));
                jlbb3.setText(Integer.toString(d));
                jlbb4.setText(Integer.toString(g));
                jlbb5.setText(Integer.toString(f));

            }
        });
jbtnA.addActionListener(new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {

        System.exit(0);
    }
});



        cp.add(jbtnA);
        cp.add(jbtnB);
        cp.add(jlbb);
        cp.add(jlbb1);
        cp.add(jlbb2);
        cp.add(jlbb3);
        cp.add(jlbb4);
        cp.add(jlbb5);

    }}