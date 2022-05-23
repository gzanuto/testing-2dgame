package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;


public class OBJ_CraftingTable extends SuperObject {
    
    GamePanel gp;
    
    public OBJ_CraftingTable(GamePanel gp) {
        
        this.gp = gp;
        
        name = "Crafting Table";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/craftingtable.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
        collision = true;
    }
    
}
