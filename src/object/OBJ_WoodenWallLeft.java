package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_WoodenWallLeft extends SuperObject {
    
    public OBJ_WoodenWallLeft() {
        
        name = "Wooden Wall Left";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/woodenwallleft.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
