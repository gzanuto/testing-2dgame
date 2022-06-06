package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_WoodenDoorLeft extends Entity {
    
    public OBJ_WoodenDoorLeft(GamePanel gp) {

        super(gp);
        
        name = "Wooden Door Left";
        downr = setup("/objects/woodendoorleft");
        collision = true;
    }
    
}
