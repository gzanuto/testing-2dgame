package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;


public class OBJ_Gold extends SuperObject {
    
    GamePanel gp;
    
    public OBJ_Gold(GamePanel gp) {
        
        this.gp = gp;
        
        name = "Gold";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/gold.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
        collision = true;
    }
    
}
