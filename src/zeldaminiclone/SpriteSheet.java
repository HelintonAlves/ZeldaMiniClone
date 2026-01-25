package zeldaminiclone;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class SpriteSheet {

    public static BufferedImage spritesheet;
    public static BufferedImage player_sprite;

    public SpriteSheet()  {
        try {
            spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        player_sprite = SpriteSheet.getSpritesheet(0,11,16,16);
    }

    public static BufferedImage getSpritesheet(int x, int y, int width, int height){
        return spritesheet.getSubimage(x,y,width,height);
    }

}
