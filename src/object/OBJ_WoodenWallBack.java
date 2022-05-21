package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_WoodenWallBack extends SuperObject {
    
    public OBJ_WoodenWallBack() {
        
        name = "Wooden Wall Back";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/woodenwallback.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
