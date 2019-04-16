import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private Container cp;
    private JButton jbtnA = new JButton("Apply");
    private JButton jbtnB = new JButton("EXIT");
    private JLabel jlb1=new JLabel("Red");
    private JLabel jlb2=new JLabel("Green");
    private JLabel jlb3=new JLabel("Yellow");
    private TextField tf=new TextField();
    private TextField tf1=new TextField();
    private TextField tf2=new TextField();


    public MainFrame(){
        init();
        cp.setLayout(null);

jlb1.setBounds(250,250,80,25);
jlb2.setBounds(340,250,80,25);
jlb3.setBounds(430,250,80,25);
tf.setBounds(250,280,80,25);
tf1.setBounds(340,280,80,25);
tf2.setBounds(430,280,80,25);
jbtnA.setBounds(295,310,80,25);
jbtnB.setBounds(385,310,80,25);
    }
    private void init(){
        this.setSize(600,550);
        cp=this.getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


       jbtnA.addActionListener(new AbstractAction() {
            @Override
           public void actionPerformed(ActionEvent e) {
                int r=Math.round(Float.parseFloat(tf.getText()));
                int g=Math.round(Float.parseFloat(tf1.getText()));
                int b=Math.round(Float.parseFloat(tf2.getText()));
                tf.setText(Integer.toString(r));
                tf1.setText(Integer.toString(g));
                tf2.setText(Integer.toString(b));
                 cp.setBackground(new Color(r,g,b));
       }
        });


        jbtnB.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }


        });




        cp.add(jlb1);
        cp.add(jlb2);
        cp.add(jlb3);
        cp.add(tf);
        cp.add(tf1);
        cp.add(tf2);
        cp.add(jbtnA);
        cp.add(jbtnB);
    }
}
