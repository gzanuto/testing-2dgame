package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_WoodenWallRight extends SuperObject {
    
    public OBJ_WoodenWallRight() {
        
        name = "Wooden Wall Right";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/woodenwallright.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
