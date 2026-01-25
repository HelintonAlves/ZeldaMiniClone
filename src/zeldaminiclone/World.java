package zeldaminiclone;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class World {

    public static List<Blocks> block = new ArrayList<Blocks>();

    public World(){
        for (int xx = 0; xx < 15; xx++){
            block.add(new Blocks(xx*32,0));
        }
        for (int xx = 0; xx < 15; xx++){
            block.add(new Blocks(xx*32,480-32));
        }
        for (int yy = 0; yy < 15; yy++){
            block.add(new Blocks(0,yy*32));
        }
        for (int yy = 0; yy < 15; yy++){
            block.add(new Blocks(480-32,yy*32));
        }
    }

    public static boolean isFree(int x, int y){
        for (int i = 0; i < block.size(); i++){
            Blocks blockActual = block.get(i);
            if (blockActual.intersects(new Rectangle(x,y,32,32))){
                return false;
            }

        }

        return true;
    }

    public void render(Graphics g){
        for(int i = 0; i < block.size(); i++){
            block.get(i).render(g);
        }

    }
}
