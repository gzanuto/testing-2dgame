package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_WoodenDoorLeft extends SuperObject {
    
    public OBJ_WoodenDoorLeft() {
        
        name = "Wooden Door Left";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/woodendoorleft.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
