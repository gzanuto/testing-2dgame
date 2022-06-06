package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_WoodenDoorRight extends Entity {
    
    public OBJ_WoodenDoorRight(GamePanel gp) {

        super(gp);
        
        name = "Wooden Door Right";
        downr = setup("/objects/woodendoorright");
        collision = true;
    }
    
}
