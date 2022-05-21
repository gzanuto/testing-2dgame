package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_CraftingTable extends SuperObject {
    
    public OBJ_CraftingTable() {
        
        name = "Crafting Table";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/craftingtable.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
