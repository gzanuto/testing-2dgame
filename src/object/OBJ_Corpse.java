package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;


public class OBJ_Corpse extends SuperObject {
    
    GamePanel gp;
    
    public OBJ_Corpse(GamePanel gp) {
        
        this.gp = gp;
        
        name = "Corpse";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/corpse.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
