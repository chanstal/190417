import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    private Container cp;
    private JButton jbtnA = new JButton("EXIT");
    private JButton jbtnB = new JButton("評定");
    private JLabel jlb=new JLabel("成績");
    private TextField tf=new TextField();
    private JLabel jlbb=new JLabel();


    public MainFrame() {
        init();
        cp.setLayout(null);
    }

    private void init() {
        cp = this.getContentPane();
        this.setSize(600, 500);
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbtnA.setBounds(360, 250, 80, 25);
        jbtnB.setBounds(250, 250, 80, 25);
        jlb.setBounds(200, 200, 80, 25);
        tf.setBounds(300, 200, 80, 25);
        jlbb.setBounds(400, 200, 80, 25);
        jbtnB.addActionListener(new AbstractAction() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                      int v1=Math.round(Float.parseFloat(tf.getText()));
                                      if (90<=v1&&v1<=100){
                                          jlbb.setText("A");
                                      }
                                      else if (80<=v1&&v1<=89){
                                          jlbb.setText("B");
                                      }
                                      else if (70<=v1&&v1<=79){
                                          jlbb.setText("C");
                                      }
                                      else if (60<=v1&&v1<=69){
                                          jlbb.setText("D");
                                      }
                                      else if (v1<60){
                                          jlbb.setText("E");
                                      }

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
        cp.add(jlb);
        cp.add(jlbb);
        cp.add(tf);
    }}
