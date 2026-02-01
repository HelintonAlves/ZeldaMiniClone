package zeldaminiclone;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteSheet {

    public static BufferedImage spritesheet;
    public static BufferedImage[] player_sprite;
    public static BufferedImage[] inimigo_sprite;
    public static BufferedImage titleWall;

    public SpriteSheet() {
        try {
            spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        player_sprite = new BufferedImage[2];
        player_sprite[0] = SpriteSheet.getSpritesheet(0, 11, 16, 16);
        player_sprite[1] = SpriteSheet.getSpritesheet(16, 11, 16, 16);
        titleWall = SpriteSheet.getSpritesheet(281, 240, 16, 16);

        inimigo_sprite = new BufferedImage[2];
        inimigo_sprite[0] = SpriteSheet.getSpritesheet(280, 218, 16, 16);
        inimigo_sprite[1] = SpriteSheet.getSpritesheet(299, 218, 16, 16);
    }

    public static BufferedImage getSpritesheet(int x, int y, int width, int height) {
        return spritesheet.getSubimage(x, y, width, height);
    }

}
