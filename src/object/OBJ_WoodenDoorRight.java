
package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_WoodenDoorRight extends SuperObject {
    
    public OBJ_WoodenDoorRight() {
        
        name = "Wooden Door Right";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/woodendoorright.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
