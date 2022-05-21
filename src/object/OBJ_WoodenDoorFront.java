package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_WoodenDoorFront extends SuperObject {
    
    public OBJ_WoodenDoorFront() {
        
        name = "Wooden Door Front";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/woodendoorfront.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
