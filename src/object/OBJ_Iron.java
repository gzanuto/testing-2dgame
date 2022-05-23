package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;


public class OBJ_Iron extends SuperObject {
    
    GamePanel gp;
    
    public OBJ_Iron(GamePanel gp) {
        
        this.gp = gp;
        
        name = "Iron";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/iron.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
        collision = true;
    }
    
}
