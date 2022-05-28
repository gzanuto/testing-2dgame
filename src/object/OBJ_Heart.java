package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;


public class OBJ_Heart extends SuperObject {
    
    GamePanel gp;
    
    public OBJ_Heart(GamePanel gp) {
        
        this.gp = gp;
        
        name = "Corpse";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/fulllife.png"));
            image2 = ImageIO.read(getClass().getResourceAsStream("/objects/halflife.png"));
            image3 = ImageIO.read(getClass().getResourceAsStream("/objects/nolife.png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            image2 = uTool.scaleImage(image2, gp.tileSize, gp.tileSize);
            image3 =uTool.scaleImage(image3, gp.tileSize, gp.tileSize);
            
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
}
