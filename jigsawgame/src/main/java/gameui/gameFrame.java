package gameui;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class gameFrame extends JFrame implements KeyListener {
    public gameFrame(){
        initFrame();

        initMenuBar();

        initImage();
        this.setVisible(true);
    }
    
    int x = 0;
    int y = 0;
    
    private void initImage() {
        this.getContentPane().removeAll();
        
        // Add step count label
        JLabel scount = new JLabel("Steps: " + step);
        scount.setBounds(580, 40, 100, 20);
        this.getContentPane().add(scount);

        // Add puzzle pieces
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ImageIcon icon = new ImageIcon("D:\\code\\idea Programs\\untitled\\jigsawgame\\src\\main\\java\\image\\animal\\animal3\\" + brr[i][j] + ".jpg");
                JLabel label = new JLabel(icon);
                label.setBounds(j * 100 + 40, i * 100 + 40, 100, 100);
                this.getContentPane().add(label);
            }
        }
        
        // Add background
        ImageIcon background = new ImageIcon("D:\\code\\idea Programs\\untitled\\jigsawgame\\src\\main\\java\\image\\background.png");
        JLabel bgLabel = new JLabel(background);
        bgLabel.setBounds(40, 40, 400, 400);
        this.getContentPane().add(bgLabel);
        
        this.getContentPane().repaint();
    }
    
    int step = 0;
    
    private void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu functionMenu = new JMenu("Function");
        JMenu aboutMenu = new JMenu("About Us");

        JMenuItem restartItem = new JMenuItem("Restart Game");
        JMenuItem reloginItem = new JMenuItem("Relogin");
        JMenuItem closeItem = new JMenuItem("Close Game");
        JMenuItem contactItem = new JMenuItem("Contact Us");

        functionMenu.add(restartItem);
        functionMenu.add(reloginItem);
        functionMenu.add(closeItem);
        aboutMenu.add(contactItem);

        menuBar.add(functionMenu);
        menuBar.add(aboutMenu);
        this.setJMenuBar(menuBar);
    }
    
    int[][] brr = new int[4][4];
    
    private void shuffleArray() {
        int[] temp = new int[16];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i + 1;
        }
        
        Random r = new Random();
        for (int i = 0; i < temp.length; i++) {
            int randomIndex = r.nextInt(temp.length);
            int s = temp[i];
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
    }
    
    private void initFrame() {
        this.setSize(700, 700);
        this.setTitle("Puzzle Game");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        
        shuffleArray();
        
        // Cancel center layout
        this.setLayout(null);
        // Keyboard listener
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){ // A key
            this.getContentPane().removeAll();
            
            // Show complete image
            ImageIcon completeImage = new ImageIcon("D:\\code\\idea Programs\\untitled\\jigsawgame\\src\\main\\java\\image\\animal\\animal3\\all.jpg");
            JLabel completeLabel = new JLabel(completeImage);
            completeLabel.setBounds(40, 40, 400, 400);
            this.getContentPane().add(completeLabel);
            
            // Add background
            ImageIcon background = new ImageIcon("D:\\code\\idea Programs\\untitled\\jigsawgame\\src\\main\\java\\image\\background.png");
            JLabel bgLabel = new JLabel(background);
            bgLabel.setBounds(40, 40, 400, 400);
            this.getContentPane().add(bgLabel);
            
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        switch(code) {
            case 38: // Up arrow
                moveUp();
                break;
            case 40: // Down arrow
                moveDown();
                break;
            case 37: // Left arrow
                moveLeft();
                break;
            case 39: // Right arrow
                moveRight();
                break;
            case 65: // A key
                initImage();
                break;
        }
    }

    private void moveUp() {
        if(x > 0) {
            brr[x][y] = brr[x-1][y];
            brr[x-1][y] = 16;
            x -= 1;
            step++;
            initImage();
        }
    }
    
    private void moveDown() {
        if(x < 3) {
            brr[x][y] = brr[x+1][y];
            brr[x+1][y] = 16;
            x += 1;
            step++;
            initImage();
        }
    }
    
    private void moveLeft() {
        if(y > 0) {
            brr[x][y] = brr[x][y-1];
            brr[x][y-1] = 16;
            y -= 1;
            step++;
            initImage();
        }
    }
    
    private void moveRight() {
        if(y < 3) {
            brr[x][y] = brr[x][y+1];
            brr[x][y+1] = 16;
            y += 1;
            step++;
            initImage();
        }
    }
}
