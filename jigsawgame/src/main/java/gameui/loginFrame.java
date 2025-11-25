package gameui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class loginFrame extends JFrame{
    public loginFrame(){
        this.setSize(400,400);
        this.setTitle("拼图登录");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);

        thingtouchu();
    }

    private void thingtouchu() {
    JButton jb1 = new JButton("touchu me");
    jb1.setBounds(0,0,150,150);
    jb1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            super.mouseMoved(e);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            super.mouseExited(e);
        }

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            super.mouseWheelMoved(e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            super.mouseEntered(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
        }
    });
    }

}
