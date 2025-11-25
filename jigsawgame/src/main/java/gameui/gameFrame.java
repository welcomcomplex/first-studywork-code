package gameui;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class gameFrame extends JFrame implements KeyListener {
    public gameFrame(){
        inintFrame();

        smallframe();

        initImage();
        this.setVisible(true);
    }
    int x = 0;
    int y = 0;
    private void initImage() {
        this.getContentPane().removeAll();
        ImageIcon idback = new ImageIcon("D:\\code\\idea Programs\\untitled\\jigsawgame\\src\\main\\java\\image\\background.png");
        JLabel jback = new JLabel(idback);
        jback.setBounds(40,40,508,560);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {



                ImageIcon all1 = new ImageIcon("D:\\code\\idea Programs\\untitled\\jigsawgame\\src\\main\\java\\image\\animal\\animal3\\"+brr[i][j]+".jpg");
                JLabel jl1 = new JLabel(all1);
                jl1.setBounds(j * 100+10, i * 100+20, 100, 100);
                this.getContentPane().add(jl1);

            }
        }
        this.getContentPane().add(jback);
        this.getContentPane().repaint();
    }

    private static void smallframe() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu fnjmenu= new JMenu("功能");
        JMenu abjmenu= new JMenu("关于我们");

        JMenuItem reit = new JMenuItem("重新游戏");
        JMenuItem relog = new JMenuItem("重新登录");
        JMenuItem closegame = new JMenuItem("关闭游戏");
        JMenuItem accitem = new JMenuItem("联系我们");

        fnjmenu.add(reit);
        fnjmenu.add(relog);
        fnjmenu.add(closegame);
        abjmenu.add(accitem);
    }
    int[][] brr = new int[4][4];
    private void inintFrame() {
        this.setSize(700,700);

        this.setTitle("拼图游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        int[] temp = new int[16];
        int s = 0;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i + 1;
        }
        Random r = new Random();
        for (int i = 0; i < temp.length; i++) {
            int randomIndex = r.nextInt(temp.length);
            s = temp[i];
            temp[i] = temp[randomIndex];
            temp[randomIndex] = s;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                brr[i][j] = temp[i * 4 + j];
                if(brr[i][j] == 16){
                    x = i;
                    y = j;
                }
            }

        }
        //取消居中放置
        this.setLayout(null);
        //键盘监听
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 38){
            upmove();
            System.out.println(code);
        }
    }

    private void upmove() {
        if(x > 0) {
            brr[x][y] = brr[x-1][y];
            brr[x-1][y] = 16;
            x -= 1;
            initImage();
        }
        System.out.println("up");
    }
}
