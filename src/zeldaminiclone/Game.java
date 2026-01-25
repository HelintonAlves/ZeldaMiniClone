package zeldaminiclone;

import javax.swing.*;
import java.awt.*;

public class Game extends Canvas implements Runnable{

    public static int WIDTH = 480, HEIGHT = 480;


    public Game(){
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }


    public static void main(String[] args) {
        Game game = new Game();
        JFrame windowsGame = new JFrame();

        windowsGame.add(game);
        windowsGame.setTitle("Zelda Mini Clone");
        windowsGame.pack();
        windowsGame.setLocationRelativeTo(null);

        windowsGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowsGame.setVisible(true);

        new Thread(game).start();
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Chamando game loop");
        }

    }
}
