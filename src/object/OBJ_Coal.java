package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;


public class OBJ_Coal extends SuperObject {
    
    GamePanel gp;
    
    public OBJ_Coal(GamePanel gp) {
        
        this.gp = gp;
        
        name = "Coal";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/coal.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
        collision = true;
    }
    
}
