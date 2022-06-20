import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {

    private final int size = 480;
    private final int dot_size = 16;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean  wp= false;
    private boolean down = false;
    private boolean inGame = true;
    public Game(){
        setBackground(Color.black);
        loadImages();
    }

    public void loadImages(){
        ImageIcon comApple = new ImageIcon("imageApple.png");
        apple = comApple.getImage();
        ImageIcon comDot = new ImageIcon("imageApple.png");
        dot = comDot.getImage();
    }
}
