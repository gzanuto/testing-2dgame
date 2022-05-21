package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_OpenChest extends SuperObject {
    
    public OBJ_OpenChest() {
        
        name = "Open Chest";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/openchest.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
        collision = true;
    }
    
}
