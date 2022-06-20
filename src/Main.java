import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(480,480);
        setLocation(400,400);
        add(new Game());
        setVisible(true);
    }

    public static void main (String[] args){
        Main mainWindow = new Main();
    }
}