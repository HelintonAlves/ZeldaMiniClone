package zeldaminiclone;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{

    public static int WIDTH = 480, HEIGHT = 480;


    public Game(){
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }

    public void tick(){

    }

    public void render(){

        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        //Clean window
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        //Render player
        g.setColor(Color.red);
        g.fillRect(10, 10, 100, 100);

        bs.show();
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
            tick();
            render();
            try {
                Thread.sleep(1000/60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
