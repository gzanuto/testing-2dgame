package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;


public class OBJ_Stone extends SuperObject {
    
    GamePanel gp;
    
    public OBJ_Stone(GamePanel gp) {
        
        this.gp = gp;
        
        name = "Stone";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/stone.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
        collision = true;
    }
    
}
