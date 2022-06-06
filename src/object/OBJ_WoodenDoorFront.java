package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_WoodenDoorFront extends Entity {
    
    public OBJ_WoodenDoorFront(GamePanel gp) {

        super(gp);
        
        name = "Wooden Door Front";
        downr = setup("/objects/woodendoorfront");
        collision = true;
    }
    
}
