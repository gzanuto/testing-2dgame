package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_WoodenDoorBack extends SuperObject {
    
    public OBJ_WoodenDoorBack() {
        
        name = "Wooden Door Back";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/woodendoorback.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
