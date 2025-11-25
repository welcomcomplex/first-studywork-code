import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myframetext extends JFrame implements ActionListener{
    public myframetext(){
    this.setSize(400,400);
    this.setTitle("拼图登录");
    this.setAlwaysOnTop(true);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(3);
    this.setVisible(true);

    thingtouchu();
}
    JButton jb1 = new JButton("touchu me");
    private void thingtouchu() {

        jb1.setBounds(0,0,150,150);
        jb1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object jc = e.getSource();
        if(jb1 == jc){
            jb1.setSize(200,200);
        }
    }
}
