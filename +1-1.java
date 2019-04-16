import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private Container cp;
    private int count = 0;
    private JButton jbtnAdd = new JButton("Add");
    private JButton jbtnSub = new JButton("Sub");
    private JLabel jlb=new JLabel();


    public MainFrame() {
        init();
       //cp = this.getContentPane();
        cp.setLayout(null);
    }

    private void init() {
        jlb.setText(Integer.toString(count));
        cp = this.getContentPane();
        this.setSize(600, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbtnAdd.setBounds(0,0,80,25);
        jbtnSub.setBounds(90,0,80,25);
        jlb.setBounds(50,50,225,225);
        jbtnAdd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                MainFrame.this.jlb.setText(Integer.toString(count));
            }
        });
        jbtnSub.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                MainFrame.this.jlb.setText(Integer.toString(count));
            }
        });

        cp.add(jbtnAdd);
        cp.add(jbtnSub);
        cp.add(jlb);
    }
}
