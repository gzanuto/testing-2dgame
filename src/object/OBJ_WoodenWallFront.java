package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_WoodenWallFront extends SuperObject {
    
    public OBJ_WoodenWallFront() {
        
        name = "Wooden Wall Front";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/woodenwallfront.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
