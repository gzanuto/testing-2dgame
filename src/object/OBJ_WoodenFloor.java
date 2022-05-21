package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_WoodenFloor extends SuperObject {

public OBJ_WoodenFloor() {
        
        name = "Wooden Floor";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/woodenfloor.png"));
            
        }catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }
    
}
